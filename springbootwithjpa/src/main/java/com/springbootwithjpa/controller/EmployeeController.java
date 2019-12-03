package com.springbootwithjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootwithjpa.model.Employee;
import com.springbootwithjpa.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping(value="/create")
	public Employee CreateOperation(@RequestBody Employee employee)
	{
		return this.employeeService.createEmployee(employee);
	}
	
	@GetMapping(value="/findEmployee/{id}")
	public Employee readMethod(@PathVariable("id") int empId)
	{
		return this.employeeService.readEmployeeById(empId);
		
	}
	
	@GetMapping(value="/findEmployee1/{name}")
	public Employee readMethod1(@PathVariable("name") String empName)
	{
		return this.employeeService.readEmployeeByName(empName);
		
	}
	
	@DeleteMapping(value="/findEmployee1/{id}")
	public Employee delMeth(@PathVariable("id") int empId)
	{
		return this.employeeService.deleteEmployeeById(empId);
	}
	@GetMapping(value="/getAll")
	public List<Employee> readMethod2()
	{
	  	return this.employeeService.getAllEmployees();
	}
	@GetMapping(value="/two/{param1}/{param2}")
	public Employee readBoth(@PathVariable("param1")int x,@PathVariable("param2")String y)
	{
		return this.employeeService.readEmpIdAndEmpName(x, y);
		
	}
	@PutMapping(value="/update/{name}/{id}")
	public int updMeth(@PathVariable("name")String empName,@PathVariable("id")int empId)
	{
		return this.employeeService.updateEmployee(empName, empId);
	}
	

}
