package de.normalisiert.utils.graphs;

//import java.util.HashSet;
//import java.util.Set;
import java.util.List;

public class SCCResult {
	//private Set nodeIDsOfSCC = null;
	private List[] adjList = null;
	private int lowestNodeId = -1;
	
	public SCCResult(List[] adjList, int lowestNodeId) {
		this.adjList = adjList;
		this.lowestNodeId = lowestNodeId;
		//this.nodeIDsOfSCC = new HashSet();
		/*
		//
		// All this just to create a Set we don't use
		//
		if (this.adjList != null) {
			for (int i = this.lowestNodeId; i < this.adjList.length; i++) {
				if (this.adjList[i].size() > 0) {
					this.nodeIDsOfSCC.add(Integer.valueOf(i));
				}
			}
		}
		*/
	}

	public List[] getAdjList() {
		return adjList;
	}

	public int getLowestNodeId() {
		return lowestNodeId;
	}
}
