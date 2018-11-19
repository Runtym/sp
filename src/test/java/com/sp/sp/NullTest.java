package com.sp.sp;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NullTest {

	public String test;
	
	@Test
	public void nullTest() {
		if(test.equals("a")) {
			System.out.println("test is a");
		}
	}
}
