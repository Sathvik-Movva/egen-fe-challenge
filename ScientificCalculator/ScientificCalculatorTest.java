package sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScientificCalculatorTest {

	@Test
	public void test() {
		ScientificCalculator scal = new ScientificCalculator();
		double result = scal.sine(Math.PI/2);
		assertEquals(1,result,0);
	}
	@Test
	public void test1() {
		ScientificCalculator scal = new ScientificCalculator();
		double result = scal.sine(Math.PI/2);
		assertEquals(1,result,0);
	}
	@Test
	public void test2() {
		ScientificCalculator scal = new ScientificCalculator();
		double result = scal.cosine(Math.PI);
		assertEquals(-1,result,0);
	}
	@Test
	public void test3() {
		ScientificCalculator scal = new ScientificCalculator();
		double result = scal.tangent(0);
		assertEquals(0,result,0);
	}
	@Test
	public void test4() {
		ScientificCalculator scal = new ScientificCalculator();
		double result = scal.logarithm(1);
		assertEquals(0,result,0);
	}
	
}
