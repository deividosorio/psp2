/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp2.modelo;

import junit.framework.TestCase;

/**
 *
 * @author deividosorio
 */
public class CalculatorTest extends TestCase {
    
    public CalculatorTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of getP method, of class Calculator.
     */
    public void testGetP() {
        System.out.println("getP");
        Calculator test1 = new Calculator(1.1 , 9);
        double expResult1 = 0.35006;
        double result1 = test1.getP();
        assertEquals(expResult1, result1, 0.001);
        
        
        Calculator test2 = new Calculator(1.1812 , 10);
        double expResult2 = 0.36575;
        double result2 = test2.getP();
        assertEquals(expResult2, result2, 0.1);
        
        
        Calculator test3 = new Calculator(2.750 , 30);
        double expResult3 = 0.49500;
        double result3 = test3.getP();
        assertEquals(expResult3, result3, 0.01);
    }
}
