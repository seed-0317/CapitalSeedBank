package com.CapitalSeedBank.DAO;

import com.CapitalSeedBank.Model.Account;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * Created by nof191 on 4/7/17.
 */
public class AccountDAOImpl implements AccountDAO {


    public void makeAccount(Account accountToMake) {
        String filename = "src/main/resources/Account.txt";
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

        ObjectMapper mapper = new ObjectMapper();
        Account obj = null;


        try {
            obj = mapper.readValue(new File("src/main/resources/Account.txt"), Account.class);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;

    }


    public void saveDeposit(Account accountToSave) {
        String filename = "src/main/resources/Account.txt";
        writeCharacterStream1(filename, accountToSave);
    }

    static void writeCharacterStream1(String filename, Account accountToSave) {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(filename), accountToSave);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void saveWithdrawl(Account accountToSave) {

    }
}
