package com.ag.model;

import javax.xml.bind.annotation.XmlElement;

public class FundamoErrorMap {

	private String code;
	private String eng;
	private String urdu;
	private String fundamocode;

	@XmlElement
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement
	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	@XmlElement
	public String getUrdu() {
		return urdu;
	}

	public void setUrdu(String urdu) {
		this.urdu = urdu;
	}

	@XmlElement
	public String getFundamocode() {
		return fundamocode;
	}

	public void setFundamocode(String fundamocode) {
		this.fundamocode = fundamocode;
	}
}