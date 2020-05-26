package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewControler
{
	@FXML
	private Button btn;

	@FXML
	public void onBtnAction()
	{
		System.out.println("Click");
	}
}