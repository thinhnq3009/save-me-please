package com.example.simpleapp.config;

import com.example.simpleapp.entity.Account;
import com.example.simpleapp.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class MockData implements CommandLineRunner {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void run(String... args) throws Exception {

        accountRepository.deleteAll();

        List<Account> accountList = new ArrayList<>();

        IntStream.range(0, 100).forEach(i -> {
            accountList.add(
                    Account
                            .builder()
                            .username("user" + i)
                            .password("123456")
                            .email("user" + i + "@gmail.com")
                            .fullname("User " + i)
                            .role("USER")
                            .phoneNumber("0123456789")
                            .isActive(true)
                            .build()
            ) ;
        });

        accountRepository.saveAll(accountList);
    }
}
