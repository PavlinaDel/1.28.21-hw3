package Figures;

import java.awt.*;

public class YellowLead {
    private int row;
    private int col;
    private String color;

    public void YellownGuard(int row, int col) {
        this.row = row;
        this.col = col;
        this.color = color;
    }

    // checking if the movement is valid
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

    // visualizing the yellow lead
    public void render(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(25, 25, 50, 50);
    }
}