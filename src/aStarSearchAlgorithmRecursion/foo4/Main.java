package aStarSearchAlgorithmRecursion.foo4;

public class Main{
	public static void main(String[] args){
		Graph g=new Graph(new Node("feijo", 366));

		g.getOrigin().addEdge(new Node("tarauaca", 253), 140);
		//g.getOrigin().getEdges().getLast().getNodeB().addEdge(g.getOrigin(), 140);
		g.getOrigin().addEdge(new Node("jordao", 329), 118);
		//g.getOrigin().getEdges().getLast().getNodeB().addEdge(g.getOrigin(), 118);

		g.getOrigin().getEdges().get(0).getNodeB().addEdge(new Node("bujari", 176), 99);
		//g.getOrigin().getEdges().get(0).getNodeB().getEdges().getLast().getNodeB().addEdge(g.getOrigin().getEdges().get(0).getNodeB(), 99);
		g.getOrigin().getEdges().get(0).getNodeB().addEdge(new Node("acrelandia", 193), 80);
		//g.getOrigin().getEdges().get(0).getNodeB().getEdges().getLast().getNodeB().addEdge(g.getOrigin().getEdges().get(1).getNodeB(), 80);

		g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(0).getNodeB().addEdge(new Node("rio branco", 0), 211);
		//g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(0).getNodeB().getEdges().getLast().getNodeB().addEdge(g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(0).getNodeB(), 211);
		g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(1).getNodeB().addEdge(new Node("xapuri", 100), 97);
		//g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(1).getNodeB().getEdges().getLast().getNodeB().addEdge(g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(1).getNodeB(), 97);

		g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(1).getNodeB().getEdges().get(0).getNodeB().addEdge(new Node("rio branco", 0), 101);
		//g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(1).getNodeB().getEdges().get(0).getNodeB().getEdges().getLast().getNodeB().addEdge(g.getOrigin().getEdges().get(0).getNodeB().getEdges().get(1).getNodeB().getEdges().get(0).getNodeB(), 101);

		g.getOrigin().getEdges().get(1).getNodeB().addEdge(new Node("porto acre", 305), 111); //the h(x) is not present on the slide

		System.out.println("main: "+g.search("rio branco"));
	}
}
//appears to be working
//the nodeB on each edge is not having the connection with it's father, if i do it i would need to have a isAvailable() method that is set off when an edge is used, and so when doing searches for new edges with lowest cost, it wouldnt consider the edges that were in the path backwards, edges already used, and to ignore these edges the isAvailable() would be used to check.
