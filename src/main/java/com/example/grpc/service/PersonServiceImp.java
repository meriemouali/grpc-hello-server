package com.example.grpc.service;

import com.example.grpc.model.Person;
import com.example.grpc.repository.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonServiceImp implements PersonService {
    private final PersonRepo personRepo;

    public PersonServiceImp(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    @Override
    public Person createPerson(Person person) {
        return personRepo.save(person);

    }

    @Override
    public Optional<Person> getPerson(String id) {
        return personRepo.findById(id);
    }

}
