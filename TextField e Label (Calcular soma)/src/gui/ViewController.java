package gui;

import java.util.Locale;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController
{
	@FXML
	private TextField txtNumero1;
	@FXML
	private TextField txtNumero2;
	@FXML
	private Label labelResult;
	@FXML
	private Button btnSomar;

	@FXML
	public void onBtnSomarAction()
	{
		try
		{
			Locale.setDefault(Locale.US);

			double numero1 = Double.parseDouble(txtNumero1.getText());
			double numero2 = Double.parseDouble(txtNumero2.getText());

			labelResult.setText(String.format("%.2f", numero1 + numero2));
		}
		catch (NumberFormatException e)
		{
			Alerts.mostrarAlert("ERRO NA ENTRADA DOS VALORES", null, e.getMessage(), AlertType.ERROR);
		}
	}
}