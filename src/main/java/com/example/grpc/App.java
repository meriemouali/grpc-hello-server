package com.example.grpc;

import com.example.grpc.repository.PersonRepo;
import com.example.grpc.service.GreetingServiceImpl;
import io.grpc.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App
{


    //private PersonRepo personRepo;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
        // Create a new server to listen on port 8080
        /*Server server = ServerBuilder.forPort(8080)
                .addService(new GreetingServiceImpl(personRepo))
                .build();

        // Start the server
        server.start();

        // Server threads are running in the background.
        System.out.println("Server started");
        // Don't exit the main thread. Wait until server is terminated.
        server.awaitTermination();*/
    }


}