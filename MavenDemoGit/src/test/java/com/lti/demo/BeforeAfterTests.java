package com.lti.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.Calculator;

public class BeforeAfterTests {
	
	Calculator c=new Calculator();
	@Test
	public void testAdd() {
		
		int r=c.add(100,200);
		Assertions.assertEquals(300,r,"Check add value");
		Assertions.assertFalse("Abhi".length()==5);
	}

}
