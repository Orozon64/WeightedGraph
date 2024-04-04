import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();
    public static void main(String[] args) {
        Scanner myScn = new Scanner(System.in);
        System.out.println("Podaj id wierzchołka");
        int nodekey = Integer.parseInt(myScn.nextLine());
        GraphNode n1 = new GraphNode(nodekey);
        nodes.add(n1);
        Connect(n1);
    }
    public static void Connect(GraphNode con_node){
        Scanner myScn = new Scanner(System.in);
        boolean connector_exists = false;
        System.out.println("Podaj wagę połączenia");
        int edge_weight = Integer.parseInt(myScn.nextLine());
        System.out.println("Podaj id wierzchołka, z jakim chcesz połączyć ten wierzchołek.");
        int connector_id = Integer.parseInt(myScn.nextLine());
        for(GraphNode gn : nodes){
            if(gn.key == connector_id){
                GraphEdge myedge = new GraphEdge(edge_weight, gn);
                con_node.edges.add(myedge);
                GraphEdge con_edge = new GraphEdge(edge_weight, con_node);
                gn.edges.add(con_edge);
                connector_exists = true;
            }

        }
        if(!connector_exists){
            GraphNode con = new GraphNode(connector_id);
            nodes.add(con);
            GraphEdge myedge = new GraphEdge(edge_weight, con);
            con_node.edges.add(myedge);
            GraphEdge con_edge = new GraphEdge(edge_weight, con_node);
            con.edges.add(con_edge);
        }

    }
}
