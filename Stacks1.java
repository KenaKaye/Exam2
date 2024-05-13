package Question_3;

import java.util.EmptyStackException;

class Stacks1 { // Question 3
    int maxSize;
    int[] stackArray;
    int top;

    public Stacks1(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
        } else {
            stackArray[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top--];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
}
class QueueUsingStacks { // Question 3
    Stacks stack1;
    Stacks stack2;

    public QueueUsingStacks(int size) {
        stack1 = new Stacks(size);
        stack2 = new Stacks(size);
    }

    public void enqueue(int item) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        stack1.push(item);
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public int dequeue() {
        if (stack1.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack1.pop();
        }
    }

    public int peek() {
        if (stack1.isEmpty()) {
            throw new EmptyStackException();
        } else {
            return stack1.peek();
        }
    }
    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        
        System.out.println(queue.peek()); 

        queue.dequeue();

        System.out.println(queue.peek()); 
        
        try {
            queue.dequeue();
            queue.dequeue();
            queue.dequeue(); 
            queue.dequeue();
        } 
        catch (EmptyStackException e) {
            System.out.println("Queue underflow");
        }
        
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); 
    }
}





