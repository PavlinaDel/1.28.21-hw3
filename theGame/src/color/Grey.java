package color;

import java.awt.*;

public class Grey {
    private int row;
    private int col;
    private int Size;

    public  Grey(int row, int col) {
        this.row =row;
        this.col =col;
        this.Size=100;



        }
    public void render (Graphics g){
        int tileX = this.col * this.Size;
        int tileY = this.row * this.Size;

        g.setColor(Color.GRAY);
        g.fillRect(tileX,tileY,this.Size,this.Size);
        g.setColor(Color.BLACK);
        g.drawRect(tileX,tileY,this.Size,this.Size);
    }
}