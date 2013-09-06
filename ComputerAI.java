import cs251.lab2.GomokuModel;
import cs251.lab2.GomokuModel.Square;


public class ComputerAI {
	private int[] moves = new int[2];
	private Square[][] board;
	private int ld, rd, d, r;

	private Player player;
	public ComputerAI() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	public ComputerAI(Square[][] b, Player p){
		board = b;
		player = p;
		findEmpty();
	}
	
	public void setBoard(Square [][] b){
		board = b;
		findEmpty();
	}
	
	public int[] getMove(){	
		return moves;
	}

	private void findEmpty(){
		for (int i = 0; i < GomokuModel.NUM_VSQUARES; i++) {
			for (int j = 0; j < GomokuModel.NUM_HSQUARES; j++) {
				if (board[i][j].toChar() == Square.EMPTY.toChar()) {
					moves[0] = i;
					moves[1] = j;
							
				}
				
			}
		}

	}
}
