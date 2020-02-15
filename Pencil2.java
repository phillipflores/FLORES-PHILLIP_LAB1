package com.practicelab1;

public class Pencil2 {

	public static void main(String[] args) {
		
		Pencil p1 = new Pencil("Mongol Pencil", "No. 2", 7.5, "Cedar Wood", 94.75);
		
		System.out.println("Properties of a Pencil: \n");
		System.out.println("Brand : " + p1.getBrand());
		System.out.println("Lead  : " + p1.getLead());
		System.out.println("Length: " + p1.getLength() + " in");
		System.out.println("Wood  : " + p1.getWood());
		System.out.println("Price : " + p1.getPrice() + " php");
		
	}

}
