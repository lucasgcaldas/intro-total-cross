package com.totalcross.entities;

public abstract class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public abstract String generateCode();
}
