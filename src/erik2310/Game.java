package erik2310;

import java.util.Random;

public class Game {

    // Definerer hvor stort vores array med celler skal være
    private final int BOARD_SIZE_X = 10, BOARD_SIZE_Y = 10;

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
}
