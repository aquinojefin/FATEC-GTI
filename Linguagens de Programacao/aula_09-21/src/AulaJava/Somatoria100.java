package AulaJava;

import javax.swing.JOptionPane;

public class Somatoria100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num, i=0, soma =0;
	do{
		String numS = JOptionPane.showInputDialog("Digite um número  \n Para sair digite 0(zero) ");
	 num = Integer.parseInt(numS);
	i++;
	soma= soma+num;
	
	}while (soma<100);
	JOptionPane.showInternalMessageDialog(null, "A soma dos numeros é: "+soma+
			"\n foram lidos "+i+" numeros");
	}

}
