package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewControler
{
	@FXML
	private Button btn;

	@FXML
	public void onBtnAction()
	{
		Alerts.mostrarAlert("Titulo do alert", null, "Conteúdo do alert", AlertType.ERROR);
	}
}