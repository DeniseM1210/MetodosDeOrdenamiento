import java.util.Arrays;

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
	
		
}
public class PruebaMetodosOrdenamiento {

	public static void main(String[] args) {
		int[] numeros = {7, 11, 28, 4, 22, 21, 1, 4, 2, 2, 48};
		
		System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
		
		MetodosOrdenamiento mo = new MetodosOrdenamiento();
		
		mo.ordenarInsercion(numeros);
		
		System.out.println("Numeros desordenados: " + Arrays.toString(numeros));
		

	}

}
