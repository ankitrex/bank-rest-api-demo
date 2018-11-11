package com.qwerty.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name="bank_details")
@Data
public class BankDetails {
	
	@Id
	@Column(name="bank_id")
	private Integer bankId;
	
	@Column(name="bank_name")
	private String bankName;
	
	@Column(name="bank_ifsc")
	private String bankIfsc;
	
	@Column(name="bank_branch")
	private String bankBranch;
	
	@Column(name="bank_address")
	private String bankAddress;
	
	@Column(name="bank_city")
	private String bankCity;
	
	@Column(name="bank_district")
	private String bankDistrict;
	
	@Column(name="bank_state")
	private String bankState;
}
