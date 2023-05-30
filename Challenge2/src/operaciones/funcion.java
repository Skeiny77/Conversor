package operaciones;

import javax.swing.JOptionPane;

public class funcion {
	//ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos;
	
	ConvertirDivisas monedas = new ConvertirDivisas();

	public void ConvertirMonedas(double minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Selecciona la moneda a la que deseas convertir tu dinero", 
						"Monedas",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"De Pesos a Dolares", "De Pesos a Euros", "De Pesos a BolivarVnz",
						"De Pesos a Argentinos", "De Pesos a FrancoSuizo", "De Pesos a Dinar", "De Pesos a Corona", "De Pesos a Chelin", 
						"De Pesos a RealBrasileno", "De Pesos a Rupia"}, "seleccionar")).toString();
		
		switch(opcion) {
		case "De Pesos a Dolares" :
			monedas.ConvertirPesosDolares(minput);
			break;
			
		case "De Pesos a Euros" :
			monedas.ConvertirPesosEuros(minput);
			break;
		
		case "De Pesos a BolivarVnz" :
			monedas.ConvertirPesosBolivarVnz(minput);
			break;
			
		case "De Pesos a Argentinos" :
			monedas.ConvertirPesosArgentinos(minput);
			break;
			
		case "De Pesos a FrancoSuizo"  :
			monedas.ConvertirPesosFrancoSuizo(minput);
			break;
			
		case "De Pesos a Dinar" :
			monedas.ConvertirPesosDinar(minput);
			break;
			
		case "De Pesos a Corona" :
			monedas.ConvertirPesosCorona(minput);
			break;
		case "De Pesos a Chelin" :
			monedas.ConvertirPesosChelin(minput);
			break;
			
		case "De Pesos a RealBrasileno" :
			monedas.ConvertirPesosRealBrasileno(minput);
			break;
		}
		
	}

}
