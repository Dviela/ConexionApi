package com.svalero.ConexionApi;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.application.Platform;

import java.util.List;

public class AppController {

    @FXML
    private ListView<String> postsListView;
    @FXML
    private ListView<String> usersListView;
    @FXML
    private Button fetchPostsButton;
    @FXML
    private Button fetchUsersButton;

    private MyApiService apiService = new MyApiService();

    @FXML
    public void initialize() {
        fetchPostsButton.setOnAction(event -> {
            new Thread(() -> {
                try {
                    List<String> posts = apiService.getBooks();

                    Platform.runLater(() -> {
                        postsListView.getItems().clear();
                        postsListView.getItems().addAll(posts);
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        });

        fetchUsersButton.setOnAction(event -> {
            new Thread(() -> {
                try {
                    List<String> users = apiService.getUsers();

                    Platform.runLater(() -> {
                        usersListView.getItems().clear();
                        usersListView.getItems().addAll(users);
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        });
    }
}
