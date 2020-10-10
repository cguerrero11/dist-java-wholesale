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
@Table(name = "Customer")
public class Customer {
    @Id
    @Column(name = "customer_id")
    private int customerId;
    @NotNull
    @Column(name = "name")
    private String name;
}
