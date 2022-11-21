package Queue;

public class Cyclic_queue implements Queue{
    int size = 7; // Размер круговой очереди
    int front, rear;
    int arr[] = new int[size];

    Cyclic_queue() {
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    public void enQueue(int element) {
        if (isFull()) {
            System.err.println("Очередь переполнена!");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % size;
            arr[rear] = element;
        }
    }

    public int delQueue() {
        int element;
        if (isEmpty()) {
            System.err.println("Очередь пуста!");
            return (-1);
        } else {
            element = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % size;
            }
            return (element);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.err.println("Очередь пуста!");
        } else {
            for (int i = front; i != rear; i = (i + 1) % size) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}