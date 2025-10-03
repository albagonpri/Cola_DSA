public class QueueImpl<E> implements Queue<E>{
    private E[] data;
    private int p;
    private int rear;
    private int front;
    public QueueImpl(int len) {
        // TO-DO
        this.data = (E[])new Object[len];
        this.p=0;
        this.rear=0;
        this.front=0;
    }

    public void push(E e) throws FullQueueException {
        // TO-DO
        if (isFull()) throw new FullQueueException();
        this.data[this.rear]=e;
        this.rear = (this.rear +1);
        this.p++;
    }

    public E pop() throws EmptyQueueException {
        if (isEmpty())
            throw new EmptyQueueException();
        E elem = this.data[this.front];
        this.data[this.front] = null;
        this.front = (this.front + 1) % data.length;
        this.p--;
        return elem;
    }
    private boolean isFull() {
        // TO-DO
        return this.p == this.data.length;
    }

    private boolean isEmpty() {
        // TO-DO
        return this.p==0;
    }

    public int size() {
        //TO-DO
        return this.p;
    }
}
