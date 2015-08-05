package com.globallogic.linkedlist;

import com.globallogic.linkedlist.MyLinkedList.Entry;

public class Reverter {

	public static <E> Entry<E> revert(Entry<E> header) {
		if (header == null || header.next == null) {
			return header;
		}

		Entry<E> previousEntry = null;
		Entry<E> currentEntry = header;
		Entry<E> nextEntry = null;

		while (currentEntry != null) {
			nextEntry = currentEntry.next;
			currentEntry.next = previousEntry;
			previousEntry = currentEntry;
			currentEntry = nextEntry;
		}

		return previousEntry;
	}

}
