package tti.hutfut.model;

public class Board {
	
	private String owner;
	private boolean active;
    private int moveCount;
    private enum State{Blank, X, O};
    private int boardSize = 3;

    State[][] board = new State[boardSize][boardSize];
    
	public Board(){
		owner = "NO_OWNER";
		active = false;
	}

    void Move(int x, int y, State s){
    	if(board[x][y] == State.Blank){
    		board[x][y] = s;
    	}
    	moveCount++;

    	//check end conditions

    	//check col
    	for(int i = 0; i < boardSize; i++){
    		if(board[x][i] != s)
    			break;
    		if(i == boardSize-1){
    			//report win for s
    		}
    	}

    	//check row
    	for(int i = 0; i < boardSize; i++){
    		if(board[i][y] != s)
    			break;
    		if(i == boardSize-1){
    			//report win for s
    		}
    	}

    	//check diag
    	if(x == y){
    		//we're on a diagonal
    		for(int i = 0; i < boardSize; i++){
    			if(board[i][i] != s)
    				break;
    			if(i == boardSize-1){
    				//report win for s
    			}
    		}
    	}

            //check anti diag
    	for(int i = 0;i<boardSize;i++){
    		if(board[i][(boardSize-1)-i] != s)
    			break;
    		if(i == boardSize-1){
    			//report win for s
    		}
    	}

    	//check draw
    	if(moveCount == (boardSize^2 - 1)){
    		//report draw
    	}
    }
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public void setActive(boolean active){
		this.active = active;
	}
	
	public String getOwner(){
		return this.owner;
	}
	
	public boolean isActive(){
		return this.active;
	}
	
	
}
	

