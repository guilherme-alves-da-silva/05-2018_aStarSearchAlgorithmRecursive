package aStarSearchAlgorithmRecursion.foo4;

public class Edge{
	private int weight;
	private Node a;
	private Node b;

	public Edge(Node a, Node b, int weight){
		this.a=a;
		this.b=b;
		this.weight=weight;
	}
	public Node getNodeB(){
		b.setWeight(a.getWeight()+weight);
		b.setParent(a);

		return this.b;
	}
}
