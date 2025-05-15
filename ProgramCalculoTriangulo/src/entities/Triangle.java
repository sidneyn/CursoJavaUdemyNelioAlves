package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
/*
 * Calcular a area do triangulo
 * não recebe parametro por ja estar definido os atribuitos a, b, c na classe
 */
	public double area() {
		double p = (a + b + c) / 2.0;		
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
