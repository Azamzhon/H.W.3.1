package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount client = new BankAccount(10000);
        while (true) {
            try {
                System.out.println("У вас осталось = " + client.getAmount());
                client.withDraw(6000);
            }catch (LimitException le) {
                System.out.println(le.getMessage());
                System.out.println("Вы можете снять только: " + client.getAmount());
                LimitException limitException = new LimitException();
                client.amount = limitException.getRemainingAmount() - limitException.getRemainingAmount();
                System.out.println("Остаток баланса = " + client.getAmount());
                break;
            }

        }
    }
}
