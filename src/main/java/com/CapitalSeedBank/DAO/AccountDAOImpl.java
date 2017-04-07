package com.CapitalSeedBank.DAO;

import com.CapitalSeedBank.Model.Account;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * Created by nof191 on 4/7/17.
 */
public class AccountDAOImpl implements AccountDAO {


    public void makeAccount(Account accountToMake) {
        String filename = "src/main/java/fileio/Account.txt";
        writeCharacterStream(filename, accountToMake);
    }

        static void writeCharacterStream(String filename, Account accountToMake) {

            ObjectMapper mapper = new ObjectMapper();

            try {
                mapper.writeValue(new File(filename), accountToMake);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    public Account getAccount() {

        return null;
    }

    public void saveDeposit(Account accountToSave) {

    }

    public void saveWithdrawl(Account accountToSave) {

    }
}
