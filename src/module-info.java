module javafx1 {
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.controls;
	
	exports gui;    

    opens gui to javafx.fxml;
	opens application to javafx.graphics, javafx.controls, javafx.fxml;
	
}
