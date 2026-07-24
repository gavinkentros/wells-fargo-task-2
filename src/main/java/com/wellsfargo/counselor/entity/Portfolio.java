package com.wellsfargo.counselor.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @OneToOne
    @JoinColumn(nullable = false)
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    @OneToMany
    private List<Security> securities;

    protected Portfolio() {

    }

    public Portfolio(Client client, Date creationDate, List<Security> securities) {
        this.client = client;
        this.creationDate = creationDate;
        this.securities = securities;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }

}
