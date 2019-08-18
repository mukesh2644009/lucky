package com.main;

public class Favcmain 
{
	public static void main(String[] args) 
	{
		FactroySystemClass fsc = new FactroySystemClass();
		OS obj = fsc.getInstance("jiji");
		obj.spec();
			
			
	}

}
