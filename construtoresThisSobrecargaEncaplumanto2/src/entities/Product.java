package entities;
/*
 * classe produto
 * */
public class Product {

	private String name;
	private double price;
	private int quantity;
	
	// A medida que a classe tiver mais de um contrutor dizemos que existe uma sobrecarga
	
	public Product() {
		
	}
	// A medida que a classe tiver mais de um contrutor dizemos que existe uma sobrecarga
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;		
	}
		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	// usado o getQuatity() para manter a integridade por entender que a quantidade do produto
	// não pode ser alterada pelo usuario
	public int getQuantity() {
		return quantity;
	}

	// Calcula total do stock
	public double totalValueInStock() {
		return price * quantity;
	}
	
	/*
	 * adiciona produto no stock
	 * void por não retornar valor
	 */	
	public void addProducts (int quantity) {
		this.quantity += quantity;
	}
	
	/*
	 * remove produto do stock
	 */
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}	

	public String toString() {
		return name
		+ ", $ "
		+ String.format("%.2f", price)
		+ ", "
		+ quantity
		+ " units, Total: $ "
		+ String.format("%.2f", totalValueInStock());
	}
}
