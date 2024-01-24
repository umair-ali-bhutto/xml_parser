package com.ag.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ErrorList")
public class FundamoErrorList {

	private FundamoErrorMap errorMap;

	@XmlElement(name = "ErrorMap")
	public FundamoErrorMap getErrorMap() {
		return errorMap;
	}

	public void setErrorMap(FundamoErrorMap errorMap) {
		this.errorMap = errorMap;
	}
}
