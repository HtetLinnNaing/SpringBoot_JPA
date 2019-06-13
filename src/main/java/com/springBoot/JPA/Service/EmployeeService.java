package com.springBoot.JPA.Service;

import java.util.List;

import com.springBoot.JPA.model.Employee;

public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
}
