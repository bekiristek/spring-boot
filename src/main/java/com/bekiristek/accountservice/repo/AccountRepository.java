package com.bekiristek.accountservice.repo;

import com.bekiristek.accountservice.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
    Account getById(Long id);

    Account findById(Long id);
}
