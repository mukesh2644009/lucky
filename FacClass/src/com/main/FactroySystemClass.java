package com.main;

public class FactroySystemClass {
	public OS getInstance(String str) {
		if (str.equals("most"))
			return new Android();
		else if (str.equals("secure"))
			return new IOS();
		else
			return new Windows();
	}

}
