/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maast
 */
public class test {
    
     
   //test1 Positive = new test1();
   //Palindromo p1= new Palindromo(); 
   idMaestroAlumno b= new idMaestroAlumno();
   
   /*
    @Test
    public void testSomething() {
        assertEquals(15, Positive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Positive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Positive.sum(new int[]{-1,2,3,4,-5}));
        
        
        
    } 
      
      @Test
    public void testPalindrome() {
        assertEquals(true, p1.checkpalindrome("oso"));
       assertEquals(true, p1.checkpalindrome("ana"));
       assertEquals(true, p1.checkpalindrome("holi"));
    }   
    
    */
    
    public test() {
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

 
        @Test
    public void testID() {
        assertEquals("Alumno_OK", b.checkID(2,"al060878"));
       assertEquals("Alumno_OK", b.checkID(2,"al011122"));
       assertEquals("Maestro_OK", b.checkID(1,"1001"));
       assertEquals("Maestro_OK", b.checkID(1,"1002"));
    }  

    
          @Test
    public void testID2() {
        assertEquals("ERROR01", idMaestroAlumno.checkID(1,"999"));
       assertEquals("ERROR01", idMaestroAlumno.checkID(1,"10001"));
       assertEquals("ERROR02", idMaestroAlumno.checkID(2,"al999"));
       assertEquals("ERROR02", idMaestroAlumno.checkID(2,"al1671119"));
    }  

    
    
    
}
