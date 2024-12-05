package com.example.sep1;


import com.example.sep1.view.ViewHandler;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
  @Override public void start(Stage stage) throws IOException
  {
    ViewHandler viewHandler = new ViewHandler(stage);
    viewHandler.start();
  }

  public static void main(String[] args)
  {
    launch();
  }
}