package com.practicelab1;

public class Pencil {

	private String brand;
	private String lead;
	private double length;
	private String wood;
	private double price;

	public Pencil(String brand, String lead, double length, String wood, double price) {
		this.brand = brand;
		this.lead = lead;
		this.length = length;
		this.wood = wood;
		this.price = price;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getLead() {
		return this.lead;
	}

	public double getLength() {
		return this.length;
	}

	public String getWood() {
		return this.wood;
	}

	public double getPrice() {
		return this.price;
	}
	
}
