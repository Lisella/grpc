package com.aufgabe.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import java.util.ArrayList;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: InvoiceService.proto")
public final class AVGGrpc {

  private AVGGrpc() {}

  public static final String SERVICE_NAME = "AVG";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aufgabe.grpc.ClientId,
      com.aufgabe.grpc.Invoice> getFindInvoiceByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindInvoiceById",
      requestType = com.aufgabe.grpc.ClientId.class,
      responseType = com.aufgabe.grpc.Invoice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aufgabe.grpc.ClientId,
      com.aufgabe.grpc.Invoice> getFindInvoiceByIdMethod() {
    io.grpc.MethodDescriptor<com.aufgabe.grpc.ClientId, com.aufgabe.grpc.Invoice> getFindInvoiceByIdMethod;
    if ((getFindInvoiceByIdMethod = AVGGrpc.getFindInvoiceByIdMethod) == null) {
      synchronized (AVGGrpc.class) {
        if ((getFindInvoiceByIdMethod = AVGGrpc.getFindInvoiceByIdMethod) == null) {
          AVGGrpc.getFindInvoiceByIdMethod = getFindInvoiceByIdMethod =
              io.grpc.MethodDescriptor.<com.aufgabe.grpc.ClientId, com.aufgabe.grpc.Invoice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindInvoiceById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aufgabe.grpc.ClientId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aufgabe.grpc.Invoice.getDefaultInstance()))
              .setSchemaDescriptor(new AVGMethodDescriptorSupplier("FindInvoiceById"))
              .build();
        }
      }
    }
    return getFindInvoiceByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aufgabe.grpc.Product,
      com.aufgabe.grpc.SalesVolume> getGetVolumeOfSalesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVolumeOfSales",
      requestType = com.aufgabe.grpc.Product.class,
      responseType = com.aufgabe.grpc.SalesVolume.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aufgabe.grpc.Product,
      com.aufgabe.grpc.SalesVolume> getGetVolumeOfSalesMethod() {
    io.grpc.MethodDescriptor<com.aufgabe.grpc.Product, com.aufgabe.grpc.SalesVolume> getGetVolumeOfSalesMethod;
    if ((getGetVolumeOfSalesMethod = AVGGrpc.getGetVolumeOfSalesMethod) == null) {
      synchronized (AVGGrpc.class) {
        if ((getGetVolumeOfSalesMethod = AVGGrpc.getGetVolumeOfSalesMethod) == null) {
          AVGGrpc.getGetVolumeOfSalesMethod = getGetVolumeOfSalesMethod =
              io.grpc.MethodDescriptor.<com.aufgabe.grpc.Product, com.aufgabe.grpc.SalesVolume>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetVolumeOfSales"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aufgabe.grpc.Product.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aufgabe.grpc.SalesVolume.getDefaultInstance()))
              .setSchemaDescriptor(new AVGMethodDescriptorSupplier("GetVolumeOfSales"))
              .build();
        }
      }
    }
    return getGetVolumeOfSalesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aufgabe.grpc.Invoice,
      com.aufgabe.grpc.Msg> getCreateInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateInvoice",
      requestType = com.aufgabe.grpc.Invoice.class,
      responseType = com.aufgabe.grpc.Msg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aufgabe.grpc.Invoice,
      com.aufgabe.grpc.Msg> getCreateInvoiceMethod() {
    io.grpc.MethodDescriptor<com.aufgabe.grpc.Invoice, com.aufgabe.grpc.Msg> getCreateInvoiceMethod;
    if ((getCreateInvoiceMethod = AVGGrpc.getCreateInvoiceMethod) == null) {
      synchronized (AVGGrpc.class) {
        if ((getCreateInvoiceMethod = AVGGrpc.getCreateInvoiceMethod) == null) {
          AVGGrpc.getCreateInvoiceMethod = getCreateInvoiceMethod =
              io.grpc.MethodDescriptor.<com.aufgabe.grpc.Invoice, com.aufgabe.grpc.Msg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aufgabe.grpc.Invoice.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aufgabe.grpc.Msg.getDefaultInstance()))
              .setSchemaDescriptor(new AVGMethodDescriptorSupplier("CreateInvoice"))
              .build();
        }
      }
    }
    return getCreateInvoiceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AVGStub newStub(io.grpc.Channel channel) {
    return new AVGStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AVGBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AVGBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AVGFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AVGFutureStub(channel);
  }

  /**
   */
  public static abstract class AVGImplBase implements io.grpc.BindableService {

    /**
     */
    public void findInvoiceById(com.aufgabe.grpc.ClientId request,
        io.grpc.stub.StreamObserver<com.aufgabe.grpc.Invoice> responseObserver) {
      asyncUnimplementedUnaryCall(getFindInvoiceByIdMethod(), responseObserver);
    }

    /**
     */
    public void getVolumeOfSales(com.aufgabe.grpc.Product request,
        io.grpc.stub.StreamObserver<com.aufgabe.grpc.SalesVolume> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVolumeOfSalesMethod(), responseObserver);
    }

    /**
     */
    public void createInvoice(com.aufgabe.grpc.Invoice request,
        io.grpc.stub.StreamObserver<com.aufgabe.grpc.Msg> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateInvoiceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindInvoiceByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aufgabe.grpc.ClientId,
                com.aufgabe.grpc.Invoice>(
                  this, METHODID_FIND_INVOICE_BY_ID)))
          .addMethod(
            getGetVolumeOfSalesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aufgabe.grpc.Product,
                com.aufgabe.grpc.SalesVolume>(
                  this, METHODID_GET_VOLUME_OF_SALES)))
          .addMethod(
            getCreateInvoiceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aufgabe.grpc.Invoice,
                com.aufgabe.grpc.Msg>(
                  this, METHODID_CREATE_INVOICE)))
          .build();
    }
  }

  /**
   */
  public static final class AVGStub extends io.grpc.stub.AbstractStub<AVGStub> {
    private AVGStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AVGStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AVGStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AVGStub(channel, callOptions);
    }

    /**
     */
    public void findInvoiceById(com.aufgabe.grpc.ClientId request,
        io.grpc.stub.StreamObserver<com.aufgabe.grpc.Invoice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindInvoiceByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVolumeOfSales(com.aufgabe.grpc.Product request,
        io.grpc.stub.StreamObserver<com.aufgabe.grpc.SalesVolume> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVolumeOfSalesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createInvoice(com.aufgabe.grpc.Invoice request,
        io.grpc.stub.StreamObserver<com.aufgabe.grpc.Msg> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateInvoiceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AVGBlockingStub extends io.grpc.stub.AbstractStub<AVGBlockingStub> {
    private AVGBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AVGBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AVGBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AVGBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aufgabe.grpc.Invoice findInvoiceById(com.aufgabe.grpc.ClientId request) {
      return blockingUnaryCall(
          getChannel(), getFindInvoiceByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aufgabe.grpc.SalesVolume getVolumeOfSales(com.aufgabe.grpc.Product request) {
      return blockingUnaryCall(
          getChannel(), getGetVolumeOfSalesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aufgabe.grpc.Msg createInvoice(com.aufgabe.grpc.Invoice request) {
      return blockingUnaryCall(
          getChannel(), getCreateInvoiceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AVGFutureStub extends io.grpc.stub.AbstractStub<AVGFutureStub> {
    private AVGFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AVGFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AVGFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AVGFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aufgabe.grpc.Invoice> findInvoiceById(
        com.aufgabe.grpc.ClientId request) {
      return futureUnaryCall(
          getChannel().newCall(getFindInvoiceByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aufgabe.grpc.SalesVolume> getVolumeOfSales(
        com.aufgabe.grpc.Product request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVolumeOfSalesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aufgabe.grpc.Msg> createInvoice(
        com.aufgabe.grpc.Invoice request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateInvoiceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_INVOICE_BY_ID = 0;
  private static final int METHODID_GET_VOLUME_OF_SALES = 1;
  private static final int METHODID_CREATE_INVOICE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AVGImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AVGImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_INVOICE_BY_ID:
          serviceImpl.findInvoiceById((com.aufgabe.grpc.ClientId) request,
              (io.grpc.stub.StreamObserver<com.aufgabe.grpc.Invoice>) responseObserver);
          break;
        case METHODID_GET_VOLUME_OF_SALES:
          serviceImpl.getVolumeOfSales((com.aufgabe.grpc.Product) request,
              (io.grpc.stub.StreamObserver<com.aufgabe.grpc.SalesVolume>) responseObserver);
          break;
        case METHODID_CREATE_INVOICE:
          serviceImpl.createInvoice((com.aufgabe.grpc.Invoice) request,
              (io.grpc.stub.StreamObserver<com.aufgabe.grpc.Msg>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AVGBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AVGBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aufgabe.grpc.InvoiceService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AVG");
    }
  }

  private static final class AVGFileDescriptorSupplier
      extends AVGBaseDescriptorSupplier {
    AVGFileDescriptorSupplier() {}
  }

  private static final class AVGMethodDescriptorSupplier
      extends AVGBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AVGMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AVGGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AVGFileDescriptorSupplier())
              .addMethod(getFindInvoiceByIdMethod())
              .addMethod(getGetVolumeOfSalesMethod())
              .addMethod(getCreateInvoiceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
