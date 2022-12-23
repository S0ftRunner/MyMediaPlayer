module com.example.mymediaplayer {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mymediaplayer to javafx.fxml;
    exports com.example.mymediaplayer;
}