package aplication;
import java.util.Locale;
import java.util.Scanner;
import entities.retangulo;
public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("teste github ");
		
		retangulo x;
		x = new retangulo();
				
		double arear,  perimetro , diagonal;		
		System.out.println ( "Digite a largura e altura do retangulo" );
		x.l = sc.nextDouble();
		x.a= sc.nextDouble();
		arear = x.area() ;
		perimetro = x.perimetro();
		diagonal = x.diagonal();
		System.out.printf ( "Area  %.2f%n" , arear );
		System.out.printf ( "Perimetro  %.2f%n", perimetro  );
		System.out.printf ( "Diagonal  %.2f%n",  diagonal );
		sc.close();
				}

	private static double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	}
