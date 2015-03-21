package tti.hutfut.model;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private List<Integer> cellList;
	private String owner;
	private boolean active;

	public Board(){
		cellList = new ArrayList<>(9);
		owner = "NO_OWNER";
		active = false;
	}
	
	public void setOwner(String owner){
		this.owner = owner;
	}
	
	public void setActive(boolean active){
		this.active = active;
	}
	
	public void updateBoard(int player, int location){
		this.cellList.set(location, player);
	}
	
	public String getOwner(){
		return this.owner;
	}
	
	public boolean isActive(){
		return this.active;
	}
	
	public List<Integer> getBoard(){
		return this.cellList;
	}
	
	
}
	

