package com.allrelations.allrelations;

import com.allrelations.allrelations.entity.Customer;
import com.allrelations.allrelations.entity.Item;
import com.allrelations.allrelations.repository.CustomerRepository;
import com.allrelations.allrelations.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AllrelationsApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ItemRepository itemRepository;

	public static void main(String[] args) {
		SpringApplication.run(AllrelationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var customer = new Customer("Barcsa");
		var item1 = new Item("item1");
		var item2 = new Item("item2");

		customer.getItems().add(item1);
		customer.getItems().add(item2);
		customerRepository.save(customer);


		customerRepository.save(customer);
	}
}
