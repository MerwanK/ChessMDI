package jchess.core.visitor;

import jchess.core.Chessboard;
import jchess.core.Colors;
import jchess.core.pieces.Piece;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Janthe on 13/05/2016.
 */
public class VisitorNbPiece implements VisitorInterface {

    public VisitorNbPiece(){}

    public void visit(Chessboard chessboard) {
        ArrayList<Piece> piecesWhite = chessboard.getAllPieces(Colors.WHITE);
        ArrayList<Piece> piecesBlack = chessboard.getAllPieces(Colors.BLACK);
        ArrayList<String> tmpW = new ArrayList<String>();
        ArrayList<String> tmpB = new ArrayList<String>();

        Iterator<Piece> itWhite = piecesWhite.iterator();
        Iterator<Piece> itBlack = piecesBlack.iterator();

        while(itWhite.hasNext()){
            String symbol = itWhite.next().getSymbol();
            if(!tmpW.contains(symbol))
                tmpW.add(symbol);
        }

        while (itBlack.hasNext()){
            String symbol = itBlack.next().getSymbol();
            if(!tmpB.contains(symbol))
                tmpB.add(symbol);
        }

        System.out.println("score: White = " + tmpW.size() + ", Black = " + tmpB.size());
    }
}
