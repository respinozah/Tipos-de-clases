package singleton;

class Singleton {

	private static Singleton single_instance = null;
	public String s;
	
	private Singleton() {
		s = "Hola, soy un ejemplo";
	}

	public static Singleton getInstance() {
		if(single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
}
