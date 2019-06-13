package com.springBoot.JPA.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.JPA.jpaDao.EmployeeJPA;
import com.springBoot.JPA.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeJPA empJpa;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeJPA theempJpa) {
		empJpa=theempJpa;
	}
	@Override
	public List<Employee> findAll(){
		return empJpa.findAll();
	}
	@Override
	public Employee findById(int theId) {
		Optional<Employee> result=empJpa.findById(theId);
		Employee employee=null;
		if(result.isPresent()) {
			employee=result.get();
		}
		else {
			throw new RuntimeException("Did not find employee di:"+theId);
		}
		return employee;
	}
	@Override
	public void save(Employee theEmployee) {
		empJpa.save(theEmployee);
		
	}
	@Override
	public void deleteById(int theId) {
		empJpa.deleteById(theId);
		
	}
	
	
}
