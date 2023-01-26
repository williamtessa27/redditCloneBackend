package com.example.reddit.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@AllArgsConstructor
@NoArgsConstructor
public class LogoutRequest {

    @NotBlank
    private String refreshToken;
}