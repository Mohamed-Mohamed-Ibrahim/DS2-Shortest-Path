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
    }

    public boolean bellmanFord(int source, int[] costs, int[] parents) {
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
