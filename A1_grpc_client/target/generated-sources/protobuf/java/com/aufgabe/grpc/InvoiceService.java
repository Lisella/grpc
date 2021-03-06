// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvoiceService.proto

package com.aufgabe.grpc;

public final class InvoiceService {
  private InvoiceService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Product_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Invoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Invoice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SalesVolume_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SalesVolume_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Msg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Msg_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024InvoiceService.proto\"8\n\007Product\022\014\n\004nam" +
      "e\030\001 \001(\t\022\n\n\002id\030\002 \001(\005\022\023\n\013salesVolume\030\003 \001(\002" +
      "\"F\n\007Invoice\022\020\n\010clientId\030\001 \001(\t\022\031\n\007product" +
      "\030\002 \001(\0132\010.Product\022\016\n\006number\030\003 \001(\005\"\034\n\010Clie" +
      "ntId\022\020\n\010clientId\030\001 \001(\t\"\035\n\013SalesVolume\022\016\n" +
      "\006amount\030\001 \001(\002\"\022\n\003Msg\022\013\n\003msg\030\001 \001(\t2\200\001\n\003AV" +
      "G\022(\n\017FindInvoiceById\022\t.ClientId\032\010.Invoic" +
      "e\"\000\022,\n\020GetVolumeOfSales\022\010.Product\032\014.Sale" +
      "sVolume\"\000\022!\n\rCreateInvoice\022\010.Invoice\032\004.M" +
      "sg\"\000B\024\n\020com.aufgabe.grpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Product_descriptor,
        new java.lang.String[] { "Name", "Id", "SalesVolume", });
    internal_static_Invoice_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Invoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Invoice_descriptor,
        new java.lang.String[] { "ClientId", "Product", "Number", });
    internal_static_ClientId_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ClientId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientId_descriptor,
        new java.lang.String[] { "ClientId", });
    internal_static_SalesVolume_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_SalesVolume_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SalesVolume_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_Msg_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_Msg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Msg_descriptor,
        new java.lang.String[] { "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
