package pizzaOrder;

public class Pizza {

	/*Declaration*/
	String pizza_name;
	String pizza_type;
	int pizza_amt;
	int quantity;
	
	/*Getters and Setters*/
	
	public String getPizza_name() {
		return pizza_name;
	}
	public void setPizza_name(String pizza_name) {
		this.pizza_name = pizza_name;
	}
	public String getPizza_type() {
		return pizza_type;
	}
	public void setPizza_type(String pizza_type) {
		this.pizza_type = pizza_type;
	}
	public int getPizza_amt() {
		return pizza_amt;
	}
	public void setPizza_amt(int pizza_amt) {
		this.pizza_amt = pizza_amt;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	/*Constructor*/
	
	public Pizza(String pizza_name, String pizza_type, int pizza_amt, int quantity) {
		super();
		this.pizza_name = pizza_name;
		this.pizza_type = pizza_type;
		this.pizza_amt = pizza_amt;
		this.quantity = quantity;
	}
	
	
	
}
