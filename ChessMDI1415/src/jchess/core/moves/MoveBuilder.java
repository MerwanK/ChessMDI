package jchess.core.moves;

import jchess.core.Chessboard;
import jchess.core.Square;
import jchess.core.pieces.Piece;

/**
 * Created by Janthe on 13/05/2016.
 */
public class MoveBuilder {

    private Chessboard chessboard;
    private int xFrom;
    private int yFrom;
    private int xTo;
    private int yTo;

    public MoveBuilder(Chessboard chessboard){
        this.chessboard = chessboard;
    }

    public MoveBuilder xFrom(int x){
        xFrom = x;
        return this;
    }

    public MoveBuilder yFrom(int y){
        yFrom = y;
        return this;
    }

    public MoveBuilder xTo(int x){
        xTo = x;
        return this;
    }

    public MoveBuilder yTo(int y){
        yTo = y;
        return this;
    }

    public void move(){
        chessboard.move(xFrom,yFrom,xTo,yTo);
    }
}
