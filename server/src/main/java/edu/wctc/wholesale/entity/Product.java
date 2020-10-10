package edu.wctc.wholesale.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Product")
public class Product {
    @Id
    @Column(name = "product_id")
    private int productId;
    @NotNull
    @Column(name = "name")
    private String name;
    @NotNull
    @Column(name = "cost")
    private double cost;
}
