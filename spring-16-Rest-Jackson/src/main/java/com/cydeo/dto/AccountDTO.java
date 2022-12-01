package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;
    @JsonBackReference
    private UserDTO user;

}