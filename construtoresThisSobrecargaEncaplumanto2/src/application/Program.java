package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		product.setName(sc.nextLine());
		System.out.println("Price: ");
		product.setPrice(sc.nextDouble());
		System.out.println("Quantity in stock: ");
		product.setPrice(sc.nextInt());
		
		System.out.println();		
		System.out.printf("Product data: %.2f%n", product.getPrice());
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Update data: " + product);
		
		sc.close();
		
		
	}

}
