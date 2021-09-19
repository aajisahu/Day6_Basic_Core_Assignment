package com.day6corebasic;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReverseNumber {
	private static final Logger Log= LogManager.getLogger(ReverseNumber.class);

	// Parameterized constructor
	ReverseNumber(int n) { 
		int reverseNumber=0;
		while(n!=0) {
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber + n%10;
			n=n/10;

		}
		Log.info("Reverse of entered number is: " + reverseNumber );
	}


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Log.info("Enter number to Reverse Value: ");
		int input = scanner.nextInt();

		if (input !=0)
			//creating object of the constructor and passing the user inputed value
			new ReverseNumber(input);

		else
			Log.info("You have entered a wrong number : try again ");

		scanner.close();

	}	
}
