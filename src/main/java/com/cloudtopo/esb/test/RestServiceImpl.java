package com.cloudtopo.esb.test;

public class RestServiceImpl implements RestService {

	public String handleGet(String name) {
		return String.format("Hello %s.", name);
	}
}