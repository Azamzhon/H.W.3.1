package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount client = new BankAccount(10000);
        while (true) {
            try {
                client.deposit(5500);
                System.out.println("У вас осталось = " + client.getAmount());
                client.withDraw(6000);
                System.out.println("У вас осталось = " + client.getAmount());
                System.out.println("______________________________________");
            }catch (LimitException le) {
                System.out.println("Ваш баланс :  " + client.getAmount());
                double amount = client.getAmount();
                if (client.getAmount() > client.getSumDW())
                    amount = le.getRemainingAmount() - le.getRemainingAmount();
                System.out.println("C вашего счёта снято  = " + le.getRemainingAmount());
                System.out.println("Остаток баланса = " +  amount);
                break;
            }

        }
    }
}
