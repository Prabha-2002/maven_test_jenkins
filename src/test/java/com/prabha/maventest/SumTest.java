package com.prabha.maventest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SumTest {

	@Test
	void testSumOfDigits() {
		assertEquals(10,Sum.sumOfDigits(55));

	}

}
