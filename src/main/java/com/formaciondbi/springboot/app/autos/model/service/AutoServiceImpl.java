package com.formaciondbi.springboot.app.autos.model.service;

import java.util.List;

import com.formaciondbi.springboot.app.autos.model.Auto;
import com.formaciondbi.springboot.app.autos.model.dao.AutoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class AutoServiceImpl implements IAutoService {
	
	@Autowired
	private AutoDao autoDao;

	@Override
	@Transactional(readOnly = true)
	public List<Auto> findAll() {
		// TODO Auto-generated method stub
		return (List<Auto>)autoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Auto findById(Long id) {
		// TODO Auto-generated method stub
		return autoDao.findById(id).orElse(null);
	}

}
