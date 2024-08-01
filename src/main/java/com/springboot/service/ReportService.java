package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.ReportDao;

@Service
public class ReportService {
	
	
	
	private ReportDao reportdao;
	
//	@Autowired
//	public void setReportDao(ReportDao reportdao) {
//		System.out.println("setReportDao method call");
//		this.reportdao = reportdao;
//	}
//	
//	
	
//	if there is single constructor then we dont need to write annotation @Autowire
	
	public ReportService (ReportDao reportdao) {
		System.out.println("Param-Constructor call without Autowire");
		this.reportdao = reportdao;
	}

	public void generatedReport() {
		reportdao.findData();
		System.out.println("Getting reportdata");
	}
}
