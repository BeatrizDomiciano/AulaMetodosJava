package exercicios;
import javax.swing.JOptionPane;
public class Exercicio03 {

	public static void menorValor(int n1, int n2) {
		if (n1<n2) {
			JOptionPane.showMessageDialog(null,"O primeiro n�mero (" + n1 + ") � o menor");
		} else {
			JOptionPane.showMessageDialog(null,"O segundo n�mero (" + n2 + ") � o menor");
		}
		
	}
	public static void main(String[] args) {
		//Crie um m�todo que receba 2 n�meros e retorne o maior valor.
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		menorValor (valor1,valor2);


	}

}
