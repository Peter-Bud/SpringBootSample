package com.example.springBootSample.custumer.exception;


public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(message);
    }


}
