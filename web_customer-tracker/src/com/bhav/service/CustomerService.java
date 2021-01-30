package com.bhav.service;

import java.util.List;

import com.bhav.entity.Customer;

public interface CustomerService {
	
	List<Customer> getCustomer();

	public void saveCustomer(Customer theCustomer);

}
