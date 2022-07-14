package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

class CalculatorTest {
	Calculator c=new Calculator();
	
	//@Disabled
	@Test
	public void testAdd() {
		
		int r=c.add(100,200);
		Assertions.assertEquals(300,r,"Check add value");
		Assertions.assertFalse("Abhi".length()==5);
	}
	
	
	@Test
	public void testAssertfalse()
	{
		Assertions.assertEquals("Hello","Hello");
	}
	
	@Test
	public void testAssertNull() {
		String str1=null;
		String str2="abc";
		Assertions.assertNotNull(str2);
	}
	
	@Test
	public void testArrayList() {
		ArrayList<Integer>myList=new ArrayList<Integer>();
		Assertions.assertEquals(0,myList.size());
		myList.add(500);
		myList.add(800);
		Assertions.assertEquals(2, myList.size());
		//Assertions
	}
}
