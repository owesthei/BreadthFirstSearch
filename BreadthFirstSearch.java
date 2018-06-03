import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch<T> {
    public void breadthFirstSearch(Vertex<T> root) {
        Queue<Vertex<T>> queue = new LinkedList<>();

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex<T> vertex = queue.remove();
            System.out.println(vertex);

            for (Vertex<T> v : vertex.getNeighbors()) {
                if (!v.getVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}