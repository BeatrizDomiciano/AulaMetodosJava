package exercicios;
import javax.swing.JOptionPane;
public class Exercicio02 {

	public static void maiorValor(int n1, int n2) {
		if (n1>n2) {
			JOptionPane.showMessageDialog(null,"O primeiro n�mero (" + n1 + ") � o maior");
		} else {
			JOptionPane.showMessageDialog(null,"O segundo n�mero (" + n2 + ") � o maior");
		}
		
	}
	public static void main(String[] args) {
		//Crie um m�todo que receba 2 n�meros e retorne o maior valor.
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		maiorValor (valor1,valor2);


	}

}
