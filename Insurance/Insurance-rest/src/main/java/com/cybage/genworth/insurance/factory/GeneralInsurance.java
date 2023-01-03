package com.cybage.genworth.insurance.factory;

import com.cybage.genworth.insurance.service.InsuranceTypeService;

public class GeneralInsurance implements InsuranceTypeService {

	@Override
	public String getInsuranceType() {
		return "General Insurance";
	}

}
