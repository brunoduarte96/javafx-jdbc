module javafx.jdbc {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;


    opens application to javafx.fxml;
    exports application;
    exports gui;
    opens gui to javafx.fxml;

}