package com.springbootwithjpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employeetable")
public class Employee implements Serializable {

@Id
@Column(name="employee_id",length=5)
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int empId;
@Column(name="employee_name",length=5)
private String empName;
@Column(name="employee_salary",length=5)
private float salary;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

}
