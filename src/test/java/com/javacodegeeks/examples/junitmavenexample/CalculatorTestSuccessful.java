package com.javacodegeeks.examples.junitmavenexample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
// Craig Longnecker
// Tutorial used: https://examples.javacodegeeks.com/enterprise-java/maven/junit-maven-example/

public class CalculatorTestSuccessful { // Begin class CalculatorTestSuccessful.
	private static ICalculator calculator;
// Begin JUnit test methods.	
	@BeforeClass
	public static void initCalculator() {
		calculator = new Calculator();
	}
	
	@Before
	public void beforeEachTest() {
		System.out.println("This is executed before each Test");
	}
	
	@After
	public void afterEachTest() {
		System.out.println("This is executed after each Test");
	}
	
	@Test
	public void testSum() {
		int result = calculator.sum(3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testMultiplication() {
		int result = calculator.multiplication(9, 3);
		assertEquals(27, result);
	}

	@Test
	public void testDivision() {
		try {
		int result = calculator.division(10, 2);
		assertEquals(5, result);
		}
		catch (Exception e){
			e.printStackTrace(System.err);
		}
	}
	
	@Test(expected = Exception.class)
	public void testDivisionException() throws Exception {
		calculator.division(10, 0);
	}
	
	@Ignore
	@Test
	public void testEqual() {
		boolean result = calculator.equalIntegers(20, 20);
		assertFalse(result);
	}
	
	@Ignore
	@Test
	public void testSubtraction() {
		int result = 10 - 3;
		assertTrue(result == 9);
	}
// Close JUnit test methods
} // Close class CalculatorTestSuccessful.
