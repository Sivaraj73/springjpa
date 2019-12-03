package com.springbootwithjpa.service;

import java.util.List;

import com.springbootwithjpa.model.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);
	public Employee readEmployeeById(int empId);
	public Employee readEmployeeByName(String empName);
	public int updateEmployee(String empName,int empId);
	public Employee deleteEmployeeById(int empId);
	public List<Employee> getAllEmployees();
	public Employee readEmpIdAndEmpName(int empId,String empName);
}
