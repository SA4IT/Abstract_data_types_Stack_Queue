package Queue;

public interface Queue {
    public boolean isEmpty();
    public boolean isFull();
    public void enQueue(int element);
    public int delQueue();
    public void print();
}
