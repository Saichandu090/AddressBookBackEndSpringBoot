package com.book.address.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDTO
{
    @NotNull
    private String userName;
    @NotNull
    private String email;
    @NotNull
    private String password;
}
