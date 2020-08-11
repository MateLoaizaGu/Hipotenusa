/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleMath;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SimpleMathTest {
    
    public SimpleMathTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class SimpleMath.
     */
    @Test
    public void testAdd() {
        System.out.println("Prueba de la suma");
        int a = 5;
        int b = 5;
        int expResult = 10;
        int result = SimpleMath.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class SimpleMath.
     */
    @Test
    public void testMultiply() {
        System.out.println("Esta es la multiplicacion");
        int a = 5;
        int b = 5;
        int expResult = 25;
        int result = SimpleMath.multiply(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of substract method, of class SimpleMath.
     */
    @Test
    public void testSubstract() {
        System.out.println("Esta es la division");
        int a = 2;
        int b = 2;
        int expResult = 1;
        int result = SimpleMath.substract(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
