package erik2310;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class GameOfLifeGUI extends Application {

    // Laver et game objekt ved hjælp af Game.createGame metoden
    private Game game = Game.createGame();

    private static Pane pane = new Pane();

    private static Button button = new Button("Start");

    @Override
    public void start(Stage primaryStage) {
        game.drawCells();
        button.setLayoutX(25);
        button.setLayoutY(700);
        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                KeyFrame keyFrame = new KeyFrame(Duration.millis(1000), event1 -> game.buttonAction());
                Timeline timeline = new Timeline(keyFrame);
                timeline.setCycleCount(1000);
                timeline.play();
            }
        });
        pane.getChildren().add(button);
        Scene scene = new Scene(pane, 700, 740);
        primaryStage.setTitle("Game Of Life");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Pane getPane() {
        return pane;
    }

    public static Button getButton() {
        return button;
    }
}
