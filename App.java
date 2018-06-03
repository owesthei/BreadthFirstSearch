public class App {
    public static void main(String[] args) {
        BreadthFirstSearch<Integer> bfs = new BreadthFirstSearch<>();

        Vertex<Integer> vertex1 = new Vertex<>(1);
        Vertex<Integer> vertex2 = new Vertex<>(2);
        Vertex<Integer> vertex3 = new Vertex<>(3);
        Vertex<Integer> vertex4 = new Vertex<>(4);
        Vertex<Integer> vertex5 = new Vertex<>(5);

        vertex1.addNeighbor(vertex2);
        vertex1.addNeighbor(vertex4);
        vertex2.addNeighbor(vertex3);
        vertex4.addNeighbor(vertex5);

        bfs.breadthFirstSearch(vertex1);
    }
}