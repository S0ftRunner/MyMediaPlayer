module com.example.mymediaplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.mymediaplayer to javafx.fxml;
    exports com.example.mymediaplayer;
}