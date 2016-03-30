package recursividade_exercicio1;

public class Recursivo {

	private int linha = 0; // contador de linhas

	private int n; // total de repeti��es passado pelo usu�rio

	// controle de decrementa��o de linha. Invers�o do tri�ngulo
	private boolean decrementaLinha;

	public static void main(String args[]) {

		int numero = 9;

		// valida��o de entrada de valores para limitar valores entre 1 e 9.
		if (numero < 0 || numero > 9) {

			System.out.println("Tamanho inv�lido. Informar de 1 a 9!");
			return;

		}
		new Recursivo().desenhaLosango(numero);

	}

	/**
	 * M�todo recursivo para desenhar o Losango
	 * 
	 * @param n
	 */
	private void desenhaLosango(int n) {
		// contador de caracteres que formar�o a figura.
		int contador = 0;
		// controlador de incremeta��o e decrementa��o do contador que formar� a
		// figura.
		boolean meio = false;
		// configurando o valor passado pelo usu�rio
		setN(n);
		// Loop de repeti��o.
		while (linha >= 0) {

			for (int i = 0; i <= this.n + linha; i++) {
				// condi��o para marcar os espa�os em branco.
				if (i < (this.n - linha) || i > this.n + linha) {

					System.out.print(" ");
					// condi��o para desenhar a figura.
				} else {
					// desenhando a figura
					if (contador > linha || meio == true) {
						// decrementa��o do contador, caractere que formar� a
						// figura.
						contador--;
						meio = true;

					} else
						// decrementa��o do contador, caractere que formar� a
						// figura.
						contador++;

					System.out.print(contador);

				}

			}
			// pulando para a pr�xima linha
			System.out.println();

			// marca��o do meio do losango
			if (linha == this.n - 1)
				this.decrementaLinha = true;

			// incrementando ou decrementando o losango conforme a marca��o do
			// meio.
			if (!decrementaLinha)
				linha++;
			else
				linha--;

			// chamada recursiva deste m�todo
			desenhaLosango(linha);

		}

	}

	/**
	 * M�todo respons�vel em armazenar o valor passado pelo usu�rio se o aributo
	 * n for 0(zero). for 0.
	 * 
	 * @param n
	 */
	private void setN(int n) {

		if (this.n == 0)

			this.n = n;

	}

}
