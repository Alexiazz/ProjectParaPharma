package com.parapharma.analytics;

public class AnalyticsCounter {
	
	public static void main(String args[]) {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		reader.GetSymptoms();

		WriteSymptomDataToFile writer = new WriteSymptomDataToFile("result.out");
		writer.WriteSymptoms();


	}
}
