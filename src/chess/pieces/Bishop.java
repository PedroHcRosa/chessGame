package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece  {

	public Bishop(Board bord, Color color) {
		super(bord, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		//NorthWest
		p.setValues(position.getRow() - 1, position.getColumn() -1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()-1 , p.getColumn()-1);
			
		}
		
		if(getBoard().positionExists(p) &&  isThereOppenentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		//North East
		p.setValues(position.getRow() -1 , position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() - 1, p.getColumn()+1);
			
		}
		
		if(getBoard().positionExists(p) &&  isThereOppenentPiece(p)) {
			
			mat[p.getRow()][p.getColumn()] = true;
			
		}
		
		
		//South west
		p.setValues(position.getRow() +1 , position.getColumn() + 1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow()+1 , p.getColumn()+1);
					
		}
			
		if(getBoard().positionExists(p) &&  isThereOppenentPiece(p)) {
					
			mat[p.getRow()][p.getColumn()] = true;
					
		}
				
		//South East
		p.setValues(position.getRow() + 1, position.getColumn() -1);
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() + 1, p.getColumn()-1);
					
		}
				
		if(getBoard().positionExists(p) &&  isThereOppenentPiece(p)) {
					
			mat[p.getRow()][p.getColumn()] = true;
					
		}		
		
		
		return mat;
	}

	@Override
	public String toString() {
		
		return "B";
		
	}
}
