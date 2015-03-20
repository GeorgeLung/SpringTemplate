package com.georgelung.template.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.georgelung.template.domain.TestEntity;

@Repository
public interface TemplateRepository extends CrudRepository<TestEntity, Long>{

}
