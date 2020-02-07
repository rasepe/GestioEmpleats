package com.workforce.view;

import com.workforce.application.WorkforceController;
import com.workforce.domain.Job;
import com.workforce.persistence.EmployeeRepository;

public class Main {
	//private static final Job MANAGER = null;
	private static WorkforceController controller=new WorkforceController();
	
	private static Job job;
	
	public static void main(String[] args) throws Exception {
		//controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 100.0);
		controller.createEmployee("Rafael", "MANAGER");
		
		
		String allEmployees=controller.getAllEmployees();
		System.out.println("EMPLOYEES:\n" + allEmployees + " \n");
		
		
	}
}
