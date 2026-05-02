package com.airtribe.meditrack.entity;

public class Patient extends Person implements Cloneable {
    private int age;

    public Patient(int id, String name, int age) {
        super(id, name);
        this.age = age;
    }

    public int getAge() { return age; }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
