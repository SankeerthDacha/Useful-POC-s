package example.db.poc.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

import org.springframework.stereotype.Service;

import example.db.poc.model.Record;
import example.db.poc.repository.RecordRepository;

@Service
public class RecordService {

	// public List<Record> getAllRecord() {
	// return (List<Record>) recordRepository.findAll();
	public void saveDest(BufferedReader br, RecordRepository recordRepository) {
		String strLine;
		// Read File Line By Line
		/*
		 * try { while ((strLine = br.readLine()) != null) { // Print the content on the
		 * console String[] value = strLine.split("\\s+");
		 * System.out.println("Items  = " + Arrays.toString(value));
		 * 
		 * Record b1 = new Record(); b1.setCountrycode(value[0]);
		 * b1.setZipcodefrom(value[1]); b1.setDestination(value[2]);
		 * b1.setState(value[3]);
		 * 
		 * recordRepository.save(b1);
		 * 
		 * }
		 */
		try {
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				String[] value = strLine.split("\\s+");
				System.out.println("Items  = " + Arrays.toString(value));

				/*
				 * Record b1 = new Record(); b1.setCountrycode(value[0]);
				 * b1.setZipcodefrom(value[1]); // b1.setDestination(value[2]);
				 * b1.setState(value[3]);
				 */
				Record b1 = new Record();

				String val1 = value[0];
				String val2 = value[1].substring(0, 3);
				String val3 = value[2].substring(0, 3);
				if (val1.equals("124")) {
					if (val2.equals(val3)) {
						b1.setCountrycode(val1);
						b1.setZipcodefrom(val2);
						b1.setDestination(value[3]);
						b1.setState(value[4]);
						recordRepository.save(b1);
					}
				} else {
					int value1 = Integer.parseInt(value[1].substring(0, 5));
					int value2 = Integer.parseInt(value[2].substring(0, 5));
					int diff = value2 - value1;

					if (diff >= 0) {

						for (int i = value1; i <= value2; i++) {
							b1.setCountrycode(value[0]);
							int len = String.valueOf(i).length();
							if (len == 3) {
								b1.setZipcodefrom("0" + "0" + String.valueOf(i));
							} else if(len == 4)  {
								b1.setZipcodefrom("0" + String.valueOf(i));
							}   				
							else {
								b1.setZipcodefrom(String.valueOf(i));
								
							}

							/*	String s1=value[1];
							if(s1.charAt(1) == 0)
							{
								b1.setZipcodefrom("0"+"0" + String.valueOf(i));
							}
							else {
								b1.setZipcodefrom("0" + String.valueOf(i));
							}*/

							
							b1.setDestination(value[3]);
							b1.setState(value[4]);
							recordRepository.save(b1);
						}
					}
				}
//				recordRepository.save(b1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
