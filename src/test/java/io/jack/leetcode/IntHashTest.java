package io.jack.leetcode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntHashTest extends LargestNumber {

	@Test
	public final void testHash() {
		
		assertTrue(IntHash.hash(99) > IntHash.hash(998));
		assertTrue(IntHash.hash(21) > IntHash.hash(1111));
		assertTrue(IntHash.hash(9) > IntHash.hash(34));
		assertTrue(IntHash.hash(34) > IntHash.hash(30));
		assertTrue(IntHash.hash(3) > IntHash.hash(30));
		assertTrue(IntHash.hash(3) < IntHash.hash(34));
		assertTrue(IntHash.hash(3) == IntHash.hash(33));
	}
	
	@Test
	public final void testIntHash() {
		
		assertTrue(new IntHash(99).hash > new IntHash(998).hash);
		assertTrue(new IntHash(21).hash > new IntHash(1111).hash);
		assertTrue(new IntHash(9).hash > new IntHash(34).hash);
		assertTrue(new IntHash(34).hash > new IntHash(30).hash);
		assertTrue(new IntHash(3).hash > new IntHash(30).hash);
		assertTrue(new IntHash(3).hash < new IntHash(34).hash);
		assertTrue(new IntHash(3).hash == new IntHash(33).hash);
		
	}
	
	@Test
	public final void testZero() {
		assertTrue(new IntHash(0).hash == 0.0);
	}
	
	public static void main(String[] args) {
		System.out.println(new IntHash(998).hash);
	}

}
