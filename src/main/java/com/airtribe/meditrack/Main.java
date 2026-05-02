package com.airtribe.meditrack;

import java.util.*;
import com.airtribe.meditrack.entity.*;
import com.airtribe.meditrack.service.*;
import com.airtribe.meditrack.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PatientService ps = new PatientService();

        ps.load(CSVUtil.loadPatients());

        while (true) {
            System.out.println("1. Add Patient 2. View Patients 3. Save & Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID Name Age: ");
                int id = sc.nextInt();
                String name = sc.next();
                int age = sc.nextInt();

                ps.add(new Patient(id, name, age));
            } else if (choice == 2) {
                ps.getAll().forEach(Patient::display);
            } else {
                CSVUtil.savePatients(ps.getAll());
                System.out.println("Saved!");
                break;
            }
        }
    }
}
