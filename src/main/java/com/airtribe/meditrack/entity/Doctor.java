package com.airtribe.meditrack.entity;

public class Doctor extends Person {
    private String specialization;

    public Doctor(int id, String name, String specialization) {
        super(id, name);
        this.specialization = specialization;
    }

    public String getSpecialization() { return specialization; }
}
