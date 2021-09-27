package com.totalcross.entities;

import java.util.Random;

public class Teacher extends Person {

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String generateCode() {
        Random random = new Random();
        String characters = "0123456789";
        char[] code = new char[9];
        for (int i = 0; i < 9; i++) {
            code[i] = characters.charAt(random.nextInt(characters.length()));
        }
        return new String(code);
    }
}
