package gui.util;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Alerts
{
	public static void mostrarAlert(String titulo, String cabecalho, String conteudo, AlertType tipo)
	{
		Alert alerta = new Alert(tipo);

		alerta.setTitle(titulo);
		alerta.setHeaderText(cabecalho);
		alerta.setContentText(conteudo);

		alerta.show();
	}
}