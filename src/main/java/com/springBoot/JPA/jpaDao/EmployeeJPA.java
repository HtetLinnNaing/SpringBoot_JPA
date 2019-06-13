package com.springBoot.JPA.jpaDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBoot.JPA.model.Employee;

public interface EmployeeJPA extends JpaRepository<Employee, Integer>{

}
