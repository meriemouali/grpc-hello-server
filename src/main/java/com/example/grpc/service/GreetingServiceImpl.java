package com.example.grpc.service;

import com.example.grpc.GreetingServiceGrpc;
import com.example.grpc.GreetingServiceOuterClass;
import com.example.grpc.model.Person;
import com.example.grpc.repository.PersonRepo;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@GRpcService
public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    
    private final PersonRepo personRepo;

    public GreetingServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }


    @Override
    public void greeting(GreetingServiceOuterClass.HelloRequest request,
                         StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver) {
        // HelloRequest has toString auto-generated.
        // You must use a builder to construct a new Protobuffer object
        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.HelloResponse.newBuilder()
                .setGreeting("Hello there, " + request.getName())
                .build();
        // Use responseObserver to send a single response back
        responseObserver.onNext(response);
        // When you are done, you must call onCompleted.
        responseObserver.onCompleted();
    }

    public void getPersonById(GreetingServiceOuterClass.GetPersonRequest request, StreamObserver<GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
        Optional<Person> selected = personRepo.findById(request.getPersonId());
        GreetingServiceOuterClass.Person person = GreetingServiceOuterClass.Person.newBuilder()
                .setAge(selected.get().getAge())
                .setFirstName(selected.get().getFirstName())
                .setLastName(selected.get().getLastName())
                .build();
        GreetingServiceOuterClass.GetPersonResponse response1 = GreetingServiceOuterClass.GetPersonResponse.newBuilder()
                .setPerson(person)
                .build();
        responseObserver.onNext(response1);
        responseObserver.onCompleted();

    }

    public void createPerson(GreetingServiceOuterClass.CreatePersonRequest request, StreamObserver<GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
        Person person = new Person();
        person.setAge(request.getAge());
        person.setFirstName(request.getFirstName());
        person.setLastName(request.getLastName());
        person.setPhoneNumbers(request.getPhoneNumbersList());
        Person p = personRepo.save(person);
        GreetingServiceOuterClass.Person person1 = GreetingServiceOuterClass.Person.newBuilder()
                .setPersonId(p.getId())
                .setAge(p.getAge())
                .setFirstName(p.getFirstName())
                .setLastName(p.getLastName())
                //.setPhoneNumbers(p.getPhoneNumbers())
                .build();

        GreetingServiceOuterClass.GetPersonResponse response2 = GreetingServiceOuterClass.GetPersonResponse.newBuilder()
                .setPerson(person1)
                .build();
        responseObserver.onNext(response2);
        responseObserver.onCompleted();

    }

    public void updatePerson(GreetingServiceOuterClass.CreatePersonRequest request, StreamObserver<GreetingServiceOuterClass.GetPersonResponse> responseObserver) {
        Optional<Person> selected = personRepo.findById(request.getPersonId());
        if (selected.isPresent()) {
            selected.get().setFirstName(request.getFirstName());
            selected.get().setLastName(request.getLastName());
            selected.get().setAge(request.getAge());
            selected.get().setPhoneNumbers(request.getPhoneNumbersList());
            personRepo.save(selected.get());

        }
        GreetingServiceOuterClass.Person person2 = GreetingServiceOuterClass.Person.newBuilder()
                .setPersonId(selected.get().getId())
                .setAge(selected.get().getAge())
                .setFirstName(selected.get().getFirstName())
                .setLastName(selected.get().getLastName())
                //.setPhoneNumbers(p.getPhoneNumbers())
                .build();
        GreetingServiceOuterClass.GetPersonResponse person = GreetingServiceOuterClass.GetPersonResponse.newBuilder()
                .setPerson(person2)
                .build();
        responseObserver.onNext(person);
        responseObserver.onCompleted();
    }

    public void getPersons(GreetingServiceOuterClass.GetAllPersonRequest request, StreamObserver<GreetingServiceOuterClass.GetAllPersonResponse> responseObserver) {
        List<Person> persons = personRepo.findAll();
        List<GreetingServiceOuterClass.Person> listPerson = persons.stream().map((item) -> {
            GreetingServiceOuterClass.Person person2 = GreetingServiceOuterClass.Person.newBuilder()
                    .setPersonId(item.getId())
                    .setAge(item.getAge())
                    .setFirstName(item.getFirstName())
                    .setLastName(item.getLastName())
                    .build();
            return person2;

        }).collect(Collectors.toList());
        GreetingServiceOuterClass.GetAllPersonResponse allPersons = GreetingServiceOuterClass.GetAllPersonResponse.newBuilder()
                .addAllAllPersons(listPerson)
                .build();
        responseObserver.onNext(allPersons);
        responseObserver.onCompleted();
    }
}