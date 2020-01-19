<%@page import="com.lti.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> employees = (List<Employee>)request.getAttribute("employees");
		
		for(Employee emp : employees){
			out.println("Employee Id: " + emp.getEmployeeId() + "<br/>");
			out.println("Employee Name: " + emp.getEmployeeName() + "<br/>");
			out.println("Employee Salary: " + emp.getEmployeeSalary() + "<br/>");
			if(emp.getDepartment() != null){
				out.println("Department Id: " + emp.getDepartment().getDepartmentId() + "<br/>");
				out.println("Department Name: " + emp.getDepartment().getDepartmentName() + "<br/>");
			}
		}
	
	%>
</body>
</html>