package color;

import color.Grey;

import java.awt.*;

public class GameTile {
    private  int row;
    private int col;
    private int tileSize;
    public static final int TILE_SIZE = 100;
    public GameTile(int row, int col ) {

        this.row = row;
        this.col=col;

    }
    // rendering the tiles
   public void render(Graphics g) {
        Grey g1 = new Grey(1,0);
        g1.render(g);

       Grey g2 = new Grey(1,1);
       g2.render(g);
       Grey g3 = new Grey(1,3);
       g3.render(g);
       Grey g4 = new Grey(1,4);
       g4.render(g);
       Grey g5 = new Grey(3,0);
       g5.render(g);
       Grey g6 = new Grey(3,1);
       g6.render(g);
       Grey g7 = new Grey(3,3);
       g7.render(g);
       Grey g8 = new Grey(3,4);
       g8.render(g);
       Orange o1 = new Orange(0,0);
       o1.render(g);
       Orange o2 = new Orange(0,4);
       o2.render(g);
       Orange o3 = new Orange(4,1);
       o3.render(g);
       Orange o4 = new Orange(4,3);
       o4.render(g);

       white w1 = new white(0,2);
       w1.render(g);
       white w2 = new white(1,2);
       w2.render(g);
       white w3 = new white(2,0);
       w3.render(g);
       white w4 = new white(2,1);
       w4.render(g);
       white w5 = new white(2,3);
       w5.render(g);
       white w6 = new white(2,4);
       w6.render(g);
       white w7 = new white(3,2);
       w7.render(g);
       white w8 = new white(4,2);
       w8.render(g);




       black b1 = new black(0,1);
       b1.render(g);
       black b2 = new black(0,3);
       b2.render(g);
       black b3 = new black(4,0);
       b3.render(g);
       black b4 = new black(4,4);
       b4.render(g);



       //int tileX = this.col * tileSize;
       //int tileY = this.row * tileSize;


       //g.setColor(Color.RED);
       //g.fillRect(tileX,tileY, this.tileSize,this.tileSize);
   }

}
