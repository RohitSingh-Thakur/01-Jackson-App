package com.singh.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.singh.entity.User;

public class ObjectToJson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		User user = new User(101, "Rohit");
		
		// Convert Object To JSON
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("user.json"), user);
		
		System.out.println("Conversion Complete...");
	}
}
