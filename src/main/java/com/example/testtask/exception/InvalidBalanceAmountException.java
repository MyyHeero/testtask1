package com.example.testtask.exception;

public class InvalidBalanceAmountException extends RuntimeException {
    public InvalidBalanceAmountException(String message) {
        super(message);
    }
}
