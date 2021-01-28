package color;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import Figures.GreenGuard;
import Figures.YellowGuard;
import Figures.YellowLead;
import Figures.GreenLead;
import color.GameTile;


public class GammeBoard extends JFrame implements MouseListener {

   public static final int TILE_SIDE_COUNT = 5;
    private Object [][] pieceCollection;
    private Object selectedPiece;

    public GammeBoard () {



        this.pieceCollection = new Object[TILE_SIDE_COUNT][TILE_SIDE_COUNT];

        // green guards placements
        this.pieceCollection[4][0] = (new GreenGuard(4,0));
        this.pieceCollection[4][1] = (new GreenGuard(4,1));
        this.pieceCollection[4][2] = (new GreenGuard(4,2));
        this.pieceCollection[4][3] = (new GreenGuard(4,3));


        //yellow guards placement
        this.pieceCollection[4][0] = (new YellowGuard(0,0));
        this.pieceCollection[4][1] = (new YellowGuard(0,1));
        this.pieceCollection[4][2] = (new YellowGuard(0,2));
        this.pieceCollection[4][3] = (new YellowGuard(0,3));

       //green lead placements
        this.pieceCollection[4][0]= (new GreenLead(4,0));

       // yellow lead placements
        this.pieceCollection[0][4]= (new YellowGuard(0,4));



        this.setSize(500, 500);
         this.setVisible(true);
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.addMouseListener(this);
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        int row = this.getBoardDimentionBasedOnCoordinates(e.getY());
        int col = this.getBoardDimentionBasedOnCoordinates(e.getX());
        // checking if a piece is selected
        if(this.selectedPiece != null) {
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


    @Override
    public void paint(Graphics g) {

        for (int row = 0; row <5; row++) {
            for(int col=0; col <5; col++) {

                GameTile tile = new GameTile(row,col);
                tile.render(g);
                renderGamePiece(g, row, col);

            }
        }
    }


    private Object getBoardPiece(int row, int col) {
        return this.pieceCollection[row][col];
    }

    private boolean hasBoardPiece(int row, int col) {
        return this.getBoardPiece(row, col) != null;
    }


    private void renderGamePiece(Graphics g, int row, int col) {

        if(hasBoardPiece(row, col)) {

            GreenGuard gg1 = (GreenGuard) this.getBoardPiece(row, col);
            gg1.render(g);
        }

        if(hasBoardPiece(row, col)) {
            YellowGuard yg1 = (YellowGuard) this.getBoardPiece(row, col);
            yg1.render(g);
        }
        if(hasBoardPiece(row, col)) {

            YellowLead yl1 = (YellowLead) this.getBoardPiece(row, col);
            yl1.render(g);
        }
        if(hasBoardPiece(row, col)) {

            GreenLead gl1 = (GreenLead) this.getBoardPiece(row, col);
            gl1.render(g);
        }
    }
    private int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / GameTile.TILE_SIZE;
    }

}
