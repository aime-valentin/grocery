package grocery.store;

import java.awt.image.BufferedImage;

public class Pharmacetical extends Product implements IPharmacetical {

	public Pharmacetical(String name, BufferedImage image, String manfnfo, String descrpt, double height, double width,
			double weight, Integer rating, String sKU) {
		super(name, image, manfnfo, descrpt, height, width, weight, rating, sKU);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getPrescriptions() {
		// TODO Auto-generated method stub
		return null;
	}

}
