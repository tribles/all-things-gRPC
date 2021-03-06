// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calculator/calculator.proto

package com.proto.calculator;

public final class CalculatorOuterClass {
  private CalculatorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SumRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SumRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SumResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SumResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ComputeAverageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ComputeAverageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_ComputeAverageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_ComputeAverageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_calculator_SquareRootResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_calculator_SquareRootResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033calculator/calculator.proto\022\ncalculato" +
      "r\"9\n\nSumRequest\022\024\n\014first_number\030\001 \001(\005\022\025\n" +
      "\rsecond_number\030\002 \001(\005\"!\n\013SumResponse\022\022\n\ns" +
      "um_result\030\001 \001(\005\"1\n\037PrimeNumberDecomposit" +
      "ionRequest\022\016\n\006number\030\001 \001(\005\"8\n PrimeNumbe" +
      "rDecompositionResponse\022\024\n\014prime_factor\030\001" +
      " \001(\005\"\'\n\025ComputeAverageRequest\022\016\n\006number\030" +
      "\001 \001(\005\")\n\026ComputeAverageResponse\022\017\n\007avera" +
      "ge\030\001 \001(\001\"#\n\021SquareRootRequest\022\016\n\006number\030" +
      "\001 \001(\005\"&\n\022SquareRootResponse\022\020\n\010srq_root\030" +
      "\001 \001(\0012\355\002\n\nCalculator\0228\n\003sum\022\026.calculator" +
      ".SumRequest\032\027.calculator.SumResponse\"\000\022y" +
      "\n\030PrimeNumberDecomposition\022+.calculator." +
      "PrimeNumberDecompositionRequest\032,.calcul" +
      "ator.PrimeNumberDecompositionResponse\"\0000" +
      "\001\022[\n\016ComputeAverage\022!.calculator.Compute" +
      "AverageRequest\032\".calculator.ComputeAvera" +
      "geResponse\"\000(\001\022M\n\nSquareRoot\022\035.calculato" +
      "r.SquareRootRequest\032\036.calculator.SquareR" +
      "ootResponse\"\000B\030\n\024com.proto.calculatorP\001b" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_calculator_SumRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_calculator_SumRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SumRequest_descriptor,
        new java.lang.String[] { "FirstNumber", "SecondNumber", });
    internal_static_calculator_SumResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_calculator_SumResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SumResponse_descriptor,
        new java.lang.String[] { "SumResult", });
    internal_static_calculator_PrimeNumberDecompositionRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_calculator_PrimeNumberDecompositionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_PrimeNumberDecompositionResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_calculator_PrimeNumberDecompositionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_PrimeNumberDecompositionResponse_descriptor,
        new java.lang.String[] { "PrimeFactor", });
    internal_static_calculator_ComputeAverageRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_calculator_ComputeAverageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ComputeAverageRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_ComputeAverageResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_calculator_ComputeAverageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_ComputeAverageResponse_descriptor,
        new java.lang.String[] { "Average", });
    internal_static_calculator_SquareRootRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_calculator_SquareRootRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootRequest_descriptor,
        new java.lang.String[] { "Number", });
    internal_static_calculator_SquareRootResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_calculator_SquareRootResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_calculator_SquareRootResponse_descriptor,
        new java.lang.String[] { "SrqRoot", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
