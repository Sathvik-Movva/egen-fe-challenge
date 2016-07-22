package sample;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest{
	

	@Test
	public void test1() {
		Calculator cal = new Calculator();
		double result = cal.adds(1,2);
		assertEquals(3.0,result,0);
		
	}
	@Test
	public void test2() {
		Calculator cal = new Calculator();
		double result = cal.subtracts(9,2);
		assertEquals(7.0,result,0);
		
	}
	@Test
	public void test3() {
		Calculator cal = new Calculator();
		double result = cal.multiplies(4,3);
		assertEquals(12.0,result,0);
	}
	@Test
	public void test4() {
		Calculator cal = new Calculator();
		double result = cal.divides(10,2);
		assertEquals(5.0,result,0);
		
	}
	@Test
	public void test5() {
		Calculator cal = new Calculator();
		String result = cal.dndby0(5,0);
		assertTrue("NaN".equals(result));
		
	}
	
}
