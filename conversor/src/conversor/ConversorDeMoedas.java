package conversor;

import javax.swing.JOptionPane;

public class ConversorDeMoedas {
	
	main Conversor = new main();
	
	public void converterReaisParaDolar(double valor) {
		double moedaDolar = valor / 5.23;
		moedaDolar = (double) Math.round(moedaDolar * 100) / 100;
		JOptionPane.showMessageDialog(null,valor + "reais equivale à $ " + moedaDolar + " dólares");
		Conversor.DesejaContinuar(); 
	}
	
	public void converterReaisParaEuro(double valor) {
		double moedaEuro = valor / 5.69;
		moedaEuro = (double) Math.round(moedaEuro * 100) / 100;
		JOptionPane.showMessageDialog(null, valor + "reais equivale à £ " + moedaEuro + " Euros");
		Conversor.DesejaContinuar();
	}
	public void converterReaisParaLibra(double valor) {
		double moedaLibra = valor / 6.43;
		moedaLibra = (double) Math.round(moedaLibra * 100) / 100;
		JOptionPane.showMessageDialog(null, valor + "reais equivale à " + moedaLibra + "Libras");
		Conversor.DesejaContinuar();
	}
	public void converterReaisParaPesoArgentino(double valor) {
		double moedaPArgentino = valor / 0.025;
		moedaPArgentino = (double) Math.round(moedaPArgentino * 100) / 100;
		JOptionPane.showMessageDialog(null, valor + "reais quivale à  " + moedaPArgentino + "Pesos Argentinos");
		Conversor.DesejaContinuar();
	}
	public void converterReaisParaPesoChileno(double valor) {
		double moedaPChileno = valor / 0.0065;
		moedaPChileno = (double) Math.round(moedaPChileno * 100) / 100;
		JOptionPane.showMessageDialog(null,valor +  "reais equivale à " + moedaPChileno + "Pesos Chilenos");
		Conversor.DesejaContinuar();
	}
	public void converterDolarParaReal(double valor) {
	 double	moedaReal = valor * 5.24;
		moedaReal = (double) Math.round(moedaReal * 100) / 100;
		JOptionPane.showMessageDialog(null, valor + "Dolares equivale à R$ " + moedaReal + " Reais");
		Conversor.DesejaContinuar();
	}
	public void converterEuroParaReal(double valor) {
		double moedaReal = valor * 5.69;
		moedaReal = (double) Math.round(moedaReal * 100) / 100;
		JOptionPane.showMessageDialog(null,valor +  "Euros equivale à R$ " + moedaReal + " Reais");
		Conversor.DesejaContinuar();
	}
	
}
