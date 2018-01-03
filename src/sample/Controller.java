package sample;

import javafx.fxml.Initializable;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable{


    public Label answer;
    public Slider plotnostZaryada;
    public Slider dielectrPronits;
  public ImageView f1ToSee;
  public ImageView f2ToSee;
  public ImageView f3ToSee;
  public Label textToSee;
  public TextField d1;
  public TextField d2;

  double plotnost;
    double pronits;


    double firstDistance;

    double secondDistance;

    private Stage prStage;

    private Scene lastScene;

   /* public void circleClicked(MouseEvent mouseEvent) {
        double radius = ((Circle) mouseEvent.getSource()).getRadius();
        if (numberOfClick == 1) {
            Point2D point = new Point2D(mouseEvent.getX(), mouseEvent.getY() );
            firstDistance =  point.distance( Point2D.ZERO)/(radius/102);
            firstDistLabel.setText(String.format( "%.2f", firstDistance));
            numberOfClick ++;
            return;
        }

        if (numberOfClick == 2) {
            Point2D point = new Point2D(mouseEvent.getX(), mouseEvent.getY() );
            secondDistance =  point.distance( Point2D.ZERO)/(radius/102);
            secondDistLabel.setText(String.format( "%.2f", secondDistance));
            numberOfClick = 1;

        }
    } */

    public void calculating(MouseEvent mouseEvent) {
        plotnost = plotnostZaryada.getValue();
        pronits = dielectrPronits.getValue();
        firstDistance = Double.parseDouble(d1.getText());
        secondDistance = Double.parseDouble(d2.getText());
        textToSee.setVisible(true);
        f1ToSee.setVisible(true);
        f2ToSee.setVisible(true);
        f3ToSee.setVisible(true);
        double min = Math.min(firstDistance , secondDistance);
        if ( min == firstDistance ) {
            double k = -((plotnost * 10000) / (8 * 8.85 * pronits)) * ((firstDistance * firstDistance) / 10000 - (secondDistance * secondDistance) / 10000);
            answer.setText(String.format("%.2f", k));
        }
        else {
            double k = ((plotnost * 10000) / (8 * 8.85 * pronits)) * ((firstDistance * firstDistance) / 10000 - (secondDistance * secondDistance) / 10000);
            answer.setText(String.format("%.2f", k));
        }

    }

    public void backFromFirst(MouseEvent mouseEvent) throws Exception{

       // prStage.setScene(lastScene);


    }

    public void setPrStage(Stage prStage) {
        this.prStage = prStage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //lastScene = prStage.getScene();
    }
}