package com.georgelung.template.services.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.georgelung.template.dto.StringWrapper;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Component
@Path("/template")
@Api(value = "template", description="description goes here")
public class TemplateRest {
	
	@GET
	@Path("/")
	@ApiOperation(value = "/", notes="some notes")
	@Produces(MediaType.APPLICATION_JSON)
	public StringWrapper getMessage(){
		
		return new StringWrapper("Hello World!");
	}
}
