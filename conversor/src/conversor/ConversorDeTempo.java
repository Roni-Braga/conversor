package conversor;

import javax.swing.JOptionPane;

public class ConversorDeTempo {

		main Conversor = new main();
	public void ConverterSegundosEmMinutos(double valor) {
		double minutos = valor / 60;
		minutos = (double) Math.round(minutos * 100) / 100;
		JOptionPane.showMessageDialog(null,valor + " segundos equivale à " + minutos + " Minutos" );
		Conversor.DesejaContinuar();
		
	}
	public void ConverterMinutosEmHoras(double valor) {
	double hora = valor / 60;
	 hora = (double) Math.round(hora * 100) / 100;
	 JOptionPane.showMessageDialog(null, valor + " minutos equivale à  " + hora + " horas");
	 Conversor.DesejaContinuar();
	}
	public void ConverterHorasEmDias(double valor) {
		double dias = valor / 24;
		dias = (double) Math.round(dias * 100) / 100;
		JOptionPane.showMessageDialog(null, valor + " Horas equivale à " + dias + " dias");
		Conversor.DesejaContinuar();
	}

	

}
