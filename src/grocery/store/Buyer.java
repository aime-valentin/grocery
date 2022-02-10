package grocery.store;

public class Buyer extends Person implements Ibuy {
	
	private Cart cart; 
	private Account acc;

	public Buyer(String firstName, String lastName, String emailAddress, String phoneNumber,
			Cart cart, Account acc) {
		super(firstName, lastName, emailAddress, phoneNumber);
		// TODO Auto-generated constructor stub
		this.setCart(cart);
		this.setAcc(acc); 
	}


	public void addToCart(Product product) {
		// TODO Auto-generated method stub
		
	}


	public void removeToCart(Product product) {
		// TODO Auto-generated method stub
		
	}


	public void changeCartProduct(Product product, Integer Num) {
		// TODO Auto-generated method stub
		
	}

	public void pay(IPayment payment) {
		// TODO Auto-generated method stub
		
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
	
	
	
}
