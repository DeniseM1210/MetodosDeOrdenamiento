import java.util.Arrays;
import java.util.Scanner;

class MetodosOrdenamiento{
	public void ordenarInsercion(int [] numeros) {
		int aux;
		
		for(int i = 1; i < numeros.length; i++) {
			aux = numeros[i];
			
			for(int j = i-1; j > 0 && numeros[j] > aux; j--) {
				numeros[j+1] = numeros[j];
				numeros[j] = aux;
			}
		}
	}
	
	public void ordenarSeleccion(int[] numeros) {
		for(int i = 0; i < numeros.length - 1; i++) {
			for(int j = i + 1; j < numeros.length; j++) {
				if(numeros[i] > numeros[j]) {
					int orden = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = orden;
				}
			}
		}
	}
		
	
		
}
public class PruebaMetodosOrdenamiento {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numeros = {7, 11, 28, 4, 22, 21, 1, 4, 2, 2, 48};
		
		MetodosOrdenamiento mo = new MetodosOrdenamiento();
		int op1;
		
		System.out.println("--- Menú ---");
		System.out.println("1.- Ordenación metodo de la burbuja");
		System.out.println("2.- Ordenación por inserción");
		System.out.println("3.- Ordenación por selección");
		
		System.out.println("Elija una opción: ");
		op1 = entrada.nextInt();
			switch(op1) {
			case 1: 
				break;
			case 2: System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
					mo.ordenarInsercion(numeros);
					System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
			break;
			case 3: System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
					mo.ordenarSeleccion(numeros);
					System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
			break;
			}
		

	}

}
