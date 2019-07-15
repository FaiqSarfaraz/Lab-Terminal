package calculator1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		Calculator c=new Calculator();
		assertEquals(10,c.equals(20));
	}
	@Test
	public void test2() {
		
		Calculator c=new Calculator();
		assertEquals(10,c.findMax(10, 20, 30));
	}
	
	
	@Test
	public void test3() {
		
		Calculator c=new Calculator();
		assertEquals(10,c.equals(30));
	}
	
}


