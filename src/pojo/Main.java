package pojo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado miEmpleado = new Empleado("Pepe Suarez","psuarez87", 8200);
		System.out.println("Nombre de empleado: " + miEmpleado.getNombre());
		System.out.println("Id de empleado: " + miEmpleado.getId());
		System.out.println("Salario del empleado: " + miEmpleado.getSalario());
	}

}
