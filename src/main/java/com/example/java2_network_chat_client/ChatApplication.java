package com.example.java2_network_chat_client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChatApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chatMainApp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("NETWORK CHAT v1.0");
        stage.setX(300);
        stage.setX(300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
