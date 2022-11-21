package Stack;

public class Stack {
    private double arr[];
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new double[size];
        capacity = size;
        top = -1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public void push(double x) {
        if (isFull()) {
            System.err.println("Stack OverFlow!");
            System.exit(1);
        }
        top++;
        arr[top] = x;
    }

    public double pop() {
        if (isEmpty()) {
            System.err.println("Stack empty!");
            System.exit(1);
        }
        int temp_top = top;
        top--;
        return arr[temp_top];
    }
    public int getSize() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
