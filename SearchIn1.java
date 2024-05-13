package Question_5;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn1 { // Question 5
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			
        	System.out.print("Enter the length of the array: ");
			int len = scanner.nextInt();

			int[] array = new int[len];

			System.out.print("Enter the elements of the array: ");
			for (int i = 0; i < len; i++) {
			    array[i] = scanner.nextInt();
			}

			System.out.print("Enter the number to be found: ");
			int num = scanner.nextInt();
			int count = 0;
			for (int i : array) {
			    if (i == num) {
			        count++;
			    }
			}

			if (count > 0) {
			    System.out.println(num + " is present in the array " + count + " time(s).");
			} else {
			    System.out.println(num + " is not present in the array.");
			}
			
			
			mergeSort(array);
	        System.out.println("The Correct order of the numbers in the array is: " + Arrays.toString(array));
	        
	    }
        		
    }

    private static void mergeSort(int[] inputArray) {
        if (inputArray.length < 2) {
            return;
        }
        int midIndex = inputArray.length / 2;
        int[] leftHalf = Arrays.copyOfRange(inputArray, 0, midIndex);
        int[] rightHalf = Arrays.copyOfRange(inputArray, midIndex, inputArray.length);
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }

    private static void merge(int[] inputArray, int[] leftH, int[] rightH) {
        int leftSize = leftH.length;
        int rightSize = rightH.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (leftH[i] <= rightH[j]) {
                inputArray[k] = leftH[i];
                i++;
            } else {
                inputArray[k] = rightH[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            inputArray[k] = leftH[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            inputArray[k] = rightH[j];
            j++;
            k++;
        }
    }
}

// Dear teacher, when using this code, write the elements of the array like this... 1 2 3 4 5 (With space in between them)

