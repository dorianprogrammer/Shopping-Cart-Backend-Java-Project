package com.dorian.dreamshops.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String messageString) {
        super(messageString);
    }
}
