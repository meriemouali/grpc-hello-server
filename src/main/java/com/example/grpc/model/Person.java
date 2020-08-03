package com.example.grpc.model;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Document(collection = "person")
public class Person {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private List<String> phoneNumbers= new ArrayList<>();


    public Person(String id, String firstName, String lastName, int age, List<String> phoneNumbers) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public Person() {
    }
}
