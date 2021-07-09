import java.util.Scanner;

public class ControlDelFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * if (condicion) {
		 * 
		 * cofigo
		 * codigo
		 * }
		 * "Si no se cumple la condicion se ejecuta else"
		 * else{
		 * codigo
		 * }
		 * 
		 * opcion 2
		 * if (condicion){
		 * codigo
		 * }
		 * "Si se cumple la condicion else if se ejecutara"
		 * else if (condicion){
		 * codigo
		 * codigo
		 * }
		 * else if (condicion){
		 * codigo
		 * }
		 * 
		 * else{codigo}
		 */
		
		/*Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int edad = leerEdad.nextInt();
		
		String mensaje = votar(edad);
		
		System.out.println(mensaje);
//		System.out.println(votar(edad));*/
		
		/*----------------------------------------------------------------
		 * Escribir un programa que pida el nombre y la edad de un participante 
		 * si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un 
		 * mensaje que diga "Felicidades + nombreIngresado, estas aceptado en 
		 * el programa de generation Java Full Stack". En caso de no cumplirse 
		 * la condición, mostrar un mensaje que diga "No cumples lo requisitos 
		 * para el bootcamp Java Full Stack" 
		 */
		
		Scanner leerNombre = new Scanner(System.in);
		System.out.println("Ingresa tu nombre: ");
		String nombre = leerNombre.nextLine();
		
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad: ");
		int edad = leerEdad.nextInt();
		
		
		String respuesta = bootcamp(nombre, edad);
		
		System.out.println(respuesta);
	}
	
	/*public static String votar(int edad) {
		String mensaje = "";
		
		if (edad >= 18) {
			mensaje = "Felicidades, puedes votar";
		}
		else {
			mensaje = "No puedes votar";
		}
		
		return mensaje;
	}*/
	
	public static String bootcamp (String nombre, int edad) {
		
		String mensaje = "";
		
		if(edad >= 18 && edad <= 29) {
			mensaje = "Felicidades " + nombre + ", estas aceptado en "
					+ "el programa de generation Java Full Stack";
		}
		else {
			mensaje = "No cumples lo requisitos para el "
					+ "bootcamp Java Full Stack";
		}
		
		return mensaje;
		
	}

}
