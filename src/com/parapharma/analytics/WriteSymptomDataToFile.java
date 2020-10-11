package com.parapharma.analytics;

import java.io.*;
import java.util.*;

public class WriteSymptomDataToFile implements ISymptomReader {

    private String filepath;

    public WriteSymptomDataToFile(String filepath) {
        this.filepath = filepath; }

    public void WriteSymptoms() {
        if (filepath != null) {
            try {
                File file = new File(filepath);
                BufferedWriter bf = new BufferedWriter(new FileWriter(file));

                for (Map.Entry<String, Integer> entry : counter.entrySet()) {
                    bf.write(entry.getKey() + " => " + entry.getValue());
                    bf.newLine();
                }
                bf.close();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            System.out.println(counter);
            //return counter;
        }
    }
}

