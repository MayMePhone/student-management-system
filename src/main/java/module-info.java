module com.example.studentmanagementtechnortal {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagementtechnortal to javafx.fxml;
    exports com.example.studentmanagementtechnortal;
}