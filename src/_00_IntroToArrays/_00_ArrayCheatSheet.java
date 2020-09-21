package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] strArray = {"one", "two", "three", "four", "five"};
		
		//2. print the third element in the array
		System.out.println(strArray[2]);
		
		//3. set the third element to a different value
		strArray[2] = "3";
		
		//4. print the third element again
		System.out.println(strArray[2]);
		
		System.out.println(" ");
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < strArray.length; i ++) {
			strArray[i] = "string";
		}
		
		System.out.println(" ");
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int g = 0; g < strArray.length; g++) {
			System.out.println(strArray[g]);
		}
		
		System.out.println(" ");
		//7. make an array of 50 integers
		int[] intArray = new int [50];

		//8. use a for loop to make every value of the integer array a random number
		Random random = new Random();
		for (int o = 0; o < intArray.length; o++) {
			int j = random.nextInt();
			intArray[o] = j;
			System.out.println(intArray[o]);
		}
		
		System.out.println(" ");
		//9. without printing the entire array, print only the smallest number on the array
		int smallest = intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(smallest > intArray[i]) {
				smallest = intArray[i];
			}
		}
		System.out.println("the smallest number is "+ intArray[0]);
		
		
		System.out.println(" ");
		//10 print the entire array to see if step 8 was correct
		System.out.println(intArray);
		
		//11. print the largest number in the array.
		int largest = intArray[0];
		for (int l = 0; l < intArray.length; l++) {
			if(largest < intArray[l]) {
				largest = intArray[l];
			}
		}
		System.out.println("the largest number is " + intArray[0]);
		
		//12. print only the last element in the array
		
	}
}
