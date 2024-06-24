package com.acorn.Customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.acorn.Customer.Entity.*;
import com.acorn.Customer.Repository.CustomerInfoRepository;

@RestController
@RequestMapping("/api/customer")
public class customerController {
	@Autowired
	private CustomerInfoRepository repository;
		@GetMapping("/getCountAll") //이렇게 데이터를 내보내면 데이터 처리는 리액트가 알아서 처리함 
		public int countAll() {
			List<CustomerInfo> users =repository.findAll();
			return users.size();
		}
//		@GetMapping("/test2")
//		public CustomerInfo test2() {
//			CustomerInfo login = new CustomerInfo("hong", "1234");
//			return login;
//		}
}
