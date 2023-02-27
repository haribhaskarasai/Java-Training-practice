package com.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest2 {
	private Calculator calculator;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before every @test");
		calculator = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Afte every @test");
	}

	@Test
	public void testAdd() {
		assertEquals(50, calculator.add(20, 30));
	}

	@Test
	public void testDiv() {
		assertEquals(5, calculator.div(10, 2));
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testExceptionDiv() {
		assertEquals(5, calculator.div(-10, 2));
	}

}
