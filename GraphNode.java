import java.util.ArrayList;
import java.util.Scanner;
public class GraphNode {
    int key;
    ArrayList<GraphEdge> edges = new ArrayList<GraphEdge>();
    public GraphNode(){
        Scanner myScn = new Scanner(System.in);
        System.out.println("Podaj id wierzchołka");
        key = Integer.parseInt(myScn.nextLine());
        System.out.println("Podaj wagę połączenia");
        int edge_weight = Integer.parseInt(myScn.nextLine());
        GraphEdge myedge = new GraphEdge(edge_weight, );
        edges.add(myedge);

    }
}
