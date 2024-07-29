package com.prabha.maventest;

/**
 * Hello world!
 *
 */
public class sum 
{
	public sum() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static int SumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			int y = n % 10;
			sum = sum + y;
			n = n / 10;
		}
		return sum;
	}
}
