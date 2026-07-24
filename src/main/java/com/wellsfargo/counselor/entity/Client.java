package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private long clientId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Advisor advisor;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Date dateOfBirth;

    @OneToOne
    private Portfolio portfolio;

    protected Client() {

    }

    public Client (String firstName, String lastName, Advisor advisor, String address, String phone, String email, Date dateOfBirth, Portfolio portfolio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.advisor = advisor;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.portfolio = portfolio;
    }

    public Long getClientId() {
        return clientId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth (Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

}
