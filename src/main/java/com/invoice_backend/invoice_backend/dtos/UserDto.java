package com.invoice_backend.invoice_backend.dtos;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String address;
    private String city;
    private String postcode;
    private String country;
}
