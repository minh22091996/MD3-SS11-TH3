package rikkei;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSide = 0;
    public MyQueue(int queueSide){
        this.capacity = queueSide;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueFull(){
        boolean status = false;
        if(currentSide == capacity){
            status = true;
        }
        return status;
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if(currentSide == 0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item){
        if(isQueueFull()){
            System.out.println("element : " + item);
        }else {
            tail++;
            if(tail==capacity-1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSide++;
            System.out.println("element : " + item);
        }
    }
    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSide--;
        }
    }

}
