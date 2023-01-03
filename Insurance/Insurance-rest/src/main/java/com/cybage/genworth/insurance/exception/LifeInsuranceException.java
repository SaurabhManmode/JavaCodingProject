package com.cybage.genworth.insurance.exception;

public class LifeInsuranceException extends RuntimeException{

	
	private String errorMessages;

	public LifeInsuranceException(String errorMessage) {
		super(); //calling constructor Parent RunTime
		//this.errorMessage = errorMessage;
	}
	
	public String getErrorMessage() {
		return errorMessages;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessages = errorMessage;
	}
	
}
