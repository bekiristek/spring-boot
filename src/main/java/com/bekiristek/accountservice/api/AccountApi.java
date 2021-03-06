package com.bekiristek.accountservice.api;

import com.bekiristek.accountservice.entity.Account;
import com.bekiristek.accountservice.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountApi {

    private AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> get(@PathVariable("id") String id) {
        return ResponseEntity.ok(accountService.get(id));
    }

    public ResponseEntity<Account> save( Account account) {
        return null;
    }

    public ResponseEntity<Account> delete(String id) {
        return null;
    }

    public ResponseEntity<Account> update(Account account) {
        return null;
    }

    public ResponseEntity<Account> pagination() {
        return null;
    }
}
