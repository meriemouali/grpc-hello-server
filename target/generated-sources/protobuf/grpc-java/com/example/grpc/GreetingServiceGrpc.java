package com.example.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.7.0)",
    comments = "Source: GreetingService.proto")
public final class GreetingServiceGrpc {

  private GreetingServiceGrpc() {}

  public static final String SERVICE_NAME = "com.example.grpc.GreetingService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.HelloRequest,
      com.example.grpc.GreetingServiceOuterClass.HelloResponse> METHOD_GREETING =
      io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.HelloRequest, com.example.grpc.GreetingServiceOuterClass.HelloResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.GreetingService", "greeting"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.HelloRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.HelloResponse.getDefaultInstance()))
          .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("greeting"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.GetPersonRequest,
      com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> METHOD_GET_PERSON_BY_ID =
      io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.GetPersonRequest, com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.GreetingService", "getPersonById"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.GetPersonRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.GetPersonResponse.getDefaultInstance()))
          .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("getPersonById"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest,
      com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> METHOD_CREATE_PERSON =
      io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest, com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.GreetingService", "createPerson"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.GetPersonResponse.getDefaultInstance()))
          .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("createPerson"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest,
      com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> METHOD_UPDATE_PERSON =
      io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest, com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.GreetingService", "updatePerson"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.GetPersonResponse.getDefaultInstance()))
          .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("updatePerson"))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest,
      com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse> METHOD_GET_PERSONS =
      io.grpc.MethodDescriptor.<com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest, com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.example.grpc.GreetingService", "getPersons"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse.getDefaultInstance()))
          .setSchemaDescriptor(new GreetingServiceMethodDescriptorSupplier("getPersons"))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreetingServiceStub newStub(io.grpc.Channel channel) {
    return new GreetingServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreetingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new GreetingServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreetingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new GreetingServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class GreetingServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GREETING, responseObserver);
    }

    /**
     */
    public void getPersonById(com.example.grpc.GreetingServiceOuterClass.GetPersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PERSON_BY_ID, responseObserver);
    }

    /**
     */
    public void createPerson(com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE_PERSON, responseObserver);
    }

    /**
     */
    public void updatePerson(com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_UPDATE_PERSON, responseObserver);
    }

    /**
     */
    public void getPersons(com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PERSONS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GREETING,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.HelloRequest,
                com.example.grpc.GreetingServiceOuterClass.HelloResponse>(
                  this, METHODID_GREETING)))
          .addMethod(
            METHOD_GET_PERSON_BY_ID,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.GetPersonRequest,
                com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>(
                  this, METHODID_GET_PERSON_BY_ID)))
          .addMethod(
            METHOD_CREATE_PERSON,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest,
                com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>(
                  this, METHODID_CREATE_PERSON)))
          .addMethod(
            METHOD_UPDATE_PERSON,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest,
                com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>(
                  this, METHODID_UPDATE_PERSON)))
          .addMethod(
            METHOD_GET_PERSONS,
            asyncUnaryCall(
              new MethodHandlers<
                com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest,
                com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse>(
                  this, METHODID_GET_PERSONS)))
          .build();
    }
  }

  /**
   */
  public static final class GreetingServiceStub extends io.grpc.stub.AbstractStub<GreetingServiceStub> {
    private GreetingServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public void greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GREETING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersonById(com.example.grpc.GreetingServiceOuterClass.GetPersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PERSON_BY_ID, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPerson(com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE_PERSON, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePerson(com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PERSON, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPersons(com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest request,
        io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PERSONS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class GreetingServiceBlockingStub extends io.grpc.stub.AbstractStub<GreetingServiceBlockingStub> {
    private GreetingServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.example.grpc.GreetingServiceOuterClass.HelloResponse greeting(com.example.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GREETING, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.GetPersonResponse getPersonById(com.example.grpc.GreetingServiceOuterClass.GetPersonRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PERSON_BY_ID, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.GetPersonResponse createPerson(com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE_PERSON, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.GetPersonResponse updatePerson(com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_UPDATE_PERSON, getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse getPersons(com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PERSONS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class GreetingServiceFutureStub extends io.grpc.stub.AbstractStub<GreetingServiceFutureStub> {
    private GreetingServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private GreetingServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreetingServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new GreetingServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Define a RPC operation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.HelloResponse> greeting(
        com.example.grpc.GreetingServiceOuterClass.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GREETING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> getPersonById(
        com.example.grpc.GreetingServiceOuterClass.GetPersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PERSON_BY_ID, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> createPerson(
        com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE_PERSON, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse> updatePerson(
        com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_UPDATE_PERSON, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse> getPersons(
        com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PERSONS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GREETING = 0;
  private static final int METHODID_GET_PERSON_BY_ID = 1;
  private static final int METHODID_CREATE_PERSON = 2;
  private static final int METHODID_UPDATE_PERSON = 3;
  private static final int METHODID_GET_PERSONS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreetingServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreetingServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GREETING:
          serviceImpl.greeting((com.example.grpc.GreetingServiceOuterClass.HelloRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.HelloResponse>) responseObserver);
          break;
        case METHODID_GET_PERSON_BY_ID:
          serviceImpl.getPersonById((com.example.grpc.GreetingServiceOuterClass.GetPersonRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>) responseObserver);
          break;
        case METHODID_CREATE_PERSON:
          serviceImpl.createPerson((com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PERSON:
          serviceImpl.updatePerson((com.example.grpc.GreetingServiceOuterClass.CreatePersonRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetPersonResponse>) responseObserver);
          break;
        case METHODID_GET_PERSONS:
          serviceImpl.getPersons((com.example.grpc.GreetingServiceOuterClass.GetAllPersonRequest) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.GreetingServiceOuterClass.GetAllPersonResponse>) responseObserver);
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

  private static abstract class GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreetingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.GreetingServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GreetingService");
    }
  }

  private static final class GreetingServiceFileDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier {
    GreetingServiceFileDescriptorSupplier() {}
  }

  private static final class GreetingServiceMethodDescriptorSupplier
      extends GreetingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreetingServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreetingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreetingServiceFileDescriptorSupplier())
              .addMethod(METHOD_GREETING)
              .addMethod(METHOD_GET_PERSON_BY_ID)
              .addMethod(METHOD_CREATE_PERSON)
              .addMethod(METHOD_UPDATE_PERSON)
              .addMethod(METHOD_GET_PERSONS)
              .build();
        }
      }
    }
    return result;
  }
}
