
public class EmptyQueueException extends Exception {
        public EmptyQueueException() {
            super("La cola está vacía.");
        }

        public EmptyQueueException(String message) {
            super(message);
        }
    }
