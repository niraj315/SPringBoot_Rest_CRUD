package com.exampleCrud.exampleDemo1.service;

import java.util.List;
import com.exampleCrud.exampleDemo1.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);//to save in table Crud
	List<Employee>  getAllEmployee();//get list of all employee cRud
	Employee getEmployeeById(long id);// to get individual employee cRud
	Employee updateEmployee(Employee employee, long id);//update Employee crUd
	void DeleteEmployee(long id);//to delete employee cruD
	
}
