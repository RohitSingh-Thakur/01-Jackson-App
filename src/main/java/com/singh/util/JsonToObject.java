package com.singh.util;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.singh.entity.User;

public class JsonToObject {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		File f = new File("user.json");
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(f, User.class);
		System.out.println("Convertiopn Completed...");
		System.out.println(user);
	}
}
