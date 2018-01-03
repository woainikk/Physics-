package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage = primaryStage;
        FXMLLoader loader = new FXMLLoader(getClass().getResource("conditions.fxml"));
        Parent root = loader.load();
        ConditionController controller = loader.getController();
        controller.setPrStage(primaryStage);
        primaryStage.setTitle("Условия задач");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }


}
