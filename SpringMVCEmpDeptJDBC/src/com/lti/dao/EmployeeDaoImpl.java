package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.lti.model.Employee;
import com.lti.utils.JpaUtils;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager entityManager;
	
	public EmployeeDaoImpl() {
		entityManager = JpaUtils.getEntityManager();
	}
	
	@Override
	public int createEmployee(Employee employee) {
		entityManager.getTransaction().begin();
		entityManager.persist(employee);
		entityManager.getTransaction().commit();
		return 1;
	}

	@Override
	public Employee readEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Employee> getAllEmployees() {
		String jpql = "From Employee";
		TypedQuery<Employee> typed = entityManager.createQuery(jpql, Employee.class);
		return typed.getResultList();
	}

}
