package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;

public interface WholesaleOrderService {
    WholesaleOrder getOrders(int orderId);
}
