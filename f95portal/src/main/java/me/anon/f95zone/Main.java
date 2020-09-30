package me.anon.f95zone;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import me.anon.f95zone.controllers.MainController;

public class Main extends Application
{
    public static final String VERSION = "1.0";
    public static final String AUTHOR = "Anon";
    
    public static Main instance;
    
    public Stage primaryStage;
    public MainController mainController;
    
    public static void main(String[] args)
    {
        launch(args);
    }
    
    public void start(Stage stage)
    {
        try
        {
            instance = this;
            primaryStage = stage;
            
            stage.initStyle(StageStyle.UNDECORATED);
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/Main.fxml"));
            Parent root = loader.load();
            mainController = loader.getController();
            
            Scene scene = new Scene(root); //TODO: set width & height
            
            stage.setTitle(String.format("f95portal v%s by %s -- f95zone.to", VERSION, AUTHOR));
        } catch (Exception ex) {
            ex.printStackTrace();
            System.exit(1);
        }
    }
}
