package javafxplayground;/**
 * Created on 22.05.17.
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Playground extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Group root = new Group();
        Line seesaw = new Line(60, 340, 340, 140);
        seesaw.setStrokeWidth(5);

        Circle cir = new Circle(70, 280, 40);
        cir.setStroke(Color.RED);
        cir.setStrokeWidth(5);
        cir.setFill(Color.ORANGE);

        Circle sun = new Circle(-50, -50, 140);


        Rectangle rec = new Rectangle(240, 90, 80, 70);
        rec.setStroke(Color.GREEN);
        rec.setStrokeWidth(5);
        rec.setFill(Color.YELLOWGREEN);

        Line left = new Line(200, 240, 160, 340);
        left.setStrokeWidth(5);
        Line right = new Line(200, 240, 240, 340);
        right.setStrokeWidth(5);

        root.getChildren().addAll(seesaw, cir, rec, left, right);


        Scene scene = new Scene(root, 400, 400, Color.SKYBLUE);
        primaryStage.setTitle("Playground");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
