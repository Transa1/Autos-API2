package com.formaciondbi.springboot.app.autos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.autos.model.Auto;
import com.formaciondbi.springboot.app.autos.model.service.IAutoService;

@RestController
public class AutoController {
	
	@Autowired
	private IAutoService autoService;
	
	@GetMapping("/listar")
	public List<Auto> listar(){
		return autoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Auto detalle(@PathVariable Long id) {
		return autoService.findById(id);
	}

}
