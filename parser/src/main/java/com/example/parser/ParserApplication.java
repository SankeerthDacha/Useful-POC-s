package com.example.parser;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.parser.model.TextData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@SpringBootApplication
public class ParserApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ParserApplication.class, args);

		List<TextData> txtData = new ArrayList<>();
		List<TextData> jsonData = new ArrayList<>();
		List<TextData> differenceList = new ArrayList<>();
		List<TextData> JsonList = new ArrayList<>();

		txtData = readTextFile();
		jsonData = readjson();

		for (TextData json : txtData)

		{
			if (jsonData.toString().contains(json.toString())) {
				JsonList.add(json);

			} else {
				differenceList.add(json);

			}
		}
		System.out.println("Match Found " + JsonList);
		System.out.println("diffrence list" + differenceList);
	}

	public static List<TextData> readjson() throws IOException {
		BufferedReader br = null;
		ParserApplication pa = new ParserApplication();
		Gson gson = new Gson();
		TextData[] tex = new TextData[0];
		List<TextData> list = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\dacha.sankeerth\\Downloads\\parser\\src\\sample1.json"));
			tex = gson.fromJson(br, TextData[].class);
			for (int i = 0; i < tex.length; i++) {
				tex[i].getCountry_Code();
				tex[i].getZipcodefrom();
				tex[i].getZipcodeTo();
				tex[i].getDestination();
			}
			list = Arrays.asList(tex);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {

			br.close();
		}

		return list;
	}

	static List<TextData> readTextFile() throws FileNotFoundException {

		Scanner input = new Scanner(new File("C:\\Users\\dacha.sankeerth\\Desktop\\Data1.txt"));
		TextData[] txtData = new TextData[0];
		List<TextData> txtDataList = new ArrayList<TextData>();
		while (input.hasNext()) {

			String Country_Code = input.next();
			String Zipcodefrom = input.next();
			String ZipcodeTo = input.next();
			String Destination = input.next();
			String State = input.next();

			TextData newProduct = new TextData(Country_Code, Zipcodefrom, ZipcodeTo, Destination, State);
			txtDataList.add(newProduct);
		}

		return txtDataList;

	}
}
