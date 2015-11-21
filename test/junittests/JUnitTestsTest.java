
package junittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class JUnitTestsTest {
    
    public JUnitTestsTest() {
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
     * Test of add method, of class JUnitTests.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        String s1 = "2";
        String s2 = "2";
        JUnitTests instance = new JUnitTests();
        int expResult = 4;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
       
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add");
        String s1 = "5";
        String s2 = "2";
        JUnitTests instance = new JUnitTests();
        int expResult = 7;
        int result = instance.add(s1, s2);
        assertEquals(expResult, result);
       
    }
    
    @Test(expected=NumberFormatException.class)
    public void testAdd3() {
        System.out.println("add");
        String s1 = "test";
        String s2 = "2";
        JUnitTests instance = new JUnitTests();
        int result = instance.add(s1, s2);
    
    }
    
    
}
