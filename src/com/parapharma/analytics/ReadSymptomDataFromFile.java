package com.parapharma.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;


	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	public void GetSymptoms() {

		if (filepath != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(filepath));
				String line;

				while ((line = reader.readLine()) != null) {
					if (counter.containsKey(line)) {
						counter.put(line, counter.get(line) + 1);
					} else {
						counter.put(line, 1);
					}
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(counter);
		}
	}
}





