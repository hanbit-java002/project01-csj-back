package com.hanbit.hp.service;

import java.io.InputStream;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class JsonFileService {
	
	private ObjectMapper mapper = new ObjectMapper();
			
	public <T> T getJsonFile(String filePath, Class<T> classType) throws Exception{
		
		InputStream jsonStream 
		= getClass().getClassLoader().getResourceAsStream(filePath);//filePath와의 연결 통로를 만듬
		
		return mapper.readValue(jsonStream, classType);
	}
}
