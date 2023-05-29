package me.aksaev.hw_basics_algorithms_3.exception;

public class StorageIsFullException extends RuntimeException {
    public StorageIsFullException() {
    }

    public StorageIsFullException(String message) {
        super(message);
    }

    public StorageIsFullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StorageIsFullException(Throwable cause) {
        super(cause);
    }

    public StorageIsFullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
