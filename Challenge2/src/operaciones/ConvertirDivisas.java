package operaciones;

import javax.swing.JOptionPane;

public class ConvertirDivisas {
	
	public void ConvertirPesosDolares(double valor) {
		double divisaDolar = valor / 4750.23;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "dolares" );
	}
	
	public void ConvertirPesosEuros(double valor) {
		double divisaDolar = valor / 5121.94;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "Euros" );
	}
	
	public void ConvertirPesosBolivarVnz(double valor) {
		double divisaDolar = valor / 197.14;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "bolivares" );
	}
	
	public void ConvertirPesosArgentinos(double valor) {
		double divisaDolar = valor / 23.14;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "pesos argentinos" );
	}
	
	public void ConvertirPesosFrancoSuizo(double valor) {
		double divisaDolar = valor / 5162.76;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "francos suizos" );
	}
	
	public void ConvertirPesosDinar(double valor) {
		double divisaDolar = valor / 3.26;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "dinares" );
	}
	
	public void ConvertirPesosCorona(double valor) {
		double divisaDolar = valor / 445.75;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "coronas" );
	}
	
	public void ConvertirPesosChelin(double valor) {
		double divisaDolar = valor / 1.26;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "chelines" );
	}
	
	public void ConvertirPesosRealBrasileno(double valor) {
		double divisaDolar = valor / 905.39;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "reales" );
	}
	
	public void ConvertirPesosRupia(double valor) {
		double divisaDolar = valor / 4750.23;
		divisaDolar =(double) Math.round(divisaDolar *100d)/100;
		JOptionPane.showMessageDialog(null,"Tienes $" +divisaDolar+ "rupias" );
	}

}
