package com.expense_tracker.model;

import java.time.LocalDate;

public class Transaction {
    private int transId;
    private String type;
    private String category;
    private double amount;
    private String description;
    private LocalDate date;

    public Transaction(int transId, String type, String category, double amount, String description, LocalDate date) {
        this.transId = transId;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }

    public int getTransId() { return transId; }
    public String getType() { return type; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }

    public void setTransId(int transId) { this.transId = transId; }
    public void setType(String type) { this.type = type; }
    public void setCategory(String category) { this.category = category; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDescription(String description) { this.description = description; }
    public void setDate(LocalDate date) { this.date = date; }
}