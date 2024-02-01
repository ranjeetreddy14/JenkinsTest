package tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestRanjeet {

	@Test
	public void test() {
		UnitTestRanjeet obj1 = new UnitTestRanjeet();
		int output_f = obj1.square(5);
	// Testing the value of 5square
		assertEquals(25, output_f);
		
	}

}
