package edu.sibinfo.spring.basic.module03.service.impl;

import org.springframework.stereotype.Service;

import edu.sibinfo.spring.basic.module03.service.SmsService;

@Service
public class SmsServiceImpl implements SmsService {

	public void send(String mobile, String text) {
		System.out.printf("%s : \"%s\"", mobile, text).println();;
	}
}
