package com.company;

public class BankAccount {
    private double amount;
    private double sumD;
    private int sumDW;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public double getSumD() {
        return sumD;
    }

    public int getSumDW() {
        return sumDW;
    }

    public int withDraw(int sum) throws LimitException {
        amount = amount - sum;
        System.out.println("C вашего счёта снято  = " + sum);
        if (sum > amount) {
            throw new LimitException("У Вас недостаточно средств = ", getAmount());
        }
        return sum;
    }
    public double deposit(double sum){
        amount = amount + sum;
        System.out.println("На ваш счёт зачислено = " + sum);
        return sum;
    }
}
