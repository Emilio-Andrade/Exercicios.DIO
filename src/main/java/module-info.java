module com.example.primeirointelij {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.primeirointelij to javafx.fxml;
    exports com.example.primeirointelij;
}