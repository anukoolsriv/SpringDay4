package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.EmployeeDao;
import com.lti.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public EmployeeDao getEmployeeDao() {
		return dao;
	}

	public void setEmployeeDao(EmployeeDao dao) {
		this.dao = dao;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		int result = dao.createEmployee(employee);
		
		if(result == 1) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Employee findEmployeeByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public boolean updateEmployee(Employee student) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
