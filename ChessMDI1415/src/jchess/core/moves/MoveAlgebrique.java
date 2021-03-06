package jchess.core.moves;

import jchess.core.Chessboard;

/**
 * Created by Janthe on 13/05/2016.
 */
public class MoveAlgebrique {

    private Chessboard chessboard;
    private int xFrom;
    private int yFrom;
    private int xTo;
    private int yTo;

    private String horizontal = "abcdefgh";
    private String vertical = "87654321";

    public MoveAlgebrique(Chessboard chessboard){
        this.chessboard = chessboard;
    }

    public void from(String str){
        if(str.length() != 2){
            System.out.print("erreur de notation algébrique");
        }
        else {
            int index = horizontal.indexOf(str.getBytes()[0]);
            this.xFrom = index;
            index = vertical.indexOf(str.getBytes()[1]);
            this.yFrom = index;
        }
    }

    public void to(String str){
        if(str.length() != 2){
            System.out.print("erreur de notation algébrique" );
        }
        else {
            int index = horizontal.indexOf(str.getBytes()[0]);
            this.xTo = index;
            index = vertical.indexOf(str.getBytes()[1]);
            this.yTo = index;
        }
    }

    public void move(){
        chessboard.move(xFrom,yFrom,xTo,yTo);
    }

}
