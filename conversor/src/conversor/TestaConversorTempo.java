package conversor;

import javax.swing.JOptionPane;

public class TestaConversorTempo {
	
		public void ConverteTempo() {
			ConversorDeTempo tempo = new ConversorDeTempo();
			main main = new main();
			
			Object [] opcao = {"Converter Segundos em Minutos","Converter Minutos em Horas","Converter Horas em Dias"};
			Object c = JOptionPane.showInputDialog(null, "Como você deseja converter", "Menu", 3, null, opcao,""); 
			String valor = JOptionPane.showInputDialog(null,"Digite o valor a ser convertido?");
			boolean verifica = valor.matches("^[0-9]{1,}");
			if(verifica == true) {
				double valorRecebido = Double.parseDouble(valor);
				if(c.equals("Converter Segundos em Minutos")) {
					tempo.ConverterSegundosEmMinutos(valorRecebido);
				}
				else if(c.equals("Converter Minutos em Horas")) {
					tempo.ConverterMinutosEmHoras(valorRecebido);
				}
				else if(c.equals("Converter Horas em Dias")) {
					tempo.ConverterHorasEmDias(valorRecebido);
				}
			}else {
				JOptionPane.showMessageDialog(null, "Insira um valor válido para ser convertido");
				main.DesejaContinuar();
			}
		}

}