package com.globallogic.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;


public class TestRevertLinkedList {

	@Test
	public void testRevert() {
		MyLinkedList<Integer> mll1 = new MyLinkedList<Integer>();
		for (int i = 0; i <= 10; i++) {
			mll1.add(new Integer(i));
		}
	
		MyLinkedList<Integer> mll2 = new MyLinkedList<Integer>();
		for (int i = 10; i >= 0; i--){
			mll2.add(new Integer(i));
		}
		
		assertEquals(mll2.getHeader(), Reverter.revert(mll1.getHeader()));
		
	}
}
