package grocery.store;

import java.awt.image.BufferedImage;

public class Grocery extends Product implements IGrocery, Ifilter, Isort  {

	public Grocery(String name, BufferedImage image, String manfnfo, String descrpt, double height, double width,
			double weight, Integer rating, String sKU) {
		super(name, image, manfnfo, descrpt, height, width, weight, rating, sKU);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sortByLowToHighPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByHighToLowPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByLowToHighRating() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortByHighToLowRating() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filterByPrice() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filterByCategory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filterByRating() {
		// TODO Auto-generated method stub
		
	}

}
