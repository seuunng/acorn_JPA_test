package com.acorn.Customer.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "customer_info")
public class CustomerInfo {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_info_seq")
    @SequenceGenerator(name = "customer_info_seq", sequenceName = "customer_info_seq", allocationSize = 1)
	private int customer_id;
	private String customer_name;
	private String customer_gender;
	private Date customer_birth_date;
	private String customer_addr;
	private String customer_tel;
	private Date register_date;
	
	public CustomerInfo() {}
	@Override
	public String toString() {
		return "Customer_info [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_gender="
				+ customer_gender + ", customer_birth_date=" + customer_birth_date + ", customer_addr=" + customer_addr
				+ ", customer_tel=" + customer_tel + ", register_date=" + register_date + "]";
	}
	
}
