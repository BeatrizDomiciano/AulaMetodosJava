package exercicios;
import javax.swing.JOptionPane;
public class Exercicio01 {
	
	public static void delta(int a, int b, int c) {
		int result = (b*b)-(4*a*c) ;
		JOptionPane.showMessageDialog(null,"O valor de Delta �: " + result , "RESULTADO", 1);
	}
	public static void main(String[] args) {
		/* Crie um m�todo que receba tr�s valores, 'a', 'b' e 'c', 
		 * que s�o os coeficientes de uma equa��o do segundo grau 
		 * e retorne o valor do delta, que � dado por 'b� - 4ac�.*/
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro n�mero: "));
				
		delta(n1,n2,n3);
	}

}
