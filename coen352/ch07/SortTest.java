package ch07;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ch4.list.*;


public class SortTest {
	
	final static int testsize = 5;
	Double A[];
	static int THRESHOLD = 8;
	
	 private static ADTList<Integer> list;

	@SuppressWarnings("removal")
	@BeforeEach
	void setUp() throws Exception {
//		A = new Double[testsize];
//	    for (int i=0; i<testsize; i++) {
//			//A[i] = new Double(DSutil.random(3));// return int basic type, new Integer from int.
//
//	    }
	  //list = new LList<Integer>();
	   list = new DList<Integer>();
	   // list = new AList<Integer>();

	}

	@Test
	void testQuick() {

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			//A[i] = new Double(DSutil.random(3));// return int basic type, new Integer from int.

			A[0]=new Double(5);
			A[1]=new Double(3);
			A[2]=new Double(2);
			A[3]=new Double(1);
			A[4]=new Double(4);

		}

		QuickSort.sort(A);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

//		for (int i=0; i<testsize; i++) {
//			System.out.print(A[i]+ " ");
//		}
	}
	// The Pivot is set to the median element in the Array
	@Test
	void testQuickBestCaseBaseChoice() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			A[0]=new Double(1);
			A[1]=new Double(2);
			A[2]=new Double(3);
			A[3]=new Double(4);
			A[4]=new Double(5);
		}

		System.out.print("Best Case Base Choice before sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==4){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,0);

		//Here the qsort is used which sets the pivot to the median of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsort(A,0,4);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nBest Case Base Choice after sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==4){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

	 	assertEquals(elementsSorted,5);
	}
	// The Pivot is set to the median element in the Array
	@Test
	void testQuickBestCaseCombination1() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[7];
		for (int i=0; i<7; i++) {
			A[0]=new Double(1);
			A[1]=new Double(2);
			A[2]=new Double(3);
			A[3]=new Double(4);
			A[4]=new Double(5);
			A[5]=new Double(6);
			A[6]=new Double(7);

		}

		System.out.print("Best Case Combination-1 before sorting: ");
		for (int i=0; i<7; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<7; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==6){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,0);

		//Here the qsort is used which sets the pivot to the median of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsort(A,0,4);
		for (int i=1; i<7; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nBest Case Combination-1 after sorting: ");
		for (int i=0; i<7; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<7; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==6){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,7);
	}

	// The Pivot is set to the median element in the Array
	@Test
	void testQuickBestCaseCombination2() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			A[0]=new Double(1);
			A[1]=new Double(3);
			A[2]=new Double(2);
			A[3]=new Double(4);
			A[4]=new Double(5);
		}

		System.out.print("Best Case Combination-2 before sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==4){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,2);

		//Here the qsort is used which sets the pivot to the median of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsort(A,0,4);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nBest Case Combination-2 after sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==4){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,5);
	}

	// The Pivot is set to the last element in the Array
	@Test
	void testQuickWorseCaseBaseChoice() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			A[0]=new Double(1);
			A[1]=new Double(2);
			A[2]=new Double(3);
			A[3]=new Double(4);
			A[4]=new Double(5);
		}

		System.out.print("Worse Case Base Choice before sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==4){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,0);

		//Here the qsortWorse is used which sets the pivot to the last of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsortWorse(A,0,4);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nWorse Case Base Choice after sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==4){
			elementsSorted++;
			System.out.print("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,5);
	}
	// The Pivot is set to the last element in the Array
	@Test
	void testQuickWorseCaseCombination1() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[7];
		for (int i=0; i<7; i++) {
			A[0]=new Double(1);
			A[1]=new Double(2);
			A[2]=new Double(3);
			A[3]=new Double(4);
			A[4]=new Double(5);
			A[5]=new Double(6);
			A[6]=new Double(7);

		}

		System.out.print("Worse Case Combination-1 before sorting: ");
		for (int i=0; i<7; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<7; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==6){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,0);

		//Here the qsortWorse is used which sets the pivot to the last of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsortWorse(A,0,4);
		for (int i=1; i<7; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nWorse Case Combination-1 after sorting: ");
		for (int i=0; i<7; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<7; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==6){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,7);
	}

	// The Pivot is set to the last element in the Array
	@Test
	void testQuickWorseCaseCombination2() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			A[0]=new Double(1);
			A[1]=new Double(3);
			A[2]=new Double(2);
			A[3]=new Double(4);
			A[4]=new Double(5);
		}

		System.out.print("Worse Case Combination-2 before sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==4){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,2);

		//Here the qsortWorse is used which sets the pivot to the last of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsortWorse(A,0,4);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nWorse Case Combination-2 after sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==4){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,5);
	}

	//The pivot is set to the 1/4th of the number of elements
	@Test
	void testQuickAverageCaseBaseChoice() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			A[0]=new Double(1);
			A[1]=new Double(2);
			A[2]=new Double(3);
			A[3]=new Double(4);
			A[4]=new Double(5);
		}

		System.out.print("Average Case Base Choice before sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==4){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,0);

		//Here the qsortAverage is used which sets the pivot to the 1/4th of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsortAverage(A,0,4);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nAverage Case Base Choice after sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==4){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,5);
	}

	//The pivot is set to the 1/4th of the number of elements
	@Test
	void testQuickAverageCaseCombination1() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[7];
		for (int i=0; i<7; i++) {
			A[0]=new Double(1);
			A[1]=new Double(2);
			A[2]=new Double(3);
			A[3]=new Double(4);
			A[4]=new Double(5);
			A[5]=new Double(6);
			A[6]=new Double(7);

		}

		System.out.print("Average Case Combination-1 before sorting: ");
		for (int i=0; i<7; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<7; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==6){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,0);

		//Here the qsortAverage is used which sets the pivot to the 1/4th of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsortAverage(A,0,4);
		for (int i=1; i<7; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nAverage Case Combination-1 after sorting: ");
		for (int i=0; i<7; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<7; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==6){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,7);
	}

	//The pivot is set to the 1/4th of the number of elements
	@Test
	void testQuickAverageCaseCombination2() {

		int elementsSorted=0;
		int elementsUnSorted=0;

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			A[0]=new Double(1);
			A[1]=new Double(3);
			A[2]=new Double(2);
			A[3]=new Double(4);
			A[4]=new Double(5);
		}

		System.out.print("Average Case Combination-2 before sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}

		if(elementsSorted==4){
			elementsSorted++;
		}
		if(elementsUnSorted>0) {
			elementsUnSorted += 1;
		}

		assertEquals(elementsUnSorted,2);

		//Here the qsortAverage is used which sets the pivot to the 1/4th of the array
		//It is shown in the code of the QuickSort.Java class
		QuickSort.qsortAverage(A,0,4);
		for (int i=1; i<testsize; i++)
			assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";

		System.out.print("\nAverage Case Combination-2 after sorting: ");
		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ " ");
		}

		elementsSorted=0;
		elementsUnSorted=0;
		for (int i=1; i<testsize; i++){
			if(A[i-1].compareTo(A[i]) <= 0){
				elementsSorted++;
			}else{
				elementsUnSorted++;
			}
		}
		if(elementsSorted==4){
			elementsSorted++;
			System.out.println("\nAll " + elementsSorted + " elements are sorted.");
		}

		assertEquals(elementsSorted,5);
	}

	@Test
	void testPartitionDcuDpu1() {

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			//A[i] = new Double(DSutil.random(3));// return int basic type, new Integer from int.

			A[0]=new Double(5);
			A[1]=new Double(3);
			A[2]=new Double(2);
			A[3]=new Double(1);
			A[4]=new Double(4);


		}

		int temp=QuickSort.partition(A,-1,5,A[2]);


		String str="";

		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+",");
		}

		assertEquals(temp,2);
		System.out.println();
		System.out.print("l = " + temp);
	}

	@Test
	void testPartitionDcuDpu2() {

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			//A[i] = new Double(DSutil.random(3));// return int basic type, new Integer from int.

			A[0]=new Double(0);
			A[1]=new Double(3);
			A[2]=new Double(2);
			A[3]=new Double(5);
			A[4]=new Double(4);


		}

		int temp=QuickSort.partition(A,-1,5,A[1]);


		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ ", ");
		}

		assertEquals(temp,2);
		System.out.println();
		System.out.print("l = " + temp);
	}

	@Test
	void testPartitionDcuDpu3() {

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			//A[i] = new Double(DSutil.random(3));// return int basic type, new Integer from int.

			A[0]=new Double(48);
			A[1]=new Double(7);
			A[2]=new Double(4);
			A[3]=new Double(12);
			A[4]=new Double(3);


		}

		int temp=QuickSort.partition(A,-1,5,A[3]);


		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ ", ");
		}

		assertEquals(temp,3);
		System.out.println();
		System.out.print("l = " + temp);
	}

	@Test
	void testPartitionDcuDpu4() {

		A = new Double[testsize];
		for (int i=0; i<testsize; i++) {
			//A[i] = new Double(DSutil.random(3));// return int basic type, new Integer from int.

			A[0]=new Double(-12);
			A[1]=new Double(1);
			A[2]=new Double(4);
			A[3]=new Double(15);
			A[4]=new Double(2);

		}

		int temp=QuickSort.partition(A,-1,5,A[4]);

		for (int i=0; i<testsize; i++) {
			System.out.print(A[i]+ ", ");
		}

		assertEquals(temp,3);
		System.out.println();
		System.out.print("l = " + temp);
	}


//
//
//	//@Test
//	void testInsert() {
//		InsertSort.sort(A);
//	    for (int i=1; i<testsize; i++)
//	      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
//
//
//	}
//
//	//@Test
//	void testShell() {
//
//
//
//		 ShellSort.sort(A);
//		 for (int i=1; i<testsize; i++)
//		      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
//
//	}
//
//	//@Test
//	void testBubble() {
//
//		 BubbleSort.sort(A);
//
//
//		 for (int i=1; i<testsize; i++)
//		      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
//
//
//		 list.clear();
//		 list.insert(25);
//		 list.insert(2);
//		 list.insert(3);
//		 BubbleSort.sort(list);
//		 for (int i=1; i<list.length(); i++)
//		      assert list.getValue(i-1).compareTo(list.getValue(i)) <= 0 : "Array not sorted";
//
//	}
//
//	//@Test
//	void testSelect() {
//		 SelectSort.sort(A);
//		 for (int i=1; i<testsize; i++)
//		      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
//
//	}
//
//	//@Test
//	void testMerge() {
//		 MergeSort.sort(A);
//		 for (int i=1; i<testsize; i++)
//		      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
//
//
//		 list.clear();
//		 list.insert(25);
//		 list.insert(2);
//		 list.insert(3);
//		 list.insert(5);
//		 list.insert(100);
//
//
//		 MergeSort.sort(list);
//		 assertEquals("< | 2 3 5 25 100 >", list.toString());
//
//		 for (int i=1; i<list.length(); i++)
//		      assert list.getValue(i-1).compareTo(list.getValue(i)) <= 0 : "Array not sorted";
//
//
//	}
//
//	//@Test
//	void testOptMerge() {
//		 OptMergeSort.sort(A);
//		 for (int i=1; i<testsize; i++)
//		      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
//
//	}
//
//
////	//@Test
////	void testHeap() {
////		 HeapSort.sort(A);
////		 for (int i=1; i<testsize; i++)
////		      assert A[i-1].compareTo(A[i]) <= 0 : "Array not sorted";
////
////	}
//
//	//@Test
//	void testSwap() {
//
//		list.clear();
//	    list.insert(25);
//	    list.insert(2);
//	    list.insert(3);
//
//	    assertEquals("< | 3 2 25 >", list.toString());
//
//	    DSutil.swap(list, 1, 2);
//
//	    assertEquals("< | 3 25 2 >", list.toString());
//
//
//	}

}
