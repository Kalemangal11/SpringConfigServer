package com.bikkadIT.conversion;

import java.io.File;
import java.io.IOException;

import com.bikkadIT.binding.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

	public static void main(String[] args) throws IOException {
		

		File file=new File("Student.json");
	
		ObjectMapper om=new ObjectMapper();
		Student javaObject = om.readValue(file, Student.class);
		System.out.println(javaObject);
	}
}
