package org.example;

import java.util.ArrayList;

public class Graph {
    private ArrayList<int[]> edges;
    int V, E;

    public Graph() {
        edges = new ArrayList<>();
    }
    public Graph(int V, int E) {
        edges = new ArrayList<>();
        this.V = V;
        this.E = E;
    }

    public void addEdge(int source, int target, int weight) {
        int[] edge = {source, target, weight};
        edges.add(edge);
    }

    public ArrayList<int[]> getEdges() {
        return edges;
    }

    public void dijkstra(int source, int[] costs, int[] parents) {
        Arrays.fill(costs, Integer.MAX_VALUE);
        Arrays.fill(parents, -1);
        costs[source] = 0;

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V - 1; i++) {
            int minCost = Integer.MAX_VALUE;
            int minNode = -1;

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];

                if (!visited[u] && costs[u] < minCost) {
                    minCost = costs[u];
                    minNode = u;
                }
            }

            visited[minNode] = true;

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];

                if (!visited[v] && u == minNode && costs[u] + weight < costs[v]) {
                    costs[v] = costs[u] + weight;
                    parents[v] = u;
                }
            }
        }
    }

    public boolean bellmanFord(int source, int[] costs, int[] parents) {
        Arrays.fill(costs, Integer.MAX_VALUE);
        Arrays.fill(parents, -1);
        costs[source] = 0;

        for (int i = 0; i < V - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int weight = edge[2];

                if (costs[u] != Integer.MAX_VALUE && costs[u] + weight < costs[v]) {
                    costs[v] = costs[u] + weight;
                    parents[v] = u;
                }
            }
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (costs[u] != Integer.MAX_VALUE && costs[u] + weight < costs[v]) {
                return false; // Negative cycle found
            }
        }

        return true;
    }

    public boolean floydWarshall(int[][] costsMatrix, int[][] predecessorsMatrix) {
        return true;
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 0, 2);

        ArrayList<int[]> allEdges = graph.getEdges();
        for (int[] edge : allEdges) {
            System.out.println("Source: " + edge[0] + ", Target: " + edge[1] + ", Weight: " + edge[2]);
        }

        int weight = graph.getWeight(1, 2);
        System.out.println("Weight between nodes 1 and 2: " + weight);
    }
}
