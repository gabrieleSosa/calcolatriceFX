package com.example.esercitazionecalcolatricefx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CalcolatriceApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalcolatriceApplication.class.getResource("calcolatrice-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 367, 557);
        stage.getIcons().add(new Image("file:C:\\Users\\giuse\\Desktop\\gabriele\\informatica\\CalcolatriceFX\\src\\main\\resources\\images\\calculatrice_icon.png"));
        //scene.getStylesheets().addAll(Objects.requireNonNull(this.getClass().getResource("style.css")).toExternalForm());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}