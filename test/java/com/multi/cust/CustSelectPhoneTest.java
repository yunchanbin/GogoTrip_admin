package com.multi.cust;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.multi.biz.CustBiz;
import com.multi.vo.CustVO;

@SpringBootTest
class CustSelectPhoneTest {

	@Autowired
	CustBiz biz;
	
	@Test
	void contextloads() {
		try {
			CustVO obj = biz.getphone("01000000000");
			System.out.println(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
