import java.util.Locale;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		/*
		System.out.println(3+2*4);
		System.out.println(2*6/3);
		System.out.println((3+2)*4);
		System.out.println(60/(3+2)*4);
		System.out.println(60/((3+2)*4));
		System.out.println(14 % 3); // 14 dividido por 3 =4 resto 2
		System.out.println(19 % 5); // 19 dividido por 5 =3 resto 4
		*/
	}

}
