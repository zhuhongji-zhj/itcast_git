package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;

public class AccountDaoImpl implements AccountDao {
    @Override
    public void save() {
        System.out.println("AccountDaoImpl---saveAccount()");
    }
}
