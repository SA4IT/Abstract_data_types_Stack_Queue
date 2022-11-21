package Queue;

public class My_queue implements Queue{
    private int size = 7;
    private int items[] = new int[size];
    private int front, rear;


    public My_queue() {//конструктор очереди
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {//проверка очереди на пустоту
        if (front == -1)
            return true;
        else
            return false;
    }

    public boolean isFull() {//проверка очереди на переполнение
        if (front == 0 && rear == size - 1) {
            return true;
        }
        return false;
    }


    public void enQueue(int element) {//вставка элемента в конец очереди
        if (isFull()) {
            System.err.println("Очередь переполнена!");
        }
        else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
        }
    }

    public int delQueue() {//удаление элемента в начале очереди
        int element;
        if (isEmpty()) {
            System.err.println("Очередь пуста!");
            return (-1);
        }
        else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            return (element);
        }
    }

    public void print() {
        if (isEmpty()) {
            System.err.println("Очередь пуста!");
        }
        else {
            for (int i = front; i <= rear; i++)
                System.out.print(items[i] + " ");
        }
    }

}
