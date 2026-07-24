package com.wellsfargo.counselor.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long ClientId;


    protected Client() {

    }


}
