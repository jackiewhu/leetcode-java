package io.jack;

import org.junit.Before;

public class ImprovedLargestNumberTest extends AbstractLargestNumberTest{

	@Before
	@Override
	public final void setUp() throws Exception {
		largestNum = new ImprovedLargestNumber();
	}
	
	public static void main(String[] args) {
		int[] testNums = new int[]{3, 30, 34, 5, 9};
		
		new ImprovedLargestNumber().largestNumber(testNums);
	}

}
