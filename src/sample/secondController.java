package sample;

import javafx.beans.binding.DoubleBinding;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Маргарита on 04.12.2017.
 */
public class secondController implements Initializable {


    public Slider radiusSmall;
    public Slider radiusBig;
    public Slider raznostPotents;
    public Label chosenDistance;
    public Button secondCalculate;
    public Circle smallCircle;
    public Circle bigCircle;
    public Label secondAnswer;


    public void initialiseSmall() {
        smallCircle.radiusProperty().bind(radiusSmall.valueProperty().multiply(10));
    }

    public void initialiseBig() {
        bigCircle.radiusProperty().bind(radiusBig.valueProperty().multiply(10));
    }

    double distance;

    public void getDistance(MouseEvent mouseEvent) {
        double radius = ((Circle) mouseEvent.getSource()).getRadius();

        Point2D point = new Point2D(mouseEvent.getX(), mouseEvent.getY());
        distance = point.distance(Point2D.ZERO) / 9.5;
        chosenDistance.setText(String.format("%.2f", distance));

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initialiseSmall();
        initialiseBig();

    }

    public void makeCalculate(MouseEvent mouseEvent) {
        double U = raznostPotents.getValue();
        double r1 = radiusSmall.getValue() / 1000;
        double r2 = radiusBig.getValue() / 1000;
        double d = distance / 1000;
        double E = U / (d * Math.log(r2 / r1));
        secondAnswer.setText(String.format("%.2f", E));
    }

    public void backFromSecond(MouseEvent mouseEvent) {
    }
}

