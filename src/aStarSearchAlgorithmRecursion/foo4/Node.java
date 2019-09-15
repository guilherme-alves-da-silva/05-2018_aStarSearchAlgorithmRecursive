package aStarSearchAlgorithmRecursion.foo4;

import java.util.LinkedList;
import java.util.Comparator;

public class Node implements Comparator<Node>{
	private LinkedList<Edge> edges;
	private String value;
	private int weight; //weight until here
	private int heuristic;
	private Node parent; //current parent

	public Node(){}
	public Node(String value, int heuristic){
		this.value=value;
		this.heuristic=heuristic;
		edges=new LinkedList<Edge>();
	}
	public LinkedList<Edge> getEdges(){
		return this.edges;
	}
	public void addEdge(Node node, int individualWeight){
		edges.add(new Edge(this, node, individualWeight));
	}
	public String getValue(){
		return this.value;
	}
	public Integer getWeight(){
		return this.weight;
	}
	public void setWeight(int value){
		this.weight=value;
	}
	public Integer getF(){
		return weight+heuristic;
	}
	public Node getParent(){
		return this.parent;
	}
	public void setParent(Node parent){
		this.parent=parent;
	}
	@Override
	public int compare(Node a, Node b){
		return a.getF().compareTo(b.getF());
	}
	public String toString(){
		return value+"~"+Integer.toString(weight+heuristic);
	}
}
