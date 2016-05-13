package jchess.core.moves;

import jchess.core.Square;
import jchess.core.pieces.Piece;

/**
 * Created by Janthe on 13/05/2016.
 */
public class MoveBuilder {

    protected Square from;
    protected Square to;
    protected Piece movedPiece;
    protected Piece takenPiece;
    protected Piece promotedTo;
    protected boolean wasEnPassant;
    protected Castling castlingMove;

    public MoveBuilder(){

    }

    public MoveBuilder xFrom(int x){

        return this;
    }

    public MoveBuilder yFrom(int y){

        return this;
    }

    public MoveBuilder xTo(int x){

        return this;
    }

    public MoveBuilder yTo(int y){

        return this;
    }

    public void build(){
        Move move;
    }
}
