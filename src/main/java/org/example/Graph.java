package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Graph {
    private ArrayList<int[]> edges;
    int V, E;

    public Graph(String graphFile) {
        edges = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(graphFile));
            V = scanner.nextInt();
            E = scanner.nextInt();
            for (int i = 0; i < E; i++) {
                int[] edge = new int[3];
                edge[0] = scanner.nextInt(); // source
                edge[1] = scanner.nextInt(); // destination
                edge[2] = scanner.nextInt(); // weight
                edges.add(edge);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int size() {
        return V;
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

    public void floydWarshall(int[][] costsMatrix, int[][] predecessorsMatrix) {
        int n = costsMatrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    costsMatrix[i][j] = 0;
                } else {
                    costsMatrix[i][j] = Integer.MAX_VALUE;
                }
                predecessorsMatrix[i][j] = -1;
            }
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];
            costsMatrix[u][v] = weight;
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (costsMatrix[i][k] != Integer.MAX_VALUE &&
                            costsMatrix[k][j] != Integer.MAX_VALUE &&
                            costsMatrix[i][k] + costsMatrix[k][j] < costsMatrix[i][j]) {

                        costsMatrix[i][j] = costsMatrix[i][k] + costsMatrix[k][j];
                        predecessorsMatrix[i][j] = k;
                    }
                }
            }
        }
    }

}
