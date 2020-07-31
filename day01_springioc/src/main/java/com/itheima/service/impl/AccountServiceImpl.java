package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.AccountService;

public class AccountServiceImpl implements AccountService {
    @Override
    public void save() {
        System.out.println("AccountServiceImpl---saveAccount()");
        AccountDao accountDao = new AccountDaoImpl();//TODO 耦合待解决
        accountDao.save();
    }
}
