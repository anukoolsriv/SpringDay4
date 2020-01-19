package com.lti.dao;

import java.util.List;

import com.lti.model.Employee;

public interface EmployeeDao {
	public int createEmployee(Employee employee);
	public Employee readEmployee(int employeeId);
	public int updateEmployee(Employee employee);
	public int deleteEmployee(int employeeId);
	public List<Employee> getAllEmployees();
}
