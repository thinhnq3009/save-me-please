package com.example.simpleapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "account")
@Builder
@Getter
@AllArgsConstructor
public class Account {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String password;

    private String email;

    private String fullname;

    private String phoneNumber;

    private String role;

    private Boolean isActive;

    public Account() {

    }
}
