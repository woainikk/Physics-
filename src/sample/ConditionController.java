package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Маргарита on 05.12.2017.
 */
public class ConditionController {

    private Stage prStage;

    public void makeFirstProblem(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        prStage.setScene(new Scene(root));
        prStage.show();

       /* FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        Controller controllerFirst = loader.getController();
        controllerFirst.setPrStage(prStage);
        prStage.setTitle("Solving Problems");
        prStage.setScene(new Scene(root));
        prStage.show(); */
    }

    public void makeSecondProblem(MouseEvent mouseEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("secondSample.fxml"));
        prStage.setScene(new Scene(root));
        prStage.show();
    }

    public void setPrStage(Stage prStage) {
        this.prStage = prStage;
    }
}
