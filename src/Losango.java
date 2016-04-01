/**
 * Classe com método recursivo para fazer desenho na figura de Losango.
 * 
 * @author
 *
 */
public class Losango {

	private int linha = 0; // contador de linhas

	private int n; // total de repetições passado pelo usuário

	// controle de decrementação de linha. Inversão do triângulo
	private boolean decrementaLinha;

	public static void main(String args[]) {

		try {
			int numero = new Integer(args[0]);
			// validação de entrada de valores para limitar valores entre 1 e
			// 9.
			if (numero < 1 || numero > 9) {

				System.out.println("Numero invalido. Informar de 1 a 9!");
				return;

			}

			new Losango().desenhaLosango(numero);

		} catch (Exception e) {

			System.out
					.println("Erro! Informar parametro numerico ao programa.\nExemplo: java Losango <numero inteiro>");

		}

	}

	/**
	 * Método recursivo para desenhar o Losango
	 * 
	 * @param n
	 */
	private void desenhaLosango(int n) {
		// contador de caracteres que formarão a figura.
		int contador = 0;
		// controlador de incremetação e decrementação do contador que
		// formará a
		// figura.
		boolean meio = false;
		// configurando o valor passado pelo usuário
		setN(n);

		for (int i = 0; i <= this.n + linha; i++) {
			// condição para marcar os espaços em branco.
			if (i < (this.n - linha) || i > this.n + linha) {

				System.out.print(" ");
				// condição para desenhar a figura.
			} else {
				// desenhando a figura
				if (contador > linha || meio == true) {
					// decrementação do contador, caractere que formará a
					// figura.
					contador--;
					meio = true;

				} else
					// decrementação do contador, caractere que formará a
					// figura.
					contador++;

				System.out.print(contador);

			}

		}
		// pulando para a próxima linha
		System.out.println();

		// marcação do meio do losango
		if (linha == this.n - 1)
			this.decrementaLinha = true;

		// incrementando ou decrementando o losango conforme a marcação do
		// meio.
		if (!decrementaLinha)
			linha++;
		else
			linha--;

		if (linha >= 0)
			// chamada recursiva deste m�todo
			desenhaLosango(linha);

	}

	/**
	 * Método responsável em armazenar o valor passado pelo usuário se o aributo
	 * n for 0(zero). for 0.
	 * 
	 * @param n
	 */
	private void setN(int n) {

		if (this.n == 0)

			this.n = n;

	}

}
