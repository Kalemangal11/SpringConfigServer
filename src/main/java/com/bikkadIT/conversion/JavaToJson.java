package com.bikkadIT.conversion;

import com.bikkadIT.binding.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {

	public static void main(String[] args) throws JsonProcessingException {
		
		Student javaObject=new Student();
		javaObject.setSid(111);
		javaObject.setSname("Mangal");
		javaObject.setSage(30);
		javaObject.setSrank(5);
		System.out.println(javaObject);
		
		ObjectMapper objectMapper=new ObjectMapper();
		String json = objectMapper.writeValueAsString(javaObject);
		System.out.println(json);
	}
}
