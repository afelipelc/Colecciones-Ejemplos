import java.util.ArrayList;
import java.util.List;


public class MainClass {

	public static void main(String[] args) {
		//Arreglos
		int[] numeros = new int[4];
		//agregando valores en sus posiciones
		//a través del índice
		numeros[0] = 3;
		numeros[1] = 6;
		numeros[2] = 9;
		numeros[3] = 13;
		//la longitud es 4, el último índice es 3
		for(int i=0; i <= numeros.length-1; i++){
			System.out.println("El valor es " + numeros[i]);  
		}
		System.out.println("\n");
		
		//recorrer el arreglo con un foreach
		//que se lee: para cada elemento item EN numeros
		for(int item : numeros){
			System.out.println("El valor es " + item);
		}
		
		//int[][] nums = new int[4][2];
		
		//Listas con List<>
		List<Integer> nums = new ArrayList<Integer>();
		//¿Qué puedo hacer con una lista?
		//Una lista contiene método que puedo utilizar
		//para realizar operaciones específicas
			//agregar, eliminar, modificar, mover, 
			//extraer, reemplazar
		//agregar elementos: con add()
		//eliminar: remove()
		//extraer:  get()
		//encontrar: find()
		
		//agregar valores: 3, 6, 9, 13
		nums.add(3);
		nums.add(6);
		nums.add(9);
		nums.add(13);
		//recorrer la lista
		System.out.println("\nRecorriendo la lista");
		for(int i=0; i <= nums.size()-1; i++){
			System.out.println("El valor es: " + nums.get(i));
		}
		
		System.out.println("");
		
		nums.remove(2); //eliminar el elemento en el índice: 2
		
		for(int item : nums){
			System.out.println("El valor es " + item);
		}
		
		
		/*
		 * Programa que guarde mis números de la suerte
		 * 20, 13, 6, 14, 7 y 21
		 * considere además que posteriormente puedo tener nuevos
		 * números de la suerte
		 * nota: mis números iniciales están en un arreglo
		 */
		
		//los números iniciales
		int[] numerosSuerte = new int[6];
		numerosSuerte[0] = 20;
		numerosSuerte[1] = 13;
		numerosSuerte[2] = 6;
		numerosSuerte[3] = 14;
		numerosSuerte[4] = 7;
		numerosSuerte[5] = 21;
		
		//agregar la lista
		List<Integer> numerosDeSuerte = new ArrayList<Integer>();

		//extraer los números de la suerte y pasarlos a la lista
		//¿Ajá y comó?
		//con FOR
//		for(int i=0; i < numerosSuerte.length; i++){
//			numerosDeSuerte.add(numerosSuerte[i]);
//		}
		
		//con Foreach
		for(int item : numerosSuerte){
			numerosDeSuerte.add(item);
		}
		
		System.out.println("\n\nEstos son mis números de la suerte");
		//recorremos la lista
		for(int item : numerosDeSuerte){
			System.out.println(item);
		}
	}

}
