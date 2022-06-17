module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.brief8 to javafx.fxml;
    exports org.brief8;
}
