package abstract_;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() {
		System.out.println("Dibujando un rectangulo");
	}
}

class Circle extends Shape{
	void draw() {System.out.println("Dibujando un circulo");}
}

class Test{
	public static void main(String args[]) {
		Shape s = new Circle();
		s.draw();
	}
}