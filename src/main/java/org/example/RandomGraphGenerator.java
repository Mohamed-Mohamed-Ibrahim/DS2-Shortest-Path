package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomGraphGenerator {

    public static void main(String[] args) {
        // Define parameters for the random graph
        int numVertices = 5; // Number of vertices
        int numEdges = 10; // Number of edges
        int maxWeight = 10; // Maximum edge weight

        // Generate random graph
        String graphFilePath = generateRandomGraph(numVertices, numEdges, maxWeight);

        // Test Dijkstra's algorithm and Bellman-Ford algorithm
        testAlgorithms(graphFilePath);
    }

    public static String generateRandomGraph(int numVertices, int numEdges, int maxWeight) {
        Random random = new Random();

        // Generate edges randomly
        StringBuilder graphContent = new StringBuilder();
        graphContent.append(numVertices).append(" ").append(numEdges).append("\n");

        for (int i = 0; i < numEdges; i++) {
            int source = random.nextInt(numVertices);
            int target = random.nextInt(numVertices);
            while (source == target) {
                target = random.nextInt(numVertices);
            }
            int weight = random.nextInt(2 * maxWeight + 1) - maxWeight; // Generate random weight [-maxWeight, maxWeight]
            graphContent.append(source).append(" ").append(target).append(" ").append(weight).append("\n");
        }

        // Write generated graph to a file
        String graphFilePath = "random_graph.txt";
        try {
            FileWriter writer = new FileWriter(graphFilePath);
            writer.write(graphContent.toString());
            writer.close();
            System.out.println("Random graph generated and saved to: " + graphFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return graphFilePath;
    }


    public static void testAlgorithms(String graphFilePath) {
        // Load the graph from file
        Graph graph = new Graph(graphFilePath);

        System.out.println("Graph:");
        ArrayList<int[]> edges = graph.getEdges();
        for (int[] edge : edges) {
            System.out.println(Arrays.toString(edge));
        }

        // Test Dijkstra's algorithm
        System.out.println("Testing Dijkstra's algorithm:");
        int sourceDijkstra = 0; // Source node for Dijkstra's algorithm
        int[] dijkstraCosts = new int[graph.size()];
        int[] dijkstraParents = new int[graph.size()];
        graph.dijkstra(sourceDijkstra, dijkstraCosts, dijkstraParents);
        printShortestPaths(sourceDijkstra, dijkstraCosts, dijkstraParents);

//        // Test Bellman-Ford algorithm
        System.out.println("\nTesting Bellman-Ford algorithm:");
        int sourceBellmanFord = 0; // Source node for Bellman-Ford algorithm
        int[] bellmanFordCosts = new int[graph.size()];
        int[] bellmanFordParents = new int[graph.size()];
        boolean noNegativeCycle = graph.bellmanFord(sourceBellmanFord, bellmanFordCosts, bellmanFordParents);
        if (noNegativeCycle) {
            printShortestPaths(sourceBellmanFord, bellmanFordCosts, bellmanFordParents);
        } else {
            System.out.println("Negative cycle detected!");
        }

        // Test Floyd-Warshall algorithm
        System.out.println("\nTesting Floyd-Warshall algorithm:");
        int[][] floydWarshallFordCosts = new int[graph.size()][graph.size()];
        int[][] floydWarshallPredecessors = new int[graph.size()][graph.size()];
        boolean noNegativeCycleFloyd = graph.floydWarshall(floydWarshallFordCosts, floydWarshallPredecessors);
        if (noNegativeCycleFloyd) {
            printPaths(floydWarshallFordCosts, floydWarshallPredecessors);
        } else {
            System.out.println("Negative cycle detected!");
        }
    }

    public static void printShortestPaths(int source, int[] costs, int[] parents) {
        System.out.println("Shortest paths from node " + source + ":");
        for (int i = 0; i < costs.length; i++) {
            if (i != source) {
                System.out.println("Node " + i + ": Cost=" + costs[i] + ", Path=" + getPath(source, i, parents));
            }
        }
    }

    public static String getPath(int source, int target, int[] parents) {
        StringBuilder path = new StringBuilder();
        int current = target;
        while (current != source) {
            path.insert(0, " -> "+current);
            current = parents[current];
            if (current == -1) {
                return "No path exists.";
            }
        }
        path.insert(0, source);
        return path.toString();
    }

    public static void printPaths(int[][] costs, int[][] parents) {
        int n = costs.length;

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(i == j)continue;
                if(costs[i][j] == Integer.MAX_VALUE){
                    System.out.println("From Node " + i + " To Node " + j + " There Is No Path");
                    continue;
                }
                System.out.println("From Node " + i + " To Node " + j + " The Cost = " + costs[i][j]);
                System.out.print("Path: " + i);
                printPath(i, j, parents);
                System.out.println(" " + j);
            }
        }
    }
    public static void printPath(int source, int target, int[][] parents) {
        if(parents[source][target] != -1){
            printPath(source, parents[source][target], parents);
            System.out.print(" " + parents[source][target]);
            printPath(parents[source][target], target, parents);
        }
    }

}

