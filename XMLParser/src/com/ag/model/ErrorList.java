package com.ag.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ErrorList")
public class ErrorList {

	private ErrorMap errorMap;

	@XmlElement(name = "ErrorMap")
	public ErrorMap getErrorMap() {
		return errorMap;
	}

	public void setErrorMap(ErrorMap errorMap) {
		this.errorMap = errorMap;
	}
}
