package com.globallogic.linkedlist;

public class MyLinkedList<E> {

	public Entry<E> getHeader() {
		return header;
	}

	private Entry<E> header;
	private Entry<E> tail;
	private int size;

	static class Entry<E> {
		public Entry(E element, Entry<E> next) {
			this.element = element;
			this.next = next;
		}

		E element;
		Entry<E> next;

		
		public Entry<E> getNext() {
			return next;
		}

		public E getElement() {
			return element;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((element == null) ? 0 : element.hashCode());
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Entry other = (Entry) obj;
			if (element == null) {
				if (other.element != null)
					return false;
			} else if (!element.equals(other.element))
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			return true;
		}
	}

	public void add(E element) {
		if (size == 0) {
			header = tail = new Entry<E>(element, null);

		} else {
			Entry<E> newEntry = new Entry<E>(element, null);
			tail.next = newEntry;
			tail = newEntry;
		}
		size++;
	}

}
