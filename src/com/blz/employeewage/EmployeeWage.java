package com.blz.employeewage;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("Welcome to Employee Wage Computation");

		int wagePerHour = 20;
		int fullDayHours = 8;
		int halfDayHours = 4;
		int salary = 0;
		int workingDayPerMonth=20;
		int monthlySalary = 0;

		Random random = new Random();

		int randomNum = random.nextInt(3);

		for (int i = 1; i <= workingDayPerMonth ;i++) 
		{
			switch (randomNum) {

			case 0:
				System.out.println("Employee is absent");
				break;
				
			case 1:
				System.out.println("Employee is present");
				salary = wagePerHour * fullDayHours;
				monthlySalary = monthlySalary + salary;
				break;
				
			case 2:
				salary = wagePerHour * halfDayHours;
				monthlySalary = monthlySalary + salary;
				break;
			}


			System.out.println("Employee Monthly Salary is : "+monthlySalary);
		}

	}
}