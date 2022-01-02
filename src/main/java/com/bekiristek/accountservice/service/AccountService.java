package com.bekiristek.accountservice.service;

import com.bekiristek.accountservice.entity.Account;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public Account get(String id) {
        return new Account("bekir");
    }

    public Account save(Account account) {
        return null;
    }

    public Account delete(String id) {
        return null;
    }

    public Account update(Account account) {
        return null;
    }

    public Account pagination() {
        return null;
    }
}
