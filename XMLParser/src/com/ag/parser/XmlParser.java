package com.ag.parser;

import java.io.File;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.ag.model.FundamoErrorList;
import com.ag.model.FundamoErrorMap;

/*
 * 
 * Custom Fundamo XML Parser
 * @Author Umair.Ali<umair.ali@access.net.pk> (24-01-2024)
 * 
 */

public class XmlParser {

	/*
	 * These Methods Parse XML And Returns Custom Fundamo Model (FundamoErrorMap)
	 * --FundamoErrorMap.getCode(); --FundamoErrorMap.getEng();
	 * --FundamoErrorMap.getUrdu(); --FundamoErrorMap.getFundamocode();
	 * 
	 */

	public FundamoErrorMap parseXMLFromFile(String filePath) {
		FundamoErrorMap map = new FundamoErrorMap();
		try {
			if (filePath.toLowerCase().endsWith(".xml")) {
				File xmlFile = new File(filePath);
				JAXBContext jaxbContext = JAXBContext.newInstance(FundamoErrorList.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				FundamoErrorList errorList = (FundamoErrorList) jaxbUnmarshaller.unmarshal(xmlFile);
				map = errorList.getErrorMap();
			} else {
				System.out.println("Only Xml File Format Is Supported.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}

	public FundamoErrorMap parseXMLFromString(String xmlString) {
		FundamoErrorMap map = new FundamoErrorMap();
		try {
			if (xmlString.trim().startsWith("<?xml")) {
				JAXBContext jaxbContext = JAXBContext.newInstance(FundamoErrorList.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				StringReader reader = new StringReader(xmlString);
				FundamoErrorList errorList = (FundamoErrorList) jaxbUnmarshaller.unmarshal(reader);
				map = errorList.getErrorMap();
			} else {
				System.out.println("Invalid XML String.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;
	}
}
