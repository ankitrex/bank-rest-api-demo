package com.qwerty.test.service;

import com.qwerty.test.entity.BankDetails;

public interface BankDetailsService {
	
	BankDetails getBankDetailsByIfsc(String ifsc);
	
	Iterable<BankDetails> getBranchesByNameAndCity(String bankName, String city);
}
