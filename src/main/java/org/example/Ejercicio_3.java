package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio_3 extends Application {

    @Override
    public void start(Stage stage) {

        Button btn = new Button("Haz clic aquí");

        // Cada vez que se pulsa alterna entre dos mensajes
        btn.setOnAction(event -> {
            if (btn.getText().equals("Haz clic aquí")) {
                btn.setText("Se ha pulsado el boton");
            } else {
                btn.setText("Haz clic aquí");
            }
        });

        VBox layout = new VBox(btn);
        Scene scene = new Scene(layout, 250, 100);
        stage.setTitle("Ejercicio 3");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}