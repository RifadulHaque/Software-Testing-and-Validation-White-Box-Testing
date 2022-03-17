//package ch07;
//import heap.*;
//
//public class HeapSort {
//
//
//	public static <E extends Comparable<? super E>> void sort(E[] A) {
//		  heapsort(A);
//		}
//
//		static <E extends Comparable<? super E>>
//		void heapsort(E[] A) {
//		  // The heap constructor invokes the buildheap method
//		  MaxHeap<E> H = new MaxHeap<E>(A, A.length, A.length);
//
//		  E[] temp = (E[])new Comparable[A.length];
//		  for (int i=A.length-1; i>=0; i--)  // Now sort
//		    temp[i] = H.removemax(); // Removemax places max at end of heap
//
//		}
//
//
//}
