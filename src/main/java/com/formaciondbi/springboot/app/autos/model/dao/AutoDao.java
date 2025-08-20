package com.formaciondbi.springboot.app.autos.model.dao;

import org.springframework.data.repository.CrudRepository;
import com.formaciondbi.springboot.app.autos.model.Auto;

public interface AutoDao extends CrudRepository<Auto, Long> {
	
}
