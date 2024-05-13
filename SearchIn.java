package Question_1;

import java.util.Scanner;

public class SearchIn { // Question 1
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
			    System.out.println(num + " is found in the array " + count + " time(s).");
			} 
			else {
			    System.out.println(num + " is not found in the array.");
			}
		}
    }
}

//Dear teacher, while using this code, write the elements of the array like this... 1 2 3 4 5 (With space in between them)
