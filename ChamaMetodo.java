package treinandoMetodos;

import javax.swing.JOptionPane;

public class ChamaMetodo {

	public static void main(String[] args) {

		String primeiraFrase = "";

		String segundaFrase = "";

		int opcao = 0;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção \n1-Contagem de Caracteres \n2-Concatenar frases \n3-Inversão de String"));

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,

						"Você inseriu dados não numéricos ou o programa foi encerrado incorretamente!!!");

			}

			switch (opcao) {

			case 1:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira uma frase qualquer: ");

				ManipulaString.receberFrase(primeiraFrase);

				break;

			case 2:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira a primeira frase: ");

				segundaFrase = JOptionPane.showInputDialog(null, "Insira a segunda frase: ");

				ManipulaString.receberFrase(primeiraFrase, segundaFrase);

				break;

			case 3:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira a frase que será invertida ");

				ManipulaString.inverterFrase(primeiraFrase);

				break;

			}

		} while (opcao > 0);

	}

}
