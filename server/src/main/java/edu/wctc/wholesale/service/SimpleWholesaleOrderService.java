package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.WholesaleOrder;
import edu.wctc.wholesale.repo.WholesaleOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class SimpleWholesaleOrderService implements WholesaleOrderService {
    @Autowired
    private WholesaleOrderRepository wholesaleOrderRepository;


    @Override
    public List<WholesaleOrder> getOrderList(){
        List<WholesaleOrder> list = new ArrayList<>();
        wholesaleOrderRepository.getAllByCustomerId().forEach(list::add);
        return list;
    }
}
