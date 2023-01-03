package com.cybage.genworth.insurance.util;

import com.cybage.genworth.insurance.factory.FactoryLifeGeneralnsurance;
import com.cybage.genworth.insurance.service.InsuranceTypeService;

public class FactoryPolicyType {

	public InsuranceTypeService getFactoryObject(String getInsuranceType) {
		return FactoryLifeGeneralnsurance.getUserType(getInsuranceType);
	}
}