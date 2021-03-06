package com.example.grpc.blog.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BlogServer {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.println("BlogService GRPC server started");
        Server server = ServerBuilder.forPort(50053)
                .addService(new BlogServiceImpl())
                .build();
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread( () -> {
            System.out.println("received shutdown request");
            server.shutdown();
            System.out.println("shutdown successfully");
        }));
        server.awaitTermination();

    }
}
