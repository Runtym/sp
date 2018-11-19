package com.sp.sp;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NullTest {

	public String test;
	
	@Test
	public void nullTest() {
		assertNull(test);
	}
}
