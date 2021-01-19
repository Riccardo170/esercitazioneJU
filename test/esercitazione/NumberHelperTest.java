/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEven() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(2);
        boolean expResult = true;
        NumberHelper instance1 = new NumberHelper(3);
        boolean expResult1 = false;
        assertEquals(expResult, expResult1);
       
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = true;
        NumberHelper instance1 = new NumberHelper(4);
        boolean result = false;
        assertEquals(expResult, result);

    }

    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 7;  
        NumberHelper instance = new NumberHelper(5);
        int expResult = 12;
        int result = instance.sum(n);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
  
    }

    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleBy() {
        System.out.println("isDivisibleBy");
        int n = 6;
        NumberHelper instance = new NumberHelper(2);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy();
        assertEquals(expResult, result);
    }
    
}
