package com.bekiristek.accountservice.service;

import com.bekiristek.accountservice.entity.Account;
import com.bekiristek.accountservice.repo.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account get(Long id) {
        return accountRepository.getById(id);
    }

    public Account save(Account account) {

        return accountRepository.save(account);
    }

    public String delete(Long id) {
        //return accountRepository.delete(accountRepository.findById(id));
        accountRepository.delete(accountRepository.getById(id));
        return "Account is successfully delete...";

    }

    public Account update(Account account) {
        return null;
    }

    public Account pagination() {
        return null;
    }
}
