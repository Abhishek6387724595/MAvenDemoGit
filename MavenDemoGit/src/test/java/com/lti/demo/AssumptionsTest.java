package com.lti.demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTest {
	//int num;
	
	@Test
    void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")), AssumptionsTest::message);
        System.out.println(" continue execution");
         //num=1000;
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")),AssumptionsTest::message);
        System.out.println(" don't continue execution");
         //num=1000;
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }
}
