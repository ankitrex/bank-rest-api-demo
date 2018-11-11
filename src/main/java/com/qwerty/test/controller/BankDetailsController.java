package com.qwerty.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qwerty.test.entity.BankDetails;
import com.qwerty.test.service.BankDetailsService;

@RestController
public class BankDetailsController {

	private static final String bankDetailsEndpoint = "/bank-details";
	private static final String branchesEndpoint = "/branches";

	private static final String pathVariableIfsc = "ifsc";
	private static final String pathVariableBankName = "bankName";
	private static final String pathVariableCity = "city";

	private static final char pathSeparator = '/';

	@Autowired
	BankDetailsService bankDetailsService;

	@GetMapping(path = bankDetailsEndpoint + pathSeparator + "{" + pathVariableIfsc + "}")
	public @ResponseBody BankDetails getByIfscCode(@PathVariable(pathVariableIfsc) String ifsc) {

		return bankDetailsService.getBankDetailsByIfsc(ifsc);
	}

	@GetMapping(path = branchesEndpoint + pathSeparator + "{" + pathVariableBankName + "}" + pathSeparator + "{"
			+ pathVariableCity + "}")
	public Iterable<BankDetails> getByBankNameAndCity(@PathVariable(pathVariableBankName) String bankName,
			@PathVariable(pathVariableCity) String city) {

		return bankDetailsService.getBranchesByNameAndCity(bankName, city);
	}
}
