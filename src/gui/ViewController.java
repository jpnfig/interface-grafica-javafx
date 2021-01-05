package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ViewController implements Initializable {
	
	@FXML
	private Button btTest;
	
	@FXML
	public void onBtTestAction() {
		System.out.println("Click!");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btTest.setText("Test");
	}
}

