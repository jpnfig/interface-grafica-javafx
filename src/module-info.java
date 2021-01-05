module javafx1 {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	
	opens application to javafx.graphics, javafx.controls, javafx.fxml;
	
}
