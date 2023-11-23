package org.example;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable {
    String name;
    String surname;
    String address;
    int age;

    public Person(String name, String surname, String address, int age) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
