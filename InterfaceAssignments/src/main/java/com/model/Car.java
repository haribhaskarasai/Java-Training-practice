package com.model;

public class Car extends Vehicle {
	private String carName;
	private String carModel;
	public Car(String carName, String carModel) {
		super();
		this.carName = carName;
		this.carModel = carModel;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
}
