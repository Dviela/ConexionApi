package com.svalero.ConexionApi;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.application.Platform;

public class AppController {

    @FXML
    private ListView<String> listView;
    @FXML
    private Button button;

    private MyApiService apiService = new MyApiService();

    @FXML
    public void initialize() {
        button.setOnAction(event -> {
            new Thread(() -> {
                try {
                    String posts = apiService.getPosts();
                    Platform.runLater(() -> listView.getItems().add(posts));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        });
    }
}
