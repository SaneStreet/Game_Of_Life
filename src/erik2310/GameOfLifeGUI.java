package erik2310;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameOfLifeGUI extends Application {

    // Laver et game objekt ved hjælp af Game.createGame metoden
    private Game game = Game.createGame();

    private static Pane pane = new Pane();

    @Override
    public void start(Stage primaryStage) {
        game.drawCells();
        Scene scene = new Scene(pane, 700, 700);
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
}
