package com.spring.hibernate.dao;

import com.spring.hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
