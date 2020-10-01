package me.anon.f95zone.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

public class MainController
{
    @FXML protected Pane logoPane;
    @FXML protected TabPane tabPane;
    @FXML protected Button btnClose;
    
    @FXML protected void btnCloseAction(ActionEvent event)
    {
        System.exit(0);
    }
}
