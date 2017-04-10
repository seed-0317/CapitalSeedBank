package com.CapitalSeedBank.Main;

import com.CapitalSeedBank.DAO.AccountDAO;
import com.CapitalSeedBank.DAO.AccountDAOImpl;
import com.CapitalSeedBank.Model.Account;

import java.util.Scanner;

/**
 * Created by nof191 on 4/7/17.
 */
public class Application {

    public static void main(String[] args) {



        AccountDAO dao = new AccountDAOImpl();

        System.out.println("What would you like to do? ");
        System.out.println("1 - Open new account with $100 balance ");
        System.out.println("2 - Check balance ");
        System.out.println("3 - Make a deposit ");
        System.out.println("4 - Withdraw cash");

        System.out.println("Enter choice: ");
        Scanner scanner = new Scanner(System.in);
        int ch = Integer.parseInt(scanner.nextLine());

        if (ch ==1) {
            // test make an account
            Account newAcct = new Account(1, 100);
            dao.makeAccount(newAcct);
        } else
            if (ch ==2) {
                 Account temp = dao.getAccount();
                 System.out.println(temp);
            }else
                if (ch == 3) {
            //code to make a deposit

                Account temp = dao.getAccount();


                System.out.println("Enter your deposit amount: ");
                    scanner = new Scanner(System.in);
                int depAmount = Integer.parseInt(scanner.nextLine());

                temp.setBalance(temp.getBalance()+Math.abs(depAmount));

                dao.makeAccount(temp);
                } else
                    if (ch == 4) {
                        Account temp = dao.getAccount();

                        System.out.println("Enter your withdraw amount: ");
                        scanner = new Scanner(System.in);
                        int withAmount = Integer.parseInt(scanner.nextLine());

                        //int withdrawlAmount = 100;

                        if (temp.getBalance() - Math.abs(withAmount) < 0) {
                            System.out.println("Withdraw will make balance negative");
                        } else {

                            int tempBal = temp.getBalance();
                            tempBal = tempBal - Math.abs(withAmount);
                            temp.setBalance(tempBal);
                            dao.makeAccount(temp);
                        }

                    }

    }

}

