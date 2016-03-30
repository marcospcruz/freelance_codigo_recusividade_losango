package recursividade_exercicio1;

public class Recursivo {
	private int linha = 0; // contador de linhas
	private int n; // total de repetições passado pelo usuário
	// private int limiteLinha;
	private boolean decrementaLinha;

	public static void main(String args[]) {
		new Recursivo().desenhaLosango(10);
	}

	private void desenhaLosango(int n) {
		// TODO Auto-generated method stub

		if (n > 9) {

			System.out.println("Tamanho inválido. Informar de 1 a 9!");
			return;

		}

		int contador = 0;
		boolean meio = false;

		setN(n);

		// if (limiteLinha == 0)
		// limiteLinha = n - 1;

		while (linha >= 0) {
			// int limiteDaLinha = limiteLinha - linha;
			int limiteDaLinha = this.n - linha;
			// for (int i = 0; i <= limiteLinha + linha; i++) {
			for (int i = 0; i <= this.n + linha; i++) {

				// if (i < (limiteDaLinha) || i > limiteLinha + linha) {
				if (i < (limiteDaLinha) || i > this.n + linha) {
					System.out.print(" ");
				} else {

					if (contador > linha || meio == true) {
						contador--;
						meio = true;
					} else
						contador++;

					System.out.print(contador);

				}

			}
			System.out.println();
			// System.out.println("linha:" + linha);
			// System.out.println("marcadorColuna:" + marcaLosango);

			// if (linha == limiteLinha)
			if (linha == this.n - 1)
				this.decrementaLinha = true;

			if (!decrementaLinha)
				linha++;
			else
				linha--;

			desenhaLosango(linha);

		}

	}

	private void setN(int n) {
		// TODO Auto-generated method stub

		if (this.n == 0)

			this.n = n;

	}

}
