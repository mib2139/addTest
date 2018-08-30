package com.asvals.gntp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class addTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		adder add = new adder();
		int result = add.addition(10, 30);
		assertEquals(40, result);
	}

}
