package view;
import javax.swing.JOptionPane;
import controller.SomatoriaController;

public class Main {

	public static void main(String[] args) {
		int N = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro para a somatória: "));
		
		SomatoriaController sCont = new SomatoriaController();
		
		System.out.println("Numero: " + N);
		
//		//Teste para o resultado esperado:
//		double S = 0;
//		for (double i = 1; i <= N; i++) {
//			S = S + 1/i;
//		}
//		System.out.println("Resultado esperado: " + S);
		
		
		double resultado = sCont.calculaSomatoria(N);
		System.out.println("Resultado da somatória: " + resultado);

	}
	
}
