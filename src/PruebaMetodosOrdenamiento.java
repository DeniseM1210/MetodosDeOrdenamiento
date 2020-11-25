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
		
	public int[] quicksort(int[] array, int izq, int der) {
		int pivote = array[izq];
		int i = izq, j = der;
		int aux;
		while(i < j) {
			while(array[i] <= pivote && i < j) i++;
			while(array[j] > pivote) j--;
			if(i < j) {
				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
			}
		}
		array[izq] = array[j];
		array[j] = pivote;
		if(izq < j - 1) {
			quicksort(array, izq, j - 1);
		}
		if(j + 1 < der) {
			quicksort(array, j + 1, der);
		}
		return array;
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
		System.out.println("4.- Ordenación por Quicksort");
		
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
			case 4: System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
					mo.quicksort(numeros, 0, numeros.length - 1);
					System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
			}
		

	}

}
