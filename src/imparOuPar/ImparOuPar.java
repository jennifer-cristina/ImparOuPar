package imparOuPar;

public class ImparOuPar {

	public static void main(String[] args) {
		// Desenvolver uma sequencia de 0 at� 100 determinando quais s�o Pares e �mpares.

		int contador = 0;
		
		while (contador <= 100) {
			if (contador % 2 == 0) {
				System.out.println(contador + " - Par ");
			} else {
				System.out.println(contador + " - �mpar ");
			}
			
			contador = contador + 1;
			
		}
	}

}
