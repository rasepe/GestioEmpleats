package com.workforce.domain;

public enum Job {
	ASSISTANT (1000),
	MANAGER (2000),
	BOSS (3000);

	private final double salary;

	Job(double salary) {
		this.salary = salary;
	}

	double salary() { return salary; }
	
	
}
