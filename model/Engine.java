package com.gl.ioc.model;

public class Engine {
   private String modelYear;

public String getModelYear() {
	return modelYear;
}

public void setModelYear(String modelYear) {
	this.modelYear = modelYear;
}

public Engine(String modelYear) {
	super();
	this.modelYear = modelYear;
}

public Engine() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Engine [modelYear=" + modelYear + "]";
}
   
}
