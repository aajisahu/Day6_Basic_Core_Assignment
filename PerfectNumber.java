package com.day6corebasic;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PerfectNumber {
	
	private static final Logger Log= LogManager.getLogger(StopWatch.class);
		public void check(int n) {

			int counter = 0;
			Log.info(n + " Divisor are :");

			for(int i = 1; i<n; i++) {
				if(n%i == 0) {
					Log.info(i + "+");
					counter += i;
				}
			}

			Log.info("\n");

			if(counter == n) {

				Log.info(n + " is Perfect number.");
			}
			else {

				Log.info(n + " is not a perfect number");
			}
		}

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);

			PerfectNumber obj = new PerfectNumber(); //creating object of the class

			Log.info("\n Enter number to check Perfect number :");
			 //taking input from user
			int number = scanner.nextInt();
			// calling check() method by passing the user input
			obj.check(number); 
			scanner.close();
		}


}
