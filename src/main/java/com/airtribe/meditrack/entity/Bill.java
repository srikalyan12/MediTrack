package com.airtribe.meditrack.entity;

public class Bill {
    protected double amount;

    public Bill(double amount) { this.amount = amount; }

    public double calculate() {
        return amount + (amount * 0.1);
    }
}
