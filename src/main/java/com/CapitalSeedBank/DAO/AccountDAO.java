package com.CapitalSeedBank.DAO;

import com.CapitalSeedBank.Model.Account;

/**
 * Created by nof191 on 4/7/17.
 */
public interface AccountDAO {

    // get the account balance

    Account  getAccount();

    /* make a deposit
    * takes the account object and writes it to the account file
     */

    void saveDeposit(Account accountToSave);

    /*make withdrawl
    *takes the updated object and writes it to the account file
     */

    void saveWithdrawl(Account accountToSave);




}
