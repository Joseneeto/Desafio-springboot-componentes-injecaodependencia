package com.joseneto.Desafio;

import com.joseneto.entities.Order;
import com.joseneto.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.joseneto"})
public class DesafioApplication implements CommandLineRunner {

	private OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}

	public static void main(String[] args) {

		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order(1309, 95.90,0.0);

		System.out.println();
		System.out.printf("Pedido código %d\n", order.getCode());
		System.out.printf("Valor total: R$ %.2f",orderService.total(order));
	}
}
