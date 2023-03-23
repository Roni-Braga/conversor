package conversor;

import javax.swing.JOptionPane;
public class TipodeConversor {

	
	public  void converterMoedas() {
			 
		ConversorDeMoedas moedas = new ConversorDeMoedas();
		main main = new main();
		
			Object [] conversor = {"De Reais para Dólar","De Reais para Euro","De Reais para Libras Esterlinas","De Reais para Peso Argentino","De Reais para Peso Chileno","De Dólar para Real","De Euro para Real"};
			Object c = JOptionPane.showInputDialog(null,"Para qual moeda você deseja converter?","Topo",2,null,conversor,"");
			String valor = JOptionPane.showInputDialog(null,"Digite o valor a ser convertido?");
			boolean verifica = valor.matches("^[0-9]{1,}");
			if(verifica == true) {
				
				double valorRecebido = Double.parseDouble(valor);
				
				
				if(c.equals("De Reais para Dólar")) {
					
					moedas.converterReaisParaDolar(valorRecebido);
					
					
				}
				else if(c.equals("De Reais para Euro")) {
					
					moedas.converterReaisParaEuro(valorRecebido);
				}
				else if(c.equals("De Reais para Libras Esterlinas")) {
					moedas.converterReaisParaLibra(valorRecebido);
				}
				else if(c.equals("De Reais para Peso Argentino")) {
					moedas.converterReaisParaPesoArgentino(valorRecebido);
				}
				else if(c.equals("De Reais para Peso Chileno")) {
					moedas.converterReaisParaPesoChileno(valorRecebido);
				}
				else if(c.equals("De Dólar para Real")) {
					moedas.converterDolarParaReal(valorRecebido);
				}
				else if(c.equals("De Euro para Real")) {
					moedas.converterEuroParaReal(valorRecebido);
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Insira um valor válido para ser convertido");
				main.DesejaContinuar();
			}
			
			
		}
		
	
	
}

	


