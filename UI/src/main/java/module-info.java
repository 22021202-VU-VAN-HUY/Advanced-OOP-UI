module javaui.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens javaui.demo to javafx.fxml;
    exports javaui.demo;
}