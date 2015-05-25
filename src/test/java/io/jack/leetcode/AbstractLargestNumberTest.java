package io.jack.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public abstract class AbstractLargestNumberTest {
	
	protected AbstractLargestNumber largestNum;
	
	protected int[] testNums;
	
	@Before
	public abstract void setUp() throws Exception;

	@Test
	public final void smokeTestLargestNumber() {
		testNums = new int[]{3, 30, 34, 5, 9};
		
		assertEquals("9534330", largestNum.largestNumber(testNums));
	}
	
	@Test
	public final void testZeroLargestNumber() {
		testNums = new int[]{0, 0};
		
		assertEquals("0", largestNum.largestNumber(testNums));
		
		testNums = new int[]{0, 0, 1};
		
		assertEquals("100", largestNum.largestNumber(testNums));
		
		testNums = new int[]{0, 0, 0};
		
		assertEquals("0", largestNum.largestNumber(testNums));
		
	}
	
	@Test
	public final void testOneSizeLargestNumber() {
		testNums = new int[]{1};
		
		assertEquals("1", largestNum.largestNumber(testNums));
	}
	
	@Test
	public final void testBigIntLargestNumber() {
		testNums = new int[]{999999998,999999997,999999999};
		
		assertEquals("999999999999999998999999997", largestNum.largestNumber(testNums));
	}

}
