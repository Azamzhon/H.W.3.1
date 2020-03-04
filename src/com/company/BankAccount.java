package com.company;

public class BankAccount {
    double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public int withDraw(int sum) throws LimitException {
        amount = amount - sum;
        System.out.println("C вашего счёта снято  = " + sum);
        if (sum > amount) {
            throw new LimitException("У Вас недостаточно средств", getAmount());
        }
        return sum;
    }

    public double deposit(double sum){
        amount = amount + sum;
        System.out.println("На ваш счёт зачислено = " + sum);
        return sum;
    }
}
