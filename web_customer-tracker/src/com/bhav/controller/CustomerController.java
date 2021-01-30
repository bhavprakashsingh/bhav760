package com.bhav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bhav.dao.CustomerDAO;
import com.bhav.entity.Customer;
import com.bhav.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService cs ;
	
	
	@GetMapping("/list")
	
	public String listCustomer(Model model) {
		List <Customer> customers= cs.getCustomer();
		
		System.out.println(customers);
		
	model.addAttribute("customers",customers);
		
		return "list-customers";
	}
	
	
	@GetMapping("/showFormForAdd")
	
	public String showFormForAdd(Model m) {
		
		Customer cs= new Customer();
		
		m.addAttribute("customers",cs);
		
		return "customer-form";
		
	}
	
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute ("customers") Customer theCustomer) {
	
		cs.saveCustomer(theCustomer);
		
		return "redirect:/customer/list";
		
	}
	
	
	
	

}
