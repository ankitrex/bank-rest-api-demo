package com.qwerty.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwerty.test.entity.BankDetails;
import com.qwerty.test.repository.BankDetailsRepository;
import com.qwerty.test.service.BankDetailsService;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

	@Autowired
	BankDetailsRepository bankDetailsRepository;
	
	@Override
	public BankDetails getBankDetailsByIfsc(String ifsc) {
		
		return bankDetailsRepository.findByBankIfsc(ifsc);
	}

	@Override
	public Iterable<BankDetails> getBranchesByNameAndCity(String bankName, String city) {

		return bankDetailsRepository.findAllByBankNameAndBankCity(bankName, city);
	}

}
