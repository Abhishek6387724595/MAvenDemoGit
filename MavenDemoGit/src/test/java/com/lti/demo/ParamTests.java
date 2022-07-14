package com.lti.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParamTests {
	
	
	
	
	@ParameterizedTest
	@ValueSource(ints= {8,10,20,50,100})
	public void testArrays(int arg)
	{
		System.out.println("arg "+arg);
		Assertions.assertTrue(arg%2==0);
	}
	
	@ParameterizedTest
	@DisplayName("Should Pass all non null arguments to methods")
	@ValueSource(strings= {"Hello","World","GET1024"})
	public void testParam(String msg) {
		Assertions.assertNotNull(msg);
	}
	
	
	
	@RepeatedTest(8)
	public void shouldRepeat() {
		int x=5,y=3;
		Assertions.assertEquals(15,x*y);
	}
	
	
	
	@Test
	public void testLambda() {
		Integer[] intAry= {2,3,7,5,10};
		List<Integer> numbers=  Arrays.asList(intAry);
	}
	
	
	
	@Test
	public void testExceptions() {
		Assertions.assertThrows(NumberFormatException.class,()->{
			Integer.parseInt("Two");
		});
	}
}
