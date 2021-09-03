package imparOuPar;

public class ImparOuPar {

	public static void main(String[] args) {
		// Desenvolver uma sequencia de 0 até 100 determinando quais são Pares e Ímpares.

		int contador = 0;
		
		while (contador <= 100) {
			if (contador % 2 == 0) {
				System.out.println(contador + " - Par ");
			} else {
				System.out.println(contador + " - Ímpar ");
			}
			
			contador = contador + 1;
			
		}
	}

}
