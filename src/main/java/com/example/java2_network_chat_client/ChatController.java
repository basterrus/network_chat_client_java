package com.example.java2_network_chat_client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ChatController {
    @FXML
    private TextField messageArea;

    @FXML
    private ListView<String> messageList;

    @FXML
    private Button sendMessageBtn;

    @FXML
    private ListView<String> usersList;

    @FXML
    void sendMessage(ActionEvent event) {
        String dateFormating = new SimpleDateFormat("dd:MM:yy HH:mm:ss").format(new Date());

        usersList.getItems().add("testUSer");
        String message = messageArea.getText().trim();
        messageList.getItems().add(dateFormating + "  ---  " + message);
        messageArea.setText("");
    }

}


