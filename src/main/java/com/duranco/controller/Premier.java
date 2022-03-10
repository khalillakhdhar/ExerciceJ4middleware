package com.duranco.controller;

public class Premier {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public Premier(int a) {
		super();
		this.a = a;
	}

	public Premier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String premier()
	{
		int i=2;
		while(this.a % i!=0 && i<this.a)
		{
			i++;
		}
		if(i>=this.a-1)
		{
			return "premier";
		}
		else
			return "n 'est pas pas premier";
		
	}
	
	
	
	

}
