package com.springboot.dao;

import org.springframework.stereotype.Repository;

@Repository
    public class ReportDaoImpl implements ReportDao {
	public ReportDaoImpl() {
		System.out.println("ReportDaoImpl::Constructor");
	}

	@Override
	public String findData() {
	System.out.println("Fetching Report");
	return "Report Data";
	}

}
