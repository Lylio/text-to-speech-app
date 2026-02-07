module com.lylechristine.texttospeechgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires freetts;


    opens com.lylechristine.texttospeechgui to javafx.fxml;
    exports com.lylechristine.texttospeechgui;
}