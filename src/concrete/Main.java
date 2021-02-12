/**
 * 
 */
package concrete;

/**
 * @author Raul Espinoza
 *
 */
public class Main {

	/**
	 * 
	 */
	static int multiplicacion(int a, int b) {
		return a * b;
	}
	
	static int suma(int a, int b) {
		return a + b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = multiplicacion(5, 10);
		int s = suma(5, 10);
		
		System.out.println("Multiplicacion: " + p);
		
		System.out.println("Suma:" + s);
	}
}
