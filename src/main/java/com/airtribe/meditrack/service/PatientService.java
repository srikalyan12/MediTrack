package com.airtribe.meditrack.service;

import java.util.*;
import com.airtribe.meditrack.entity.*;

public class PatientService {
    private List<Patient> list = new ArrayList<>();

    public void load(List<Patient> patients) { list.addAll(patients); }

    public void add(Patient p) { list.add(p); }

    public List<Patient> getAll() { return list; }

    public Patient search(int id) {
        return list.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }
}
