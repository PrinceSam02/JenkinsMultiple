package com.prince.multiple;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



 class MultTest  {

	
		private Mult mult;
		
		@BeforeEach
		public void setUp() {
		mult = new Mult();
		}
		
		@AfterEach
		public void tearDown() {
			mult = null;
			System.out.println("Test Finished");
		}
		
		@Test
		void testMult() {
			int result = mult.mult(2, 3);
			assertEquals(6,result);
			
	}

}
