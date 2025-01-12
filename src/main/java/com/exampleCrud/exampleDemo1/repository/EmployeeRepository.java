package com.exampleCrud.exampleDemo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exampleCrud.exampleDemo1.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
	//crud
}
