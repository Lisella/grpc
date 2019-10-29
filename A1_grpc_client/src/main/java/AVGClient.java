
import com.aufgabe.grpc.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AVGClient {
    private final ManagedChannel channel;
    final AVGGrpc.AVGBlockingStub stub;
    public AVGClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
    }

    public AVGClient(ManagedChannelBuilder<?> channelBuilder) {
        channel = channelBuilder.build();
        stub = AVGGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void findInvoiceById(ClientId clientId){

        ClientId request = ClientId.newBuilder().setClientId(clientId.getClientId()).build();

        Invoice invoice;
        try {
            invoice = stub.findInvoiceById(request);
        }
        catch(StatusRuntimeException e) {
            System.out.println(e.getStatus());
        }
    }

    public  void getVolumeofSales(Product product) {

        Product request = Product.newBuilder().setName(product.getName())
                                              .setId(product.getId()).setSalesVolume(product.getSalesVolume()).build();

        SalesVolume salesVolume;
        try{
            salesVolume = stub.getVolumeOfSales(request);
        }
        catch (StatusRuntimeException e) {
            System.out.println(e.getStatus());
        }
    }

    public void createInvoice(Invoice invoice) {

        Invoice request = Invoice.newBuilder().setClientId(invoice.getClientId()).setProduct(invoice.getProduct())
                                              .setNumber(invoice.getNumber()).build();

        Msg msg;
        try {
            msg = stub.createInvoice(request);
        }
        catch(StatusRuntimeException e) {
            System.out.println(e.getStatus());
        }
    }

    public static void main(String[] args) throws InterruptedException {

        AVGClient client = new AVGClient("localhost", 9090);
        try {
            client.createInvoice(Invoice.newBuilder().setClientId("C7")
                                                     .setProduct(Product.newBuilder().setId(21)
                                                                                     .setName("Produkt21")
                                                                                     .setSalesVolume(9)
                                                                                     .build())
                                                     .setNumber(38)
                                        .build());

            client.findInvoiceById(ClientId.newBuilder().setClientId("C2").build());

            client.getVolumeofSales(Product.newBuilder().setName("Produkt2").setId(2).build());

        }
        finally {
            client.shutdown();
        }
    }
}
