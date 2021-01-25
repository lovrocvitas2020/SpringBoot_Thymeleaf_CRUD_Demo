package com.lovro.demo.springmysql.service;

import java.util.List;

import com.lovro.demo.springmysql.model.Employee;

public interface EmployeeService {
	
	
	List<Employee> getAllEmployees();
	
	void saveEmployee(Employee employee);
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}
