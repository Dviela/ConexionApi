package com.svalero.ConexionApi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MyApiService {

    //private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";
    private DatabaseConnection databaseConnection = new DatabaseConnection();

    //Books
    public List<String> getBooks() {
        List<String> posts = new ArrayList<>();

        String query = "SELECT * FROM library.book";

        try (Connection connection = databaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                posts.add(resultSet.getString("title"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return posts;
    }

    //Users
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();

        String query = "SELECT * FROM library.user";

        try (Connection connection = databaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                users.add(resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;
    }
}

//    public String getPosts() throws Exception {
//        URL url = new URL(API_URL);
//        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//        conn.setRequestMethod("GET");
//
//        int responseCode = conn.getResponseCode();
//        if (responseCode == HttpURLConnection.HTTP_OK) {
//            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            String inputLine;
//            StringBuffer response = new StringBuffer();
//
//            while ((inputLine = in.readLine()) != null) {
//                response.append(inputLine);
//            }
//            in.close();
//
//            return response.toString();
//        } else {
//            throw new RuntimeException("Failed : HTTP error code : " + responseCode);
//        }
//    }

