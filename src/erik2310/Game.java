package erik2310;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

import java.util.Random;

public class Game {

    // Definerer hvor stort vores array med celler skal være
    private final int BOARD_SIZE_X = 30, BOARD_SIZE_Y = 30;

    // 2 dimensionelt array med celler
    private Cell[][] cellsArray = new Cell[BOARD_SIZE_X][BOARD_SIZE_Y];

    // Laver levende og døde celler til arrayet når Game objektet bliver oprettet
    private Game() {

        for (int y = 0; y < BOARD_SIZE_Y; y++) {
            for (int x = 0; x < BOARD_SIZE_X; x++) {

                Random random = new Random();
                int randomNumber = random.nextInt(2);
                Cell cell = new Cell();

                if (randomNumber == 0) {
                    cell.setAlive(false);
                } else if (randomNumber == 1) {
                    cell.setAlive(true);
                }

                cellsArray[x][y] = cell;
            }
        }
    }

    // Metode der returnerer et Game objekt
    public static Game createGame() {
        Game game = new Game();
        return game;
    }

    // Metode der løber arrayet igennem og tegner cellerne
    public void drawCells() {
        for (int y = 0, yPosition = 25; y < BOARD_SIZE_Y; y++, yPosition = yPosition + 22) {
            for (int x = 0, xPosition = 25; x < BOARD_SIZE_X; x++, xPosition = xPosition + 22) {

                if (cellsArray[x][y].isAlive()) {
                    Rectangle rectangle = new Rectangle(20, 20, Color.BLUE);
                    rectangle.setX(xPosition);
                    rectangle.setY(yPosition);
                    rectangle.setStrokeType(StrokeType.INSIDE);
                    rectangle.setStroke(Color.BLACK);
                    rectangle.setStrokeWidth(2);
                    GameOfLifeGUI.getPane().getChildren().add(rectangle);
                }

                if (!cellsArray[x][y].isAlive()) {
                    Rectangle rectangle = new Rectangle(20, 20, Color.WHITE);
                    rectangle.setX(xPosition);
                    rectangle.setY(yPosition);
                    rectangle.setStrokeType(StrokeType.INSIDE);
                    rectangle.setStroke(Color.BLACK);
                    rectangle.setStrokeWidth(2);
                    GameOfLifeGUI.getPane().getChildren().add(rectangle);
                }

            }
        }

    }
}
