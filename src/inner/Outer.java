/**
 * 
 */
package inner;

/**
 * @author Raul Espinoza
 *
 */
class Outer {

	/**
	 * 
	 */
	void outerMethod() {
		
		int x = 98;
		
		System.out.println("inside outerMethod");
		
		class Inner{
			
			void innerMethod() {
				System.out.println("x 0 " + x);
			}
		}
		
		Inner y = new Inner();
		y.innerMethod();
	}
}

class MethodLocalVariableDemo{
	public static void main(String[] args) {
		Outer x = new Outer();
		x.outerMethod();
	}
}

