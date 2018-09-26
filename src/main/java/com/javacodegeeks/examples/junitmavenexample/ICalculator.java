package com.javacodegeeks.examples.junitmavenexample;
//Craig Longnecker

public interface ICalculator { // Begin interface ICalculator.
	int sum(int a, int b);
	
	int subtraction(int a, int b);
	
	int multiplication(int a, int b);
	
	int division(int a, int b) throws Exception;
	
	boolean equalIntegers(int a, int b);
} // Close interface ICalculator
