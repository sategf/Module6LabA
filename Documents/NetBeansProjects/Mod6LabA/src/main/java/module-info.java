module com.gili.mod6laba {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.gili.mod6laba to javafx.fxml;
    exports com.gili.mod6laba;
}
