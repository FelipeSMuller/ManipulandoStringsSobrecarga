package treinandoMetodos;

import javax.swing.JOptionPane;

public class ManipulaString {

	public static void receberFrase(String primeiraFrase) {

		// Em Java, as strings são imutáveis, o que significa que qualquer modificação
		// em uma string resulta em uma nova string. Ao modificar a variável
		// primeiraFrase dentro do método avaliarFrase, essa modificação não afetará a
		// variável original fora do método, a menos que seja retornada a nova string ou
		// a
		// reatribua fora do método.

		String fraseFormatada = avaliarFrase(primeiraFrase);

		JOptionPane.showMessageDialog(null, "A frase fornecida contém " + fraseFormatada.length() + " caracteres");
	}

	public static void inverterFrase(String frase) {

		char caractere;

		String fraseInvertida = "";

		frase = avaliarFrase(frase);

		for (int i = frase.length() - 1; i >= 0; i--) {

			caractere = frase.charAt(i);

			fraseInvertida += caractere;

		}

		JOptionPane.showMessageDialog(null, "Frase fornecida = " + frase + "\nFrase invertida = " + fraseInvertida);

	}

	public static void receberFrase(String primeiraFrase, String segundaFrase) {

		String frase = avaliarFrase(primeiraFrase, segundaFrase);

		JOptionPane.showMessageDialog(null, "Frases concatenadas = " + "\n" + frase);

	}

	// Método que faz a verificação de uma frase inserida pelo usuário
	public static String avaliarFrase(String primeiraFrase) {

		// Verifica se o campo está vazio
		if (primeiraFrase.isEmpty()) {

			JOptionPane.showMessageDialog(null, "O campo precisa conter alguma informação, preencha corretamente!!");

		} else {

			// Caso contrário a frase será convertida em letras minusculas
			primeiraFrase = primeiraFrase.toLowerCase();

			// E os espaços serão retirados
			primeiraFrase = primeiraFrase.replace(" ", "");

			// Atribuindo em uma nova variavel.
			String fraseFormatada = primeiraFrase; // Atribuir à variável fraseFormatada

			return fraseFormatada;
		}
		return null; // Retorna null se a frase estiver vazia
	}

	// Método que faz a verificação de duas frases inseridas pelo usuário

	public static String avaliarFrase(String primeiraFrase, String segundaFrase) {

		if (primeiraFrase.isEmpty() || segundaFrase.isEmpty()) {

			JOptionPane.showMessageDialog(null, "O campo precisa conter alguma informação, preencha corretamente!!");

		}

		else {

			// Caso contrário a frase será convertida em letras minusculas
			primeiraFrase = primeiraFrase.toLowerCase();

			segundaFrase = segundaFrase.toLowerCase();

			// E os espaços serão retirados
			primeiraFrase = primeiraFrase.replace(" ", "");

			segundaFrase = segundaFrase.replace(" ", "");

			// Atribuindo em uma nova variavel.
			String fraseFormatada = primeiraFrase + segundaFrase; // Atribuir à variável fraseFormatada

			return fraseFormatada;

		}
		return null; // Retorna null se a frase estiver vazia

	}
}
