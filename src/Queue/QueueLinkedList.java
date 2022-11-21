package Queue;


public class QueueLinkedList implements Queue{
    private int count;
    private int count_limit = 6;
    private Node_of_List head;
    private Node_of_List tail;


    public QueueLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else return false;
    }
    public boolean isFull(){
        if(count == count_limit){
            return  true;
        }else return false;
    }

    public void enQueue(int data) {
        Node_of_List temp = new Node_of_List(data);
        if(isFull()){
            System.err.println("Очередь переполнена!");
        }
        else{
            if(isEmpty()){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            temp.prev = tail;
            tail = temp;
            count ++;
        }
    }

    public int delQueue() {
        if(isEmpty()){
            System.err.println("Очередь пуста!");
        }else{
            if(head.next==null){
                tail=null;
            }
            else{
                head.next.prev = null;
            }
            head = head.next;
            count --;
        }
        return 1;
    }

    public void print()
    {
        System.out.print("(конец очереди) ");
        Node_of_List temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" <-");
            temp = temp.prev;
        }
        System.out.print("(начало очереди) ");
    }
}
