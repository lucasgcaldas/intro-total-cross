package com.totalcross.entities;

import java.util.Random;

public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public String generateCode() {
        Random random = new Random();
        String characters = "0123456789";
        char[] code = new char[8];
        for (int i = 0; i < 8; i++) {
            code[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(code);
    }
}
