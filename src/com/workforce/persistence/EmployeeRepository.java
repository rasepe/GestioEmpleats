package com.workforce.persistence;

import java.util.ArrayList;
import java.util.List;

import com.workforce.domain.Employee;

public class EmployeeRepository {

	private static List<Employee> employees=new ArrayList<>();
	
	public List<Employee> getAllEmployees(){
		return new ArrayList<>(employees);
	}


	public void addEmployee (Employee employee) throws Exception{
		if(employee==null) throw new Exception();
		employees.add(employee);
	}
	
}