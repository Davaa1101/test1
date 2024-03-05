package dataStructures;

import java.util.EmptyStackException;

public class ArrayStack<T, G> {
    private T[] stackArray;
    private G[] stackArray1;
    private int top;
    private int capacity;

    // Constructor to initialize the stack with a given capacity
    public ArrayStack(int capacity) {
        this.capacity = capacity;
        // Create an array of generic type T
        stackArray = (T[]) new Object[capacity];
        stackArray1 = (G[]) new Object[capacity];
        top = -1;
    }

    // Function to push an element onto the stack
    public void push(T element) {
        if (isFull()) {
            System.out.println("Дүүрсэн");
            return;
        }
        stackArray[++top] = element;
    }

    // Function to pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    // Function to peek at the top element of the stack
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }

    // Function to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Function to get the size of the stack
    public int size() {
        return top + 1;
    }

    // Function to duplicate the top element of the stack
    public void duplicateTop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        if (!isFull()) {
            T topElement = peek();
            push(topElement);
        }
    }

    // Function to reverse the order of elements in the stack
    public void reverseStack() {
        if (isEmpty()) {
            return;
        }
        T[] reversedArray = (T[]) new Object[capacity];
        int index = 0;
        while (!isEmpty()) {
            reversedArray[index++] = pop();
        }
        for (int i = 0; i < index; i++) {
            push(reversedArray[i]);
        }
    }

    // Function to print the elements of the stack
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Хоосон");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }
 // Function to push an element onto the additional stack
    public void pushAdditional(G element) {
        if (isAdditionalFull()) {
            System.out.println("Дүүрсэн.");
            return;
        }
        stackArray1[++top] = element;
    }

    // Function to pop an element from the additional stack
    public G popAdditional() {
        if (isAdditionalEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray1[top--];
    }

    // Function to peek at the top element of the additional stack
    public G peekAdditional() {
        if (isAdditionalEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray1[top];
    }

    // Function to check if the additional stack is empty
    public boolean isAdditionalEmpty() {
        return top == -1;
    }

    // Function to check if the additional stack is full
    public boolean isAdditionalFull() {
        return top == capacity - 1;
    }

    // Function to get the size of the additional stack
    public int additionalStackSize() {
        return top + 1;
    }

    // Function to print the elements of the additional stack
    public void printAdditionalStack() {
        if (isAdditionalEmpty()) {
            System.out.println("Хоосон!");
            return;
        }
        System.out.print("G "
        		+ "+5t: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray1[i] + " ");
        }
        System.out.println();
    }

}
