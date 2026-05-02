package com.airtribe.meditrack.entity;

public class Person extends MedicalEntity {
    protected String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }

    public void display() {
        System.out.println(id + " - " + name);
    }
}
