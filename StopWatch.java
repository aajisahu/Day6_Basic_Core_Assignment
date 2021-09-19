package com.day6corebasic;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StopWatch {
	private static final Logger Log= LogManager.getLogger(StopWatch.class);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Log.info("***********\nSTOPWATCH\n***********");

		double start = 0.0;
		double stop = 0.0;


		while(true) {
			Log.info("Press : 1.Start 2.Stop 3.quit");
			int number2 = sc.nextInt();

			switch (number2) {
			case 1:
				if(start == 0) {
					start = System.currentTimeMillis();
					break;
				}
				else {
					Log.info("Already started..");
					break;
				}

			case 2:
				if(start != 0) {
					stop = System.currentTimeMillis();
					double elapsedTime = stop - start /1000.0;
					Log.info("Elapsed Time is :" + elapsedTime);
					start = 0.0;
					stop = 0.0;
					elapsedTime = 0.0;
					break;
				}
				else
				{
					Log.info("First Start watch..");
				}
				break;

			case 3:
				break;
			}

		}	
	}

}
