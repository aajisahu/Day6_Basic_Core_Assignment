package com.day6corebasic;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.bridgelabz.Day3Assignment.EmployeeWage;

public class Fibonacci {
	private static final Logger Log= LogManager.getLogger(EmployeeWage.class);

	public static void main(String[] args) {

		int num1 = 0;
		int num2 = 1;
		int num3 = 0;

		//taking input from user
		Scanner sc = new Scanner(System.in);
		Log.info("Enter a number for Fibonacci : ");
		int number = sc.nextInt();
		sc.close();
		//checking condition for fibonacci  
		for (int i = 2; i <number;i++) {
			num3 = num1 + num2;
			Log.info("" + num3);
			num1 = num2;
			num2 = num3;
		}

		Log.info("Fibonacci is :" + num3);
		sc.close();

	}

}