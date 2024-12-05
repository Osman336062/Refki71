package com.example.sep1.view;

import com.example.sep1.viewmodel.MainViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class MainController
{
  @FXML private Label welcomeText;
  @FXML private TextField nameTextField, birthdayTextField;
  @FXML private BorderPane mainBorderPane;

  private MainViewModel mainViewModel;
  private ViewHandler viewHandler;

  public MainController(ViewHandler viewHandler)
  {
    this.viewHandler = viewHandler;
  }

  @FXML
  public void initialize()
  {
    mainViewModel = new MainViewModel();
  }
  @FXML protected void onAddAnimalForSaleClick()
  {
    mainViewModel.addAnimalForSale(nameTextField.getText(), birthdayTextField.getText());
  }

  @FXML protected void onOpenView() throws IOException
  {
    viewHandler.switchView("hello-view.fxml");
    System.out.println("hi");
  }
}