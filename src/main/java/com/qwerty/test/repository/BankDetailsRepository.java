package com.qwerty.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.qwerty.test.entity.BankDetails;

public interface BankDetailsRepository extends CrudRepository<BankDetails, Integer>{

	BankDetails findByBankIfsc(String ifsc);

	Iterable<BankDetails> findAllByBankNameAndBankCity(String bankName, String city);
}
