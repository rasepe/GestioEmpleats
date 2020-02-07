package com.workforce.application;


import com.workforce.domain.*;
import com.workforce.persistence.EmployeeRepository;

public class WorkforceController {
	
	private EmployeeRepository repository = new EmployeeRepository();
	
	public void createEmployee(String name, String job) throws Exception{		
		Employee employee = new Employee(name, job);
		repository.addEmployee(employee);
	}
	
	public String getAllEmployees() {

		repository.getAllEmployees(); 

		String cadena="";

		for (int j=0; j<repository.getAllEmployees().size(); j++) {

			cadena += repository.getAllEmployees().get(j).toString();
		}

		return cadena;
	}

}
