// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InvoiceService.proto

package com.aufgabe.grpc;

public interface InvoiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Invoice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string clientId = 1;</code>
   */
  java.lang.String getClientId();
  /**
   * <code>string clientId = 1;</code>
   */
  com.google.protobuf.ByteString
      getClientIdBytes();

  /**
   * <code>.Product product = 2;</code>
   */
  boolean hasProduct();
  /**
   * <code>.Product product = 2;</code>
   */
  com.aufgabe.grpc.Product getProduct();
  /**
   * <code>.Product product = 2;</code>
   */
  com.aufgabe.grpc.ProductOrBuilder getProductOrBuilder();

  /**
   * <code>int32 number = 3;</code>
   */
  int getNumber();
}