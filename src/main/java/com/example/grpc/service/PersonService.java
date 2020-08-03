package com.example.grpc.service;

import com.example.grpc.model.Person;

import java.util.Optional;

public interface PersonService {
    Person createPerson(Person person);
    Optional<Person> getPerson(String id);
}
