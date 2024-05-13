package Question_2;

public class Stacks { // Question2
	
    int maxSize;
    int[] arr;
    int top;

    Stacks(int size) {
        maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full.");
        } 
        else {
            arr[++top] = value;
            System.out.println(value + " pushed to the stack.");
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } 
        else {
            int num = arr[top--];
            System.out.println(num + " popped from the stack.");
            return num;
        }
    }
    public static void main(String[] args) {
        Stacks stack = new Stacks(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(40);
        stack.push(50);
        stack.push(60); 
    }

}

