package Figures;
import java.awt.*;

public class YellowGuard {

    private int row;
    private int col;
    private String color;
    private int point;

    public YellowGuard(int i, int i1) {
    }

    public void YellowGuard(int row, int col) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    // checking if the move is valid
    public boolean MoveValidation (int moveRow, int moveCol) {

        int rowCoef = Math.abs(moveRow - this.row);
        int colCoef= moveCol - this.col;

        return  rowCoef == 1 &&
                colCoef == 0;
    }


    // attack
    public boolean isAttackValid(int attackRow, int attackCol) {

        return false;
    }

    // visualizing the yellow guard
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillRect(25, 25, 50, 50);
    }
}
