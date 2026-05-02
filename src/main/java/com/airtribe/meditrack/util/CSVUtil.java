package com.airtribe.meditrack.util;

import java.io.*;
import java.util.*;
import com.airtribe.meditrack.entity.*;
import com.airtribe.meditrack.constants.Constants;

public class CSVUtil {
    public static void savePatients(List<Patient> patients) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Constants.PATIENT_FILE))) {
            for (Patient p : patients) {
                bw.write(p.getId() + "," + p.getName() + "," + p.getAge());
                bw.newLine();
            }
        }
    }

    public static List<Patient> loadPatients() throws IOException {
        List<Patient> list = new ArrayList<>();
        File file = new File(Constants.PATIENT_FILE);
        if (!file.exists()) return list;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] arr = line.split(",");
                list.add(new Patient(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2])));
            }
        }
        return list;
    }
}
