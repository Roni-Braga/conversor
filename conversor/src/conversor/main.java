package conversor;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
		
		TipodeConversor Conversor = new TipodeConversor();
		TestaConversorTempo tempo = new TestaConversorTempo();
		try {
		String opcoes = JOptionPane.showInputDialog(null,"Escolha uma opção","Menu",JOptionPane.QUESTION_MESSAGE,null,new Object[] {"Conversor de Moedas","Conversor de Tempo"},"Escolha").toString();
		if(opcoes.equals("Conversor de Moedas")){
			Conversor.converterMoedas();
		}else {
			tempo.ConverteTempo();
		}
		
		}
		catch(Exception ex) {
			DesejaContinuar();
		}
		
		 
	}			
	
	public static void DesejaContinuar() {
		
		int resposta = JOptionPane.showConfirmDialog(null,"Deseja Continuar?");
		if(resposta == JOptionPane.OK_OPTION) {
						
			main(null);
		
		}
		else if(resposta == JOptionPane.NO_OPTION) {
			
			JOptionPane.showMessageDialog(null,"Programa Finalizado!");
			
			
			
		}
		else  {
			
			JOptionPane.showMessageDialog(null,"Programa Concluído!");
		
		}
		
		
		

}
}