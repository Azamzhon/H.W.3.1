package com.company;

public class LimitException extends Exception{
    double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public LimitException() {

    }

    public double getRemainingAmount() {
        return remainingAmount;
    }
}
