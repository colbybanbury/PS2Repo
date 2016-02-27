package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	
	MyInteger c;
	int testVal;
	MyInteger p;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c = new MyInteger(2);
		p = new MyInteger(2);
	}

	@After
	public void tearDown() throws Exception {
		c = null;
		p = null;
	}

	@Test
	public void testEquals() {
		assertTrue(c.equals(2));
		assertTrue(c.equals(p));
		
		p.set(5);
		assertFalse(c.equals(1));
		assertFalse(c.equals(p));
	}
	@Test
	public void testEven()  {
		assertTrue(c.isEven(testVal));
		assertTrue(c.isEven());
		assertTrue(c.isEven(p));
		
		testVal = 1;
		c = new MyInteger(testVal);
		p = new MyInteger(testVal);
		
		assertFalse(c.isEven(testVal));
		assertFalse(c.isEven());
		assertFalse(c.isEven(p));
		
	}
	@Test
	public void testOdd()  {
		assertFalse(c.isOdd());
		assertFalse(c.isOdd(testVal));
		assertFalse(c.isOdd(p));
		
		testVal = 1;
		c = new MyInteger(testVal);
		p = new MyInteger(testVal);
		
		assertTrue(c.isOdd());
		assertTrue(c.isOdd(testVal));
		assertTrue(c.isOdd(p));
	}
	
	@Test
	public void testPrime() {
		c = new MyInteger(1);
		p = new MyInteger(1);
		assertTrue(c.isPrime(1));
		assertTrue("True Prime()",c.isPrime());
		assertTrue("True Prime(p)",c.isPrime(p));
	}
	@Test
	public void testPrime1() {
		c = new MyInteger(4);
		p = new MyInteger(4);
		assertFalse("False Prime(value)",c.isPrime(4));
		assertFalse("False Prime()",c.isPrime());
		assertFalse("False Prime(p)",c.isPrime(p));
	}
	@Test
	public void testPrime2() {
		c = new MyInteger(3);
		p = new MyInteger(3);
		
		assertTrue("True Prime(value)",c.isPrime(5));
		assertTrue("True Prime()",c.isPrime());
		assertTrue("True Prime(p)",c.isPrime(p));
		
	}
	
	@Test
	public void testGet() {
		assertEquals(c.get(), 2);
	}
	
	@Test
	public void testSet(){
		c.set(4);
		assertEquals(c.get(), 4);
	}
		
		

}
