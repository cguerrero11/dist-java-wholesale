package edu.wctc.wholesale.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Wholesale_Order")
public class WholesaleOrder {
    @Id
    @Column(name = "order_id")
    private String orderId;
    @NotNull
    @Column(name = "purchase_order_num")
    private String orderNum;
    @NotNull
    @Column(name = "terms")
    private String terms;
    @NotNull
    @JoinColumn(name = "customer_id")
    private int customerId;
    @NotNull
    @JoinColumn(name = "product_id")
    private int productId;
    @NotNull
    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;
    @Column(name = "shipped_date")
    private LocalDateTime shippedDate;
}
