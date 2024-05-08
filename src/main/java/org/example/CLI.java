package org.example;

import org.example.Graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CLI {
    private static Graph graph;
    private static Scanner scanner = new Scanner(System.in);
    private static int[] dijkstraCosts;
    private static int[] dijkstraParents;
    private static int[] bellmanFordCosts;
    private static int[] bellmanFordParents;
    private static int[][] floydWarshallCosts;
    private static int[][] floydWarshallPredecessors;
    private static boolean shortestPathsComputed = false;

    public static void main(String[] args) {
        String graphFile;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the path of the graph file: ");
        graphFile = scanner.nextLine();

        graph = new Graph(graphFile);

        boolean exit = false;
        while (!exit) {
            printMainMenu();
            int choice = getChoice(0, 3);
            switch (choice) {
                case 1:
                    shortestPathsSubMenu();
                    break;
                case 2:
                    shortestPathsBetweenAllPairsSubMenu();
                    break;
                case 3:
                    checkNegativeCycle();
                    break;
                case 0:
                    exit = true;
                    break;
            }
        }
        scanner.close();
    }

    private static void printMainMenu() {
        System.out.println("\nMain Menu:");
        System.out.println("1. Find shortest paths from a source node to all other nodes");
        System.out.println("2. Find shortest paths between all pairs of nodes");
        System.out.println("3. Check if the graph contains a negative cycle");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void shortestPathsSubMenu() {
        System.out.print("\nEnter source node: ");
        int source = scanner.nextInt();

        if (!shortestPathsComputed) {
            getNewStaff();
            shortestPathsComputed = true;
        }

        System.out.println("\nChoose an algorithm:");
        System.out.println("1. Dijkstra's algorithm");
        System.out.println("2. Bellman-Ford algorithm");
        System.out.println("3. Floyd-Warshall algorithm");
        int algorithmChoice = getChoice(1, 3);

        switch (algorithmChoice) {
            case 1:
                graph.dijkstra(source, dijkstraCosts, dijkstraParents);
                shortestPathsOperation(source, dijkstraCosts, dijkstraParents);
                break;
            case 2:
                boolean noNegativeCycle = graph.bellmanFord(source, bellmanFordCosts, bellmanFordParents);
                if (noNegativeCycle) {
                    shortestPathsOperation(source, bellmanFordCosts, bellmanFordParents);
                } else {
                    System.out.println("Negative cycle detected!");
                }
                break;
            case 3:
                boolean success = graph.floydWarshall(floydWarshallCosts, floydWarshallPredecessors);
                if (success) {
                    shortestPathsOperationFloyd(source);
                } else {
                    System.out.println("Negative cycle detected!");
                }
                break;
        }
    }

    private static void shortestPathsBetweenAllPairsSubMenu() {
        if (!shortestPathsComputed) {
            getNewStaff();
            shortestPathsComputed = true;
        }

        System.out.println("\nChoose an algorithm:");
        System.out.println("1. Dijkstra's algorithm");
        System.out.println("2. Bellman-Ford algorithm");
        System.out.println("3. Floyd-Warshall algorithm");
        int algorithmChoice = getChoice(1, 3);

        int[][] costs = new int[graph.size()][graph.size()];
        int[][] parents = new int[graph.size()][graph.size()];

        switch (algorithmChoice) {
            case 1:
                for (int source = 0; source < graph.size(); source++) {
                    graph.dijkstra(source, costs[source], parents[source]);
                }
                shortestPathsOperationBetweenAllPairs(costs, parents);
                break;
            case 2:
                boolean noNegativeCycle = true;
                for (int source = 0; source < graph.size(); source++) {
                     noNegativeCycle = noNegativeCycle &&  graph.bellmanFord(source, costs[source],parents[source]);

                }
                if (noNegativeCycle) {
                    shortestPathsOperationBetweenAllPairs(costs, parents);
                } else {
                    System.out.println("Negative cycle detected!");
                }
                break;
            case 3:
                boolean noNegativeCycle2 = graph.floydWarshall(floydWarshallCosts, floydWarshallPredecessors);
                if (noNegativeCycle2) {
                    shortestPathsOperationBetweenAllPairsFloyd();
                } else {
                    System.out.println("Negative cycle detected!");
                }
                break;
        }
    }

    private static void getNewStaff() {
        dijkstraCosts = new int[graph.size()];
        dijkstraParents = new int[graph.size()];
        bellmanFordCosts = new int[graph.size()];
        bellmanFordParents = new int[graph.size()];
        floydWarshallCosts = new int[graph.size()][graph.size()];
        floydWarshallPredecessors = new int[graph.size()][graph.size()];
    }

    private static void shortestPathsOperation(int source, int[] costs, int[] parents) {
        while (true) {
            System.out.println("\nShortest paths from node " + source + ":");

            System.out.print("Enter target node (-1 to return to main menu): ");
            int target = scanner.nextInt();
            if (target == -1) {
                break;
            }
            if (target < 0 || target >= graph.size() || target == source) {
                System.out.println("Invalid target node!");
                continue;
            }
            System.out.println("Cost of path from node " + source + " to node " + target + ": " + costs[target]);
            System.out.println("Path from node " + source + " to node " + target + ": " + getPath(source, target, parents));
        }
    }

    private static void shortestPathsOperationFloyd(int source) {
        while (true) {
            System.out.print("Enter target node: ");
            int target = scanner.nextInt();
            if (source < 0 || source >= graph.size() || target < 0 || target >= graph.size()) {
                System.out.println("Invalid source or target node!");
                continue;
            }
            System.out.println("Cost of path from node " + source + " to node " + target + ": " + floydWarshallCosts[source][target]);

            int current = target;
            StringBuilder path = new StringBuilder();
            while (current != source){
                path.insert(0, " -> "+current);
                current = floydWarshallPredecessors[source][current];
                if( current == -1 ){
//                    System.out.println("No such path.");
//                    return;
                    break;
                }
            }
            path.insert(0,source);
            System.out.println("Shortest path from node " + source + " to node " + target + ":");
            System.out.println(path.toString());

            System.out.print("-1 to return to main menu: ");
            if (scanner.nextInt() == -1) {
                break;
            }
        }
    }

    private static void shortestPathsOperationBetweenAllPairsFloyd() {
        while (true) {
            System.out.print("\nEnter source node: ");
            int source = scanner.nextInt();
            System.out.print("Enter target node: ");
            int target = scanner.nextInt();
            if (source < 0 || source >= graph.size() || target < 0 || target >= graph.size()) {
                System.out.println("Invalid source or target node!");
                continue;
            }
            System.out.println("Cost of path from node " + source + " to node " + target + ": " + floydWarshallCosts[source][target]);

            int current = target;
            StringBuilder path = new StringBuilder();
            while (current != source){
                path.insert(0, " -> "+current);
                current = floydWarshallPredecessors[source][current];
                if( current == -1 ){
                    System.out.println("No such path.");
                    return;
                }
            }
            path.insert(0,source);
            System.out.println("Shortest path from node " + source + " to node " + target + ":");
            System.out.println(path.toString());

            System.out.print("-1 to return to main menu: ");
            if (scanner.nextInt() == -1) {
                break;
            }
        }
    }


    private static void shortestPathsOperationBetweenAllPairs(int[][] costs, int[][] parents) {
        while (true) {
            System.out.print("\nEnter source node: ");
            int source = scanner.nextInt();
            System.out.print("Enter target node: ");
            int target = scanner.nextInt();
            if (source < 0 || source >= graph.size() || target < 0 || target >= graph.size()) {
                System.out.println("Invalid source or target node!");
                continue;
            }
            System.out.println("Cost of path from node " + source + " to node " + target + ": " + costs[source][target]);
            System.out.println("Path from node " + source + " to node " + target + ": " + getPath(source, target, parents[source]));

            System.out.print("Enter -1 to return: ");
            if (scanner.nextInt() == -1) {
                break;
            }
        }
    }

    private static String getPath(int source, int target, int[] parents) {
        StringBuilder path = new StringBuilder();
        int current = target;
        while (current != source) {
            path.insert(0, " -> " + current);
            current = parents[current];
            if (current == -1) {
                return "No path exists.";
            }
        }
        path.insert(0, source);
        return path.toString();
    }

    private static void checkNegativeCycle() {
        System.out.println("\nChoose an algorithm:");
        System.out.println("1. Bellman-Ford algorithm");
        System.out.println("2. Floyd-Warshall algorithm");
        int algorithmChoice = getChoice(1, 2);

        if (!shortestPathsComputed) {
            getNewStaff();
            shortestPathsComputed = true;
        }

        boolean hasNegativeCycle = false;

        switch (algorithmChoice) {
            case 1:
                hasNegativeCycle = !graph.bellmanFord(0, bellmanFordCosts, bellmanFordParents);
                break;
            case 2:
                hasNegativeCycle = !graph.floydWarshall(floydWarshallCosts, floydWarshallPredecessors);
                break;
        }

        if (hasNegativeCycle) {
            System.out.println("\nThe graph contains a negative cycle.");
        } else {
            System.out.println("\nThe graph does not contain a negative cycle.");
        }
    }

    private static int getChoice(int min, int max) {
        int choice;
        while (true) {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            if (choice >= min && choice <= max) {
                break;
            }
            System.out.println("Invalid choice! Please enter a number between " + min + " and " + max + ".");
        }
        return choice;
    }
}
