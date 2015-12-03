package com.gmail.freestyle_reunion;

public class Definition {
	String eText;
	String dText;
	int type;
	
	
	public Definition(String eText, String dText, int type) {
		super();
		this.eText = eText;
		this.dText = dText;
		this.type = type;
	}
	public String geteText() {
		return eText;
	}
	public void seteText(String eText) {
		this.eText = eText;
	}
	public String getdText() {
		return dText;
	}
	public void setdText(String dText) {
		this.dText = dText;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
}
