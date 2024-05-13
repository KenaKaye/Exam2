package Question_6;

import java.util.Arrays;

public class deleteInArray { // Question 6
	
	public static void main(String[] args) {
		int[] array = {3, 7, 1, 9, 4};
		int index = 3;
		
		deleteElement(array, index);
	}
	
	public static void deleteElement(int[] arr, int index) {
		
		int[] newArray = new int[arr.length - 1];
		
		if (index < 0 || index >= arr.length) {
			System.out.println("Invalid index.");
		}
		
		else {
			for (int i = 0, j = 0; i < arr.length; i++) {
				 if (i != index) {
					 newArray[j++] = arr[i];
				 }	
			}
			
			System.out.println("Our new array is " + Arrays.toString(newArray) + ".");
			}
		
		}
		
}


