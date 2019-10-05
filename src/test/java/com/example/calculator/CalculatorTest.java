package com.example.calculator;

import org.junit.Test;

import com.example.calculator.service.Calculator;

import junit.framework.Assert;

public class CalculatorTest {

	private Calculator calculator = new Calculator();
	
	@Test
	public void testSum(){
		Assert.assertEquals(5, calculator.sum(2, 3));
	}
}
