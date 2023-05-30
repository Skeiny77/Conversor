package operaciones;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		funcion monedas = new funcion();
		
		boolean flag = true;
		while(flag) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion", "Menu",JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moneda"}, "seleccionar")).toString();
			
			switch(opciones) {
			case "Conversor de moneda":
				String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir: ");
				if (ValidarNumero(input)) {
					double Minput = Double.parseDouble(input);
					monedas.ConvertirMonedas(Minput);
					
					int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");
						
					}else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}	
						
					}else {
						JOptionPane.showMessageDialog(null, "Valor inválido");
					}
					
					break;
										
				}
			}
		}


	private static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if(x >= 0 || x < 0);{
				return true;
			}
		}catch (NumberFormatException e) {
			return false;
		}
		// TODO Auto-generated method stub
		
	}

}
