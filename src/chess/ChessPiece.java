package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece {
	
	private Color color;
	private int moveCount;

	public ChessPiece(Board bord, Color color) {
		super(bord);
		this.color = color;
	}

	public ChessPosition getChessPosition() {
		
		return ChessPosition.fromPosition(position);
		
	}
	
	
	public Color getColor() {
		return color;
	}

	public void increaseMoveCount() {
		
		moveCount++;
		
	}
	
	public void decreaseMoveCount() {
		
		moveCount--;
		
	}
	
	
	
	public int getMoveCount() {
		return moveCount;
	}

	

	protected boolean isThereOppenentPiece(Position position) {
		
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
		
	}
	
	
	

}
