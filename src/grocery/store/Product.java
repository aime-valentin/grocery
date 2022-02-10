package grocery.store;

import java.awt.image.BufferedImage;

public abstract class Product {
	
	private String name; 
	private BufferedImage image;  
	private String manfnfo; 
	private String descrpt; 
	private double height; 
	private double width; 
	private double weight; 
	private Integer rating; 
	private String SKU;
	
	public Product(String name, BufferedImage image, String manfnfo, String descrpt, double height, double width,
			double weight, Integer rating, String sKU) {
		super();
		this.name = name;
		this.image = image;
		this.manfnfo = manfnfo;
		this.descrpt = descrpt;
		this.height = height;
		this.width = width;
		this.weight = weight;
		this.rating = rating;
		SKU = sKU;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public String getManfnfo() {
		return manfnfo;
	}

	public void setManfnfo(String manfnfo) {
		this.manfnfo = manfnfo;
	}

	public String getDescrpt() {
		return descrpt;
	}

	public void setDescrpt(String descrpt) {
		this.descrpt = descrpt;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getSKU() {
		return SKU;
	}

	public void setSKU(String sKU) {
		SKU = sKU;
	}
	
	

}
