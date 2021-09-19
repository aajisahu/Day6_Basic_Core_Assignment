package com.day6corebasic;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PrimeNumber {
	private static final Logger Log= LogManager.getLogger(PrimeNumber.class);
	
	// Parameterized constructor
	PrimeNumber(int n){ 
		int isPrime=1;
		for (int i=2; i<= n; i++) {

			if ( (n % i) == 0) {

				isPrime=0;
			}
		}

		if (isPrime == 1)
			Log.info(n + " is not a Prime Number");
		else 
			Log.info(n + " is a Prime Number");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Log.info("Enter number to check Prime or not : ");
		int input = scanner.nextInt();
		scanner.close();
		//creating object of the constructor and passing the user inputed value
		new PrimeNumber(input);
		
	}	

}
