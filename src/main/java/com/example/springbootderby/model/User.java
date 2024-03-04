package com.example.springbootderby.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "USER_DB_DERBY_APACHE")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    private Long id;
    private String name;
    private String  address;
}
