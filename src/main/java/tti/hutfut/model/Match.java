package tti.hutfut.model;

import java.util.ArrayList;
import java.util.List;

public class Match {
	
	private int currentPlayer;
	private boolean gameOver;
	private List<Board> parentBoard;
	private List<Integer> boardOwners;
	private int gameID;

	public Match (){
		currentPlayer = 1;
		gameOver = false;
		parentBoard = new ArrayList<>(9);
		
		for(int i = 0; i < 9; i++){
			parentBoard.set(i, new Board());
		}
		
	}
	
	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}

	public List<Board> getParentBoard() {
		return parentBoard;
	}

	public void setParentBoard(List<Board> parentBoard) {
		this.parentBoard = parentBoard;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}
	
	public List<Integer> getBoardOwners() {
		return boardOwners;
	}

	public void setBoardOwners(List<Integer> boardOwners) {
		this.boardOwners = boardOwners;
	}
	
	public int getGameID() {
		return gameID;
	}

	public void setGameID(int gameID) {
		this.gameID = gameID;
	}
	
	
	

}
