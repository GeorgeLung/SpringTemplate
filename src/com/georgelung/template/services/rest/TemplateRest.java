package com.georgelung.template.services.rest;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;

import com.georgelung.template.domain.TestEntity;
import com.georgelung.template.dto.ListDTO;
import com.georgelung.template.dto.StringWrapper;
import com.georgelung.template.repositories.TemplateRepository;

@Component
@Path("/template")
public class TemplateRest {

	@Inject
	TemplateRepository repo;
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public ListDTO<StringWrapper> getTemplate(){
		
		Iterable<TestEntity> entities = repo.findAll();
		List<StringWrapper> names = new ArrayList<>();
		
		for(TestEntity entity : entities){
			names.add(new StringWrapper(entity.getName()));
		}
		
		return new ListDTO<StringWrapper>(names);
	}
}
