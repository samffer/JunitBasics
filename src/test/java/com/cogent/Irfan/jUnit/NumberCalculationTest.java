package com.cogent.Irfan.jUnit;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NumberCalculationTest {
	NumberCalculation nc;
	
	@BeforeEach
	void init() {
		nc=new NumberCalculation();
	}
	
	@Test
	void testAddition() {
		assertEquals(nc.add(10, 20), 100);
	}
	
	@Nested
	class AddTest{
		
		@Test
		void addPositive() {
			assertEquals(nc.add(50,30),80);
		}
		
		@Test
		void addNegative(){
			assertEquals(-2, nc.add(-1, -1));
		}
		
		
	}
	
	@Test
	void testMultiply() {
		assertAll(
				()->assertEquals(1,nc.multiply(1,0)),
				()->assertEquals(1, nc.multiply(7, 1)),
				()->assertEquals(20, nc.multiply(4,5))
				);
	}
	
	@Test
	void testDevide() {
		assertThrows(ArithmeticException.class, ()->nc.divide(1, 0),"denominator shold not be zero");
	}

}
