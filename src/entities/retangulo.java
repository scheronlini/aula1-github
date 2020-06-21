package entities;

public class retangulo {
	
		public double a ;
		public double l ;
		
		public double area() {
			double result = (a * l);
			return result;
		}
		public double perimetro() {
			double result = 2 * (a + l);
			return result;
		}
		public double diagonal() {
			double result = Math.sqrt( a * a + l * l) ;
			return result;
		}
}