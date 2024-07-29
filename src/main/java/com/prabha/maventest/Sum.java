package com.prabha.maventest;

/**
 * Hello world!
 *
 */

public final class Sum 
{

	private Sum() {
		super();
	}

	public static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int y = n % 10;
			sum = sum + y;
			n = n / 10;
		}
		return sum;
	}
}
