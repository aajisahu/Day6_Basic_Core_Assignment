package com.day6corebasic;

import java.util.Random;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CouponNumber {
	private static final Logger Log= LogManager.getLogger(CouponNumber.class);

	public static int generateRandom() {

		Random rand = new Random();
		int random = rand.nextInt(999999);
		return random;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Log.info("Enter number of coupon : ");
		int coupon = sc.nextInt();
		sc.close();

		for (int i=1; i<=coupon; i++) {
			//calling random method to generate coupon
			generateRandom(); 
			//printing the values of getRandom method value as coupon
			Log.info(i +".Code for coupon :" + generateRandom());



		}

	}



}
