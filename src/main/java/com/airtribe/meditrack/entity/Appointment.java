package com.airtribe.meditrack.entity;

public class Appointment {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private AppointmentStatus status;

    public Appointment(int id, Patient p, Doctor d) {
        this.id = id;
        this.patient = p;
        this.doctor = d;
        this.status = AppointmentStatus.PENDING;
    }

    public void confirm() { status = AppointmentStatus.CONFIRMED; }
    public void cancel() { status = AppointmentStatus.CANCELLED; }

    public void display() {
        System.out.println("Appointment: " + id + " Status: " + status);
    }
}
