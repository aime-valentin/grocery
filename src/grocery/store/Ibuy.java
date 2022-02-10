package grocery.store;

public interface Ibuy {
	
	public void addToCart(Product product);
	public void removeToCart(Product product);
	public void changeCartProduct(Product product, Integer Num);
	public void pay(IPayment payment); 
	
}
