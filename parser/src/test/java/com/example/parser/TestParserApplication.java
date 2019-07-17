package com.example.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.jni.File;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.parser.model.TextData;
import com.google.gson.FieldAttributes;

@RunWith(SpringRunner.class)
public class TestParserApplication {
	ParserApplication parse = new ParserApplication();

	@Test
	public void testreadjson() throws IOException {
		List<TextData> datalist = new ArrayList<TextData>();

		datalist = ParserApplication.readjson();
		assertNotNull(datalist);
	}

	@Test
	public void testreadtextfile() throws IOException {
		List<TextData> txtDataList = new ArrayList<TextData>();
		txtDataList = ParserApplication.readTextFile();
		assertNotNull(txtDataList);

	}

	@Test
	public void file() throws IOException {

		List<String> file1 = Files
				.readAllLines(Paths.get("C:\\Users\\dacha.sankeerth\\Downloads\\parser\\src\\sample1.json"));
		List<String> file2 = Files.readAllLines(Paths.get("C:\\Users\\dacha.sankeerth\\Desktop\\Data1.txt"));

		//assertEquals(file1.size(), file2.size());

		for (int i = 0; i < file1.size(); i++) {
			System.out.println("Comparing line: " + i);
			assertEquals(file1.get(i), file2.get(i));

		}
	}
}
