package com.bhav.dao;

import java.util.List;

import com.bhav.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer>  listCustomer();

	public void saveCustomer(Customer theCustomer);



}
