package Question_4;


public class BubbleSort { // Question 4

    public static void bubbleSort(String[] arr) {
        int k = arr.length;
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Kena", "Ararso", "Yeshi", "Elili", "King Kunta"};

        bubbleSort(arr);
  
        for (String element : arr) {
            System.out.print(element + ", ");
        }
    }
}