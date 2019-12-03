package com.springbootwithjpa.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootwithjpa.dao.EmployeeRepository;
import com.springbootwithjpa.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public Employee createEmployee(Employee employee) {
		this.employeeRepository.save(employee);
		return employee;
	}

	@Override
	public Employee readEmployeeById(int empId) {
		return this.employeeRepository.findByEmpId(empId);
		/*
		Optional<Employee> opt=employeeRepository.findById(empId);
		if(opt.isPresent())
		{
			opt.e
		}
		else
		{
			
		}*/
	}

	@Override
	public int updateEmployee(String empName,int empId) {
		/*this.employeeRepository.s*/
	  return this.employeeRepository.updateEmployee(empName, empId);
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return this.employeeRepository.deleteById(empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return this.employeeRepository.findAll();
	}

	@Override
	public Employee readEmployeeByName(String empName) {
		// TODO Auto-generated method stub
		return this.employeeRepository.findByEmpName(empName);
	}

	@Override
	public Employee readEmpIdAndEmpName(int empId, String empName) {
		// TODO Auto-generated method stub
		return this.employeeRepository.findByEmpIdAndEmpName(empId, empName);
	}
	
}
