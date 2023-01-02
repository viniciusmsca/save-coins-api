package com.savecoins.savecoinsapi.controllers.request;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;

public class CreateAccountRequest {

    @NotBlank
    private final String username;
    private final LocalDate birthDate;

    @NotBlank
    private final String password;

    public CreateAccountRequest(String username, LocalDate birthDate, String password) {
        this.username = username;
        this.birthDate = birthDate;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "CreateAccountRequest{" +
                "username='" + username + '\'' +
                ", birthDate=" + birthDate +
                ", password='" + password + '\'' +
                '}';
    }
}

