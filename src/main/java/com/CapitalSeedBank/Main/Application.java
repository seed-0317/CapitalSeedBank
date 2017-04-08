package com.CapitalSeedBank.Main;

import com.CapitalSeedBank.DAO.AccountDAO;
import com.CapitalSeedBank.DAO.AccountDAOImpl;
import com.CapitalSeedBank.Model.Account;

/**
 * Created by nof191 on 4/7/17.
 */
public class Application {

    public static void main(String[] args) {


        Account newAcct = new Account(1, 100);

        AccountDAO dao = new AccountDAOImpl();

        // test make an account
       // dao.makeAccount(newAcct);

        // test get an account
        Account temp = dao.getAccount();

        System.out.println(temp);

    }
}

