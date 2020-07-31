package com.itheima.web;

import com.itheima.service.AccountService;
import com.itheima.service.impl.AccountServiceImpl;

public class Client {
    public static void main(String[] args) {
        AccountService accountService = new AccountServiceImpl();//TODO 耦合待解决
        accountService.save();
    }
}
