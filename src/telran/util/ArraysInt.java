package telran.util;

import java.util.Arrays;

public class ArraysInt {
	public static int[] addNumber(int[] array, int number) {
		// apply method copyOf of class Arrays
		int[] arrayCopy = Arrays.copyOf(array, array.length+1);
		arrayCopy[array.length]=number;
		return arrayCopy;
	}
	public static int[] insertNumber(int[] array, int index, int number) {
		//apply method arraycopy of class System
		int[] arrayCopy = Arrays.copyOf(array, array.length+1);
		System.arraycopy(array, index, arrayCopy, index + 1, array.length - index);
		arrayCopy[index] = number;
		return arrayCopy;
	}
	public static int[] removeNumber(int[] array, int index) {
		//apply method arraycopy of class System
		int[] arrayCopy = Arrays.copyOf(array, array.length-1);
		System.arraycopy(array, index+1, arrayCopy, index, array.length - (index + 1));
		return arrayCopy;
	}
	public static int[] insertSorted(int[] sortedArray, int number) {
		// insert number into sorted array with keeping the sorted order
		// apply method binarySearch of the class Arrays
		int[] arraySortedCopy = Arrays.copyOf(sortedArray, sortedArray.length+1);
		int index = Arrays.binarySearch(sortedArray, number);
		if (index < 0) {
			index = -(index + 1);
		}
		System.arraycopy(sortedArray, index, arraySortedCopy, index + 1, sortedArray.length - index);
		arraySortedCopy[index] = number;
		return arraySortedCopy;
	}
}













