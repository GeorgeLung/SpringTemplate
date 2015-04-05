package com.georgelung.template.services;

import org.springframework.stereotype.Component;

import com.georgelung.template.dto.StringWrapper;

@Component
public class TemplateService {
	
	public TemplateService(){
		//init whatever
	}
	
	public StringWrapper helloWorld(){
		//in here call relevant function
		return new StringWrapper("Hello World");
	}
}
