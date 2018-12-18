package com.codegym.personalmusic.model;


import lombok.Data;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity(name = "user")
@Data
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NaturalId
    String username;
    @NotNull
    String password;
}
