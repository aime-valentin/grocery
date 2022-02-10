package grocery.store;

public abstract  class Payment {
	
	private String username;
	private String cardNumber; 
	private Address billingAddress;
	
	public Payment(String username, String cardNumber, Address add) {
		this.username = username;
		this.cardNumber = cardNumber;
		this.billingAddress = add; 
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	

	
}
