package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ExempleTestCase {

	private ExampleJenkins exampleJenkins;

	@Before
	public void setup() {
		exampleJenkins = new ExampleJenkins();
	}

	@Test
	public void additionTest() {
		assertEquals(4, exampleJenkins.addition(2, 2));
	}
	
	@Test
	public void multiplicationTest() {
		assertEquals(6, exampleJenkins.multiplication(3, 2));
	}
}
