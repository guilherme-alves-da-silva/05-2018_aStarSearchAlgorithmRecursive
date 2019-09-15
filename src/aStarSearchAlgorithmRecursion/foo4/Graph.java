package aStarSearchAlgorithmRecursion.foo4;

import java.util.LinkedList;
import java.util.Collections;

public class Graph{
	private Node origin;
	private LinkedList<Node> accessed;
	private LinkedList<Node> visited;
	private LinkedList<Node> path;

	public Graph(Node origin){
		this.origin=origin;
	}
	public Node getOrigin(){
		return this.origin;
	}
	private LinkedList<Node> buildPath(Node current){
		path.push(current);

		if(current==origin) return path;
		else return buildPath(current.getParent());
	}
	private Node getNodeWithLowestCost(Node current){
		for(int i=0;i<current.getEdges().size();i++)
			accessed.add(current.getEdges().get(i).getNodeB());

		Collections.sort(accessed, new Node());
		//System.out.println(accessed);

		return accessed.poll();
	}
	public LinkedList<Node> search(String goal){
		accessed=new LinkedList<Node>();
		visited=new LinkedList<Node>();

		return search(origin, goal);
	}
	private LinkedList<Node> search(Node current, String goal){
		visited.add(current);
		//System.out.println(current);

		if(current.getValue().equals(goal)){
			path=new LinkedList<Node>();
			return buildPath(current);
		}
		else return search(getNodeWithLowestCost(current), goal);
	}
}
