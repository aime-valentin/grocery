package grocery.store;

import java.awt.image.BufferedImage;

public class Fashion extends Product implements IFashion {

	public Fashion(String name, BufferedImage image, String manfnfo, String descrpt, double height, double width,
			double weight, Integer rating, String sKU) {
		super(name, image, manfnfo, descrpt, height, width, weight, rating, sKU);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sortByGender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortBySize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filterByColor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void filterByType() {
		// TODO Auto-generated method stub
		
	}

}
