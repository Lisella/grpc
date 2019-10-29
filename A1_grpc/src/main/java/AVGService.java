
import com.aufgabe.grpc.*;
import com.aufgabe.grpc.AVGGrpc.AVGImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

public class AVGServer {
    private final int port;
    private final Server server;

    public AVGServer(int port) throws IOException {
        this(port, AVGUtil.getDefaultInvoiceFile());
    }

    public AVGServer(int port, URL invoicefile) throws IOException {
        this(ServerBuilder.forPort(port), port, AVGUtil.parseInvoices(invoicefile));
    }

    public AVGServer(ServerBuilder<?> serverBuilder, int port, Collection<Invoice> invoices) {
        this.port = port;
        server = serverBuilder.addService(new AVGService(invoices))
                .build();
    }

    public void start() throws IOException {
        server.start();
        System.out.println("Server started on " + port + ", which is pretty cool I guess.");
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("Shutting down grpc AVG Server since JVM is shutting down");
                AVGServer.this.stop();
                System.err.println("Server shut down, RIP.");
            }
        });
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws Exception {
        AVGServer server = new AVGServer(9090);
        server.start();
        server.blockUntilShutdown();
    }


    private static class AVGService extends AVGGrpc.AVGImplBase {

        @Override
        public void createInvoice(Invoice request, StreamObserver<Msg> responseObserver) {
            responseObserver.onNext(checkInvoice(request));
            responseObserver.onCompleted();
        }

        private Msg checkInvoice(Invoice request) throws NullPointerException {
            try {
                if (request.getClientId() != null && request.getProduct() != null) {
                    invoices.add(Invoice.newBuilder().setClientId(request.getClientId())
                            .setProduct(request.getProduct())
                            .setNumber(request.getNumber())
                            .build());

                    return Msg.newBuilder().setMsg("Invoice from client: " + request.getClientId() +
                            " for the Product: " + request.getProduct().getName() +
                            " with the number: " + request.getNumber() +
                            "  has been created.")
                            .build();
                } else {
                    throw new NullPointerException();
                }
            } catch (NullPointerException npe) {
                System.out.println(npe + "UNKNOWN CLIENTID OR PRODUCT! Failed to create Invoice.");
            }
            return null;
        }

        @Override
        public void findInvoiceById(ClientId request, StreamObserver<Invoice> responseObserver) {
            responseObserver.onNext(checkId(request));
            responseObserver.onCompleted();
        }

        private Invoice checkId(ClientId request) throws NullPointerException {
            try {
                if (request != null) {
                    for (Invoice invoice : invoices) {
                        if (invoice.getClientId().equals(request.getClientId())) {
                            return invoice;
                        }
                    }
                } else {
                    throw new NullPointerException();
                }
            } catch (NullPointerException npe) {
                System.out.println(npe + "INVALID CLIENTID !");
            }
            return null;
        }

        @Override
        public void getVolumeOfSales(Product request, StreamObserver<SalesVolume> responseObserver) {
            responseObserver.onNext(checkProductSV(request));
            responseObserver.onCompleted();
        }

        private SalesVolume checkProductSV(Product request) {
            try {
                if (request.getId() != 0 && request.getName() != null) {
                    float amount = 0.0f;
                    for (Product product : products) {
                        if (product.getId() == request.getId() || product.getName() == request.getName()) {
                            amount += product.getSalesVolume();
                        }
                    }
                    return SalesVolume.newBuilder().setAmount(amount).build();
                } else {
                    throw new Exception("UNKNOWN PRODUCT !");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return null;
        }

        ArrayList<Invoice> invoices = new ArrayList<>();

        {
            invoices.add(Invoice.newBuilder().setClientId("C1")
                    .setProduct(Product.newBuilder().setName("Produkt1")
                            .setId(1)
                            .setSalesVolume(15)
                            .build())
                    .build());
            invoices.add(Invoice.newBuilder().setClientId("C2")
                    .setProduct(Product.newBuilder().setName("Produkt2")
                            .setId(2)
                            .setSalesVolume(10)
                            .build())
                    .build());
            invoices.add(Invoice.newBuilder().setClientId("C3")
                    .setProduct(Product.newBuilder().setName("Produkt3")
                            .setId(3)
                            .setSalesVolume(77)
                            .build())
                    .build());
        }

        ArrayList<Product> products = new ArrayList<>();

        {
            for (Invoice invoice : invoices) {
                products.add(invoice.getProduct());
            }
        }
    }
}

