package cn.wlk.service;

import cn.wlk.domain.Account;

import java.util.List;

public interface AccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);

}
