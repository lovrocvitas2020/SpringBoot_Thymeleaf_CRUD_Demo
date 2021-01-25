package com.lovro.demo.springmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lovro.demo.springmysql.model.Employee;


@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {

}
