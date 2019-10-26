package com.jayanth;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FastPassController {
	
	List<FastPassCustomer> customerList = new ArrayList<FastPassCustomer>();  
	
	public FastPassController() {
		
		FastPassCustomer fp1 = new FastPassCustomer("100", "John Doe", "555-123-1254", new BigDecimal("20.12"));
		FastPassCustomer fp2 = new FastPassCustomer("101", "Jordon Mayhem", "512-986-1254", new BigDecimal("2.02"));
		FastPassCustomer fp3 = new FastPassCustomer("102", "John Deer", "555-986-2251", new BigDecimal("17.07"));
		
		customerList.add(fp1);
		customerList.add(fp3);
		customerList.add(fp2);
		System.out.println(fp1.toString()+fp2.toString()+fp3.toString());
	}
	
	@RequestMapping(path="/fastPass", params= {"fastpassid"})
	public FastPassCustomer getFastPassById(@RequestParam String fastpassid) {
		System.out.println(customerList);
		Predicate<FastPassCustomer> p = c -> StringUtils.equals(c.getFastPassId(),fastpassid);
		FastPassCustomer customer = customerList.stream().filter(p).findFirst().get();
		
		return customer;
	}
	
	@RequestMapping(path="/fastPass", params= {"fastpassphone"})
	public FastPassCustomer getFastPassByPhone(@RequestParam String fastpassphone) {
		System.out.println(customerList);
		Predicate<FastPassCustomer> p = c -> StringUtils.equals(c.getFastPassPhone(), fastpassphone);
		FastPassCustomer customer = customerList.stream().filter(p).findFirst().get();
		
		return customer;
	}

}
