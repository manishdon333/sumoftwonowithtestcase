package com.man;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumToNumberTest {
	
	SumToNumber sum=new SumToNumber();
		// TODO Auto-generated constructor stub

	@Test
	public void sumTwoNo_true_result() {
		System.out.println("======================the is frst case result========================");
		assertEquals(30, sum.sumTowNo(10,20));
	}
	
	@Test
	public void sumTwoNo_false_result() {
		System.out.println("===================return false================================");
		assertEquals(38, sum.sumTowNo(10,20));
	}
	
	

}
