package lesson7.W7;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(1,2);
        graph.addEdge(0,4);
        graph.addEdge(1,4);
        graph.addEdge(3,4);
        graph.addEdge(2,4);
        graph.addEdge(5,2);
        graph.addEdge(6,4);
        graph.addEdge(9,1);
        graph.addEdge(7,0);
        graph.addEdge(8,5);
        graph.addEdge(8,6);
        graph.addEdge(9,7);

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 3);
        System.out.println(bfp.hasPathTo(8));
        System.out.println(bfp.pathTo(8));
        System.out.println(bfp.pathTo(8).size());

    }
}
