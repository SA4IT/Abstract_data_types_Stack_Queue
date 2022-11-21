package Queue;

public class Main {
    public static void main(String[] args) {

        //обычная очередь
        System.out.println("Линейная очередь(массив)");
        My_queue queue = new My_queue();//размер очереди 5
        queue.enQueue(5);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(34);
        queue.enQueue(64);

        queue.print();
        System.out.println();
        System.out.println("Очередь уменьшилась на 3");

        queue.delQueue();
        queue.delQueue();
        queue.delQueue();
        queue.print();
        System.out.println();

        System.out.println("Очередь увеличилась на 2");

        queue.enQueue(763);
        queue.enQueue(805);

        queue.print();
        System.out.println('\n');



        //циклическая очередь
        System.out.println("Циклическая очередь (массив)");
        Cyclic_queue cicl_queue = new Cyclic_queue();
        cicl_queue.enQueue(56);
        cicl_queue.enQueue(123);
        cicl_queue.enQueue(9);
        cicl_queue.enQueue(234);
        cicl_queue.enQueue(686);
        cicl_queue.enQueue(2836);

        cicl_queue.print();
        System.out.println();

        System.out.println("Очередь уменьшилась на 2");
        cicl_queue.delQueue();
        cicl_queue.delQueue();
        cicl_queue.print();

        cicl_queue.enQueue(21);
        System.out.println();
        System.out.println("Очередь увеличилась на 1");


        cicl_queue.print();
        System.out.println('\n');


        //очередь через связный список
        System.out.println("Линейная очередь (двусвязный список)");
        QueueLinkedList list_queue = new QueueLinkedList();//cgbcjr yf
        list_queue.enQueue(65);
        list_queue.enQueue(87);
        list_queue.enQueue(456);
        list_queue.enQueue(6);
        list_queue.enQueue(124);
        list_queue.print();
        System.out.println();

        list_queue.delQueue();
        list_queue.delQueue();
        System.out.println("Очередь уменьшилась на 2");
        list_queue.print();
        System.out.println();


        System.out.println("Очередь увеличилась на 3");
        list_queue.enQueue(736);
        list_queue.enQueue(6546);
        list_queue.enQueue(144543);
        list_queue.print();
        System.out.println();









    }
}
