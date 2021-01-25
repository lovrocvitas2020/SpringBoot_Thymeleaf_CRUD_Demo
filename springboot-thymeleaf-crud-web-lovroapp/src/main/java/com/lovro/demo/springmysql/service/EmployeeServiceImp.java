package com.lovro.demo.springmysql.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lovro.demo.springmysql.model.Employee;
import com.lovro.demo.springmysql.repository.EmployeeRespository;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	private EmployeeRespository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(long id) {
	Optional<Employee> optional = employeeRepository.findById(id);
	Employee employee = null;
	
	if(optional.isPresent()) {
		employee = optional.get();
	} else {
		throw new RuntimeException(" Employee not found for id: "+id);
	}
	return employee;
	}

	@Override
	public void deleteEmployeeById(long id) {
		
		this.employeeRepository.deleteById(id);
		
	}

}
