package com.example.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.store.entity.Order;
import com.example.store.repository.OrderRepository;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Autowired
	OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order("Иванов И.И.", myDate.now(), "Ростов-на-Дону, ул. Садовая, 1");
		List<Order> clients = Arrays.asList(order);
		orderRepository.saveAll(clients);
		System.out.println("<<<<<<" + orderRepository.findAll());
	}
}
