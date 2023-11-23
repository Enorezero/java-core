package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person bogdan = new Person("Bogdan","Terehin","Ussuriysk",20);
        File file = new File("output.out");
        PersonSerializator ps = new PersonSerializator();
        Person bb = ps.deserialize(file);
        System.out.println(bb);


    }
}