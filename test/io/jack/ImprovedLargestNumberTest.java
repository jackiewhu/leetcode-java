package io.jack;

import org.junit.Before;

public class ImprovedLargestNumberTest extends AbstractLargestNumberTest{

	@Before
	@Override
	public final void setUp() throws Exception {
		largestNum = new ImprovedLargestNumber();
	}

}
