package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue
    private long securityId;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private int quantity;


    protected Security() {

    }

    public Security(Portfolio portfolio, String category, Date purchaseDate, BigDecimal purchasePrice, int quantity) {
        this.portfolio = portfolio;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
