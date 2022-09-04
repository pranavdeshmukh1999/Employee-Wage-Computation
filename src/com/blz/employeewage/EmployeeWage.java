package com.blz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");

		int wagePerHour = 20;
		int fullDayHours=8;
		int halfDayHours=4;
		int salary=0;
		
		Random random = new Random();

		int randomNum = random.nextInt(3);

		if (randomNum == 1)
		{
			System.out.println("Employee is present");
			salary = wagePerHour * fullDayHours;
		}
		
		else if (randomNum == 2) 
		
			salary = wagePerHour * halfDayHours;
		
		else
			System.out.println("Employee is absent");
		
		System.out.println("Employee salary :"+salary);
	}

}
