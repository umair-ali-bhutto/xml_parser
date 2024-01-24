package com.ag.parser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.ag.model.ErrorList;
import com.ag.model.ErrorMap;

public class XmlParser {
	public ErrorMap parseXML(String filePath) {
		ErrorMap map = new ErrorMap();

		try {
			File xmlFile = new File(filePath);
			JAXBContext jaxbContext = JAXBContext.newInstance(ErrorList.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			ErrorList errorList = (ErrorList) jaxbUnmarshaller.unmarshal(xmlFile);
			ErrorMap errorMap = errorList.getErrorMap();

			System.out.println("Code: " + errorMap.getCode());
			System.out.println("English: " + errorMap.getEng());
			System.out.println("Urdu: " + errorMap.getUrdu());
			System.out.println("Fundamo Code: " + errorMap.getFundamocode());

		} catch (Exception e) {
			e.printStackTrace();
		}

		return map;
	}
}
