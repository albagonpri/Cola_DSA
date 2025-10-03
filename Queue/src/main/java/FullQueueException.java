public class FullQueueException extends Exception {
        public FullQueueException() {
            super("La cola está llena.");
        }

        public FullQueueException(String message) {
            super(message);
        }
    }
