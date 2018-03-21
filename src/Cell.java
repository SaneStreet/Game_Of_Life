public class Cell {

    // Deklaration af datatyper
    private int livingNeighbours;
    private boolean alive;

    // Gætter til livingNeighbours
    public int getLivingNeighbours() {
        return livingNeighbours;
    }

    // Sætter til livingNeighbours
    public void setLivingNeighbours(int livingNeighbours) {
        this.livingNeighbours = livingNeighbours;
    }

    // Gætter til alive
    public boolean isAlive() {
        return alive;
    }

    // Sætter til alive
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    // Update metode her
}
