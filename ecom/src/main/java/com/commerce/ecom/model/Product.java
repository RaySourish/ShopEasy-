package com.commerce.ecom.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Component
@Entity
@Data
// @NoArgsConstructor
public class Product {
    @Id
    private int id;
    private String name;
    private String description;
    private double price;
    private int quantity;
    private String category;
    private LocalDateTime creationDate;
    private LocalDateTime lastUpdatedDate;

    // Constructor

    public Product() {
        this.creationDate = LocalDateTime.now();
        this.lastUpdatedDate = LocalDateTime.now();
    }

    public Product(int id, String name, String description, double price, int quantity, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.creationDate = LocalDateTime.now();
        this.lastUpdatedDate = LocalDateTime.now();
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        updateLastUpdatedDate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        updateLastUpdatedDate();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
        updateLastUpdatedDate();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        updateLastUpdatedDate();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        updateLastUpdatedDate();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        updateLastUpdatedDate();
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public LocalDateTime getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    private void updateLastUpdatedDate() {
        this.lastUpdatedDate = LocalDateTime.now();
    }

    // toString method to print product details
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", category='" + category + '\'' +
                ", creationDate=" + creationDate +
                ", lastUpdatedDate=" + lastUpdatedDate +
                '}';
    }
}
