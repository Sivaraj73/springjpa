package com.springbootwithjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.springbootwithjpa.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,  Integer> 
{
  public Employee findByEmpId(int value);
  
  public Employee findByEmpName(String name);
  
  public List<Employee> findAll();
  
  public Employee findByEmpIdAndEmpName(int val, String name);
  
  public Employee deleteById(int value);
  
  @Query("update Employee set empName=:name where empId=:id")
  public int updateEmployee(@Param("name")String empName,@Param("id")int empId);
}
