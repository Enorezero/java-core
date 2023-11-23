package org.example;

public class ExceedMaxSizeException extends RuntimeException{
    public ExceedMaxSizeException(String message) {
        super(message);
    }
}
