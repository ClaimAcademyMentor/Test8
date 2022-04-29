package arrays;

import java.util.*;

public class ArraysMain {

	public static void main(String[] args) {
		
		String phrase = "Thanksgiving";
		phrase = "Christmas";
		System.out.print("The ASCII value is: ");
		printArrayInt(findAsciiValue(phrase));


		double[] listThree = new double[5];
		printArrayDouble(randomizer(listThree.length));

		// index = 0 | 1 | 2 | 3 | 4 |
		double[] list = {1, 2, 3, 4, 5};
		System.out.println("Total of array values are: " + findSum(list));

//		index					0 |  1  |  2  |  3
//      length					1   2    3    4
		//double[] listFive = { 34.5, 67.2, 56.3, 21.8 };
		printArrayDouble(sortArray(list));

		Scanner keyInput = new Scanner(System.in);
		int[] arrTeach = new int[4];
		System.out.println("Please enter " + arrTeach.length + " values.");
		printArrayInt(addScannerValues(keyInput, arrTeach));

		// index 0 | 1 | 2 | 3 | 4
		int[] teachArr2 = { 2, 5, 2, 1, 8 };

		printArrayInt(shiftToLeft(teachArr2));
	}
	
	// finding ASCII value of array
	public static int[] findAsciiValue(String input) {
		char[] strToChar = input.toCharArray();
		int[] ascii = new int[input.length()];
		for(int i = 0; i < strToChar.length; i++) {
			ascii[i] = (int) strToChar[i];
		}
		return ascii;
	}

	// randomizer array method
	public static double[] randomizer(int len) {
		double[] temp = new double[len];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = Math.random() * 100;
		}
		return temp;
	}

	public static double findSum(double[] arr) {
		double total = 0;
		for (int i = 0; i < arr.length; i++) {
			// total = total + listFour[i];
			total += arr[i];
		}
		return total;
	}

	// add values to Scanner
	public static int[] addScannerValues(Scanner input, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		return arr;
	}

	// sort array
	public static double[] sortArray(double[] list) {
		for (int i = 0; i < list.length; i++) {
		//	System.out.println("Outer loop is at: " + i);
			// inner loop
			for (int j = 0; j < list.length - 1; j++) {
			//	System.out.println("Inner loop is at: " + j);
				if (list[j] < list[j + 1]) {
					double temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
		return list;
	}

	// shift elements to the left
	public static int[] shiftToLeft(int[] teachArr2) {
		int[] tempArr = new int[teachArr2.length];
		int firstValue = teachArr2[0];
		for (int i = 1; i < teachArr2.length; i++) {
			tempArr[i - 1] = teachArr2[i];
		}
		tempArr[tempArr.length - 1] = firstValue;
		return tempArr;
	}

	// print array methods
	public static void printArrayInt(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void printArrayDouble(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(String.format("%.2f", arr[i]) + " ");
		}
		System.out.println("\n");
	}

}
