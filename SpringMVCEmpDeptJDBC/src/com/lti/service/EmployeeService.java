package com.lti.service;

import java.util.List;

import com.lti.model.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public Employee findEmployeeByEmployeeId(int employeeId);
	List<Employee> getAllEmployees();
	public boolean updateEmployee(Employee student);
	boolean deleteEmployee(int employeeId);
}
