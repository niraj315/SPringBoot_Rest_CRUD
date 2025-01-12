package com.exampleCrud.exampleDemo1.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleCrud.exampleDemo1.model.Employee;
import com.exampleCrud.exampleDemo1.repository.EmployeeRepository;
import com.exampleCrud.exampleDemo1.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	//save employee in database;
	@Override //is it compulsory?
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	//get all employees from database
	@Override
	public List<Employee> getAllEmployee(){
		return employeeRepository.findAll();
	}
	
	//get employee using id
	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		else {
			throw new RuntimeException();
		}
	}
	
	//update Employee
	@Override
	public Employee updateEmployee(Employee employee, long id) {
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow( () -> new RuntimeException());//??
		//existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setFirst_name(employee.getFirst_name());
		
		return null;
	}
	@Override
	public void DeleteEmployee(long id) {
		//check
		employeeRepository.findById(id).orElseThrow( () -> new RuntimeException());//??
		//delete
		employeeRepository.deleteById(id);
		
	}

}
