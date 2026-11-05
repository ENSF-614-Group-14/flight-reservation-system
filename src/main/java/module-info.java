module com.flightreservation.flightreservationsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.flightreservation.flightreservationsystem to javafx.fxml;
    exports com.flightreservation.flightreservationsystem;
}