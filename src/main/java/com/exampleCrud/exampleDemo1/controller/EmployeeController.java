package com.exampleCrud.exampleDemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exampleCrud.exampleDemo1.model.Employee;
import com.exampleCrud.exampleDemo1.service.EmployeeService;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);

	}

	// GetAll Rest API
	@GetMapping
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}

	// Get by Id Rest API
	// localhost:8080/api/employees/1
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeByID(@PathVariable("id") long employeeID) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeID), HttpStatus.OK);

	}
	
	//Update Employee
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id),HttpStatus.OK);
	}
	
	//delete Employee
	public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
		//delete employee from db
		employeeService.DeleteEmployee(id);
		return new ResponseEntity<String>("Employee Deleted Successfully", HttpStatus.OK);
		
	}

}
