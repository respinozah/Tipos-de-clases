package static_;

class ClassExterna {
	
	static int data = 30;

	static class Interna{
		 static void mensaje() {
			 System.out.println("data es " + data);
		 }
	}

	public static void main(String[] args) {
		ClassExterna.Interna.mensaje();
	}

}
