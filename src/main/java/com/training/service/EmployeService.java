package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.persistance.dao.IEmployeDao;
import com.persistance.model.Employe;

@Service
@Transactional
public class EmployeService implements IEmployeService{
	
    @Autowired
	IEmployeDao employeDao;
	
	public void add(Employe emp) {
		// TODO Auto-generated method stub
		employeDao.add(emp);
		
	}

	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employeDao.findAll();
	}

	public void delete(Employe emp) {
		// TODO Auto-generated method stub
		employeDao.delete(emp);
	}

	public Employe update(Employe emp) {
		// TODO Auto-generated method stub
		return employeDao.update(emp);
	}

	public Employe findById(int id) {
		// TODO Auto-generated method stub
		return employeDao.findById(id);
	}

}
