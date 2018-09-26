package com.javacodegeeks.examples.junitmavenexample;

public class Calculator implements ICalculator { //Begin class Calculator implements ICalculator.
	
	public int sum(int a, int b) { // Begin sum method.
		return a + b;
	} // Close sum method.
	
	public int subtraction(int a, int b) { // Begin subtraction method.
		return a - b;
	} // Close subtraction method.
	
	public int multiplication(int a, int b) { // Begin multiplication method.
		return a * b;
	} // Close multiplication method.
	
	public int division(int a, int b) throws Exception { // Begin division method with exception.
		if (b == 0) { // Begin if statement.
			throw new Exception("Divider can't be zero");
		} // Close if statement.
		return a / b;
	} // Close division method with exception.
	
	public boolean equalIntegers(int a, int b) { // Begin boolean equalIntegers method.
		boolean result = false;
		if (a == b) { // Begin if statement.
			result = true;
		} // Close if statement.
		return result;
	} // Close boolean equalIntegers method.
} // Close class Calculator implements ICalculator.
