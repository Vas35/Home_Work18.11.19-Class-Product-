package ua.univer.shop;

public class Product {
	String type;
	String name;
	float weight;
	short price;

	public Product(String type, String name, float weight, short price) {

		this.type = type;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String toString() { 
		return "type = " + type + ", " + "name = " + name + ", " + "weight = " + weight + ", " + "price = " + price;
	}

}
