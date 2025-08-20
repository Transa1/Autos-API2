package com.formaciondbi.springboot.app.autos.model.service;

import java.util.List;
import com.formaciondbi.springboot.app.autos.model.Auto;

public interface IAutoService {
	
	public List<Auto> findAll();
	public Auto findById(Long id);

}
