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


        //Account newAcct = new Account(1, 100);

        AccountDAO dao = new AccountDAOImpl();

        // test make an account
        // dao.makeAccount(newAcct);

        // test get an account
        // Account temp = dao.getAccount();

        //System.out.println(temp);

        // code to make a deposit

        Account temp = dao.getAccount();

        //later we can prompt the user for deposit amount

        System.out.println("Enter your deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        int depAmount = Integer.parseInt(scanner.nextLine());

        //int depAmount = 100;

        temp.setBalance(temp.getBalance()+Math.abs(depAmount));

        dao.makeAccount(temp);

        /* code to make a withdraw

        Account temp = dao.getAccount();

        int withdrawlAmount = 100;

        if (temp.getBalance() - Math.abs(withdrawlAmount) < 0) {
            System.out.println("Withdrawl will make balance negative");
        } else {

            int tempBal = temp.getBalance();
            tempBal = tempBal - Math.abs(withdrawlAmount);
            temp.setBalance(tempBal);
            dao.makeAccount(temp);
        }
        */

    }

}

