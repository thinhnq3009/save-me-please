package com.example.simpleapp.controller;

import com.example.simpleapp.entity.Account;
import com.example.simpleapp.repo.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HackerController {

    private final AccountRepository repository;

    @GetMapping("accounts")
    public List<Account> getAll(){
        return repository.findAll();
    }

    @PostMapping("accounts")
    public String newAccount(@RequestBody Account account){
        repository.save(account);
        return "Success";
    }
}
