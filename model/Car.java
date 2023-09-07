package com.gl.ioc.model;

public class Car {
    private String modelname;
    private Engine engine;
	public String getModelname() {
		return modelname;
	}
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Car(String modelname, Engine engine) {
		super();
		this.modelname = modelname;
		this.engine = engine;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [modelname=" + modelname + ", engine=" + engine + "]";
	}
    
}
