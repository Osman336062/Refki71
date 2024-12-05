package com.example.sep1.view;

import com.example.sep1.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ViewHandler
{
  private Map<String, Parent> views;
  private BorderPane borderPane;
  private Stage stage;

  public ViewHandler(Stage stage)
  {
    this.stage = stage;
    views = new HashMap<>();
  }

  public void start() throws IOException
  {
    FXMLLoader fxmlLoader = new FXMLLoader(
        getClass().getResource("/com/example/sep1/views/LoginView.fxml"));
    borderPane = fxmlLoader.load();
    MainController controller = fxmlLoader.getController();
    Scene scene = new Scene((Parent) borderPane, 320, 240);
    stage.setTitle("Hello!");
    stage.setScene(scene);
    stage.show();
    views.put("LoginView.fxml", (Parent) borderPane.getCenter());
  }

  public void switchView(String fxmlPath) throws IOException
  {
    if (!views.containsKey(fxmlPath))
    {
      FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/sep1/views/" + fxmlPath));
      Parent view = loader.load();
      views.put(fxmlPath, view);
    }

    borderPane.setCenter(views.get(fxmlPath));
  }
}
