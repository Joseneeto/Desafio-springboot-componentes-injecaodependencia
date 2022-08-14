package com.joseneto.services;

import com.joseneto.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order){
        Double discount = order.getDiscount() / 100.0 * order.getBasic();
        return order.getBasic() - discount + shippingService.shipment(order);
    }
}
