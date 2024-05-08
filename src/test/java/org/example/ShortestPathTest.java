package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShortestPathTest {

    @Test
    public void Graph_of_Size_10_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 1.txt");
        int[] solution = new int[10] ;
        int[] parents  = new int[10] ;

        long startTime = System.nanoTime();

        graph.dijkstra(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Dijkstra size (10) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 3, 3, 5, 1, 2, 5, 2, 1, 3};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_10_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 1.txt");
        int[] solution = new int[10] ;
        int[] parents  = new int[10] ;

        long startTime = System.nanoTime();

        graph.bellmanFord(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Bellman Ford size (10) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 3, 3, 5, 1, 2, 5, 2, 1, 3};
        assertArrayEquals(cost, solution);

    }

    @Test
    public void Graph_of_Size_10_Floyd_Warshall(){

        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 1.txt");
        int[][] solution = new int[10][10] ;
        int[][] parents  = new int[10][10] ;

        long startTime = System.nanoTime();

        graph.floydWarshall(solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Floyd Warshall size (10) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[][] cost = {
                {0, 3, 3, 5, 1, 2, 5, 2, 1, 3},
                {4, 0, 4, 3, 5, 3, 6, 4, 4, 4},
                {5, 4, 0, 2, 5, 1, 5, 5, 3, 2},
                {8, 4, 4, 0, 7, 3, 9, 4, 5, 6},
                {7, 7, 8, 8, 0, 9, 4, 4, 8, 6},
                {6, 4, 1, 3, 6, 0, 6, 4, 2, 3},
                {8, 4, 5, 4, 5, 5, 0, 8, 7, 2},
                {7, 3, 6, 6, 6, 5, 7, 0, 5, 4},
                {5, 2, 2, 4, 6, 1, 6, 2, 0, 2},
                {6, 2, 5, 2, 5, 5, 5, 6, 6, 0}
        };

        assertArrayEquals(cost, solution);

    }

    @Test
    public void Graph_of_Size_20_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 2.txt");
        int[] solution = new int[20] ;
        int[] parents  = new int[20] ;

        long startTime = System.nanoTime();

        graph.dijkstra(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Dijkstra size (20) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 4, 3, 2, 3, 1, 3, 3, 4, 4, 2, 1, 5, 3, 2, 3, 5, 1, 3, 5};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_20_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 2.txt");
        int[] solution = new int[20] ;
        int[] parents  = new int[20] ;

        long startTime = System.nanoTime();

        graph.bellmanFord(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Bellman Ford size (20) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 4, 3, 2, 3, 1, 3, 3, 4, 4, 2, 1, 5, 3, 2, 3, 5, 1, 3, 5};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_20_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 2.txt");
        int[][] solution = new int[20][20] ;
        int[][] parents  = new int[20][20] ;

        long startTime = System.nanoTime();

        graph.floydWarshall(solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Floyd Warshall size (20) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[][] cost = {
                {0, 4, 3, 2, 3, 1, 3, 3, 4, 4, 2, 1, 5, 3, 2, 3, 5, 1, 3, 5},
                {4, 0, 4, 2, 3, 4, 4, 4, 4, 5, 3, 2, 5, 4, 3, 3, 3, 4, 4, 3},
                {3, 3, 0, 4, 4, 3, 1, 2, 3, 4, 4, 3, 2, 3, 3, 2, 5, 4, 1, 5},
                {3, 3, 2, 0, 1, 3, 3, 2, 2, 4, 3, 4, 4, 2, 2, 1, 4, 4, 3, 3},
                {4, 4, 1, 4, 0, 4, 2, 3, 2, 3, 3, 3, 3, 4, 4, 3, 3, 3, 2, 2},
                {2, 3, 4, 3, 3, 0, 2, 2, 5, 3, 1, 3, 4, 2, 2, 4, 4, 1, 3, 5},
                {2, 2, 3, 3, 4, 2, 0, 1, 4, 3, 3, 3, 2, 2, 3, 4, 4, 3, 4, 5},
                {1, 3, 2, 3, 3, 1, 3, 0, 3, 2, 2, 2, 2, 3, 2, 4, 3, 2, 3, 5},
                {4, 3, 3, 4, 4, 2, 4, 3, 0, 3, 3, 5, 2, 3, 3, 2, 3, 3, 2, 6},
                {3, 2, 1, 4, 3, 1, 2, 3, 4, 0, 2, 3, 3, 1, 2, 3, 5, 1, 2, 5},
                {1, 3, 4, 3, 4, 2, 1, 2, 5, 4, 0, 2, 3, 3, 3, 4, 3, 2, 3, 6},
                {3, 4, 3, 1, 2, 2, 4, 2, 3, 4, 3, 0, 4, 3, 1, 2, 5, 3, 2, 4},
                {4, 1, 3, 3, 4, 3, 4, 3, 5, 2, 4, 3, 0, 3, 4, 4, 4, 3, 3, 4},
                {2, 1, 2, 3, 2, 2, 2, 3, 4, 4, 1, 3, 4, 0, 1, 3, 4, 3, 3, 4},
                {3, 4, 2, 3, 1, 1, 3, 3, 3, 3, 2, 4, 4, 3, 0, 2, 4, 2, 3, 3},
                {2, 2, 3, 4, 2, 2, 3, 1, 1, 3, 2, 3, 3, 1, 1, 0, 4, 3, 3, 4},
                {2, 3, 2, 1, 2, 2, 1, 1, 3, 3, 3, 3, 3, 3, 3, 2, 0, 3, 3, 4},
                {4, 4, 3, 4, 2, 2, 4, 4, 4, 4, 3, 5, 4, 4, 1, 3, 5, 0, 2, 4},
                {2, 3, 1, 4, 3, 2, 2, 2, 2, 4, 3, 3, 3, 2, 2, 1, 5, 3, 0, 5},
                {2, 3, 3, 2, 3, 2, 2, 1, 3, 3, 1, 1, 2, 4, 2, 3, 4, 1, 3, 0}
        };
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_30_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 3.txt");
        int[] solution = new int[30] ;
        int[] parents  = new int[30] ;

        long startTime = System.nanoTime();

        graph.dijkstra(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Dijkstra size (30) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 5, 3, 4, 3, 2, 4, 2, 4, 3, 3, 2, 3, 4, 2, 4, 3, 4, 4, 1, 3, 3, 3, 4, 3, 3, 4, 3, 2, 2};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_30_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 3.txt");
        int[] solution = new int[30] ;
        int[] parents  = new int[30] ;

        long startTime = System.nanoTime();

        graph.bellmanFord(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Bellman Ford size (30) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 5, 3, 4, 3, 2, 4, 2, 4, 3, 3, 2, 3, 4, 2, 4, 3, 4, 4, 1, 3, 3, 3, 4, 3, 3, 4, 3, 2, 2};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_30_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 3.txt");
        int[][] solution = new int[30][30] ;
        int[][] parents  = new int[30][30] ;

        long startTime = System.nanoTime();

        graph.floydWarshall(solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Floyd Warshall size (30) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[][] cost = {
                {0, 5, 3, 4, 3, 2, 4, 2, 4, 3, 3, 2, 3, 4, 2, 4, 3, 4, 4, 1, 3, 3, 3, 4, 3, 3, 4, 3, 2, 2},
                {2, 0, 1, 3, 3, 4, 5, 2, 4, 4, 2, 4, 4, 5, 3, 5, 3, 4, 5, 3, 5, 4, 4, 5, 5, 4, 4, 5, 4, 4},
                {3, 4, 0, 3, 3, 4, 4, 1, 3, 3, 1, 4, 4, 4, 4, 4, 2, 3, 4, 4, 4, 4, 3, 4, 4, 3, 3, 4, 4, 3},
                {2, 4, 5, 0, 3, 4, 3, 4, 5, 3, 5, 3, 5, 3, 2, 5, 3, 6, 6, 3, 4, 2, 2, 3, 4, 5, 5, 4, 4, 4},
                {4, 4, 2, 3, 0, 3, 3, 3, 2, 2, 3, 1, 3, 4, 3, 3, 2, 5, 3, 4, 3, 2, 3, 4, 3, 2, 4, 3, 2, 4},
                {4, 3, 1, 3, 4, 0, 4, 2, 4, 2, 2, 3, 4, 5, 4, 3, 1, 4, 2, 3, 3, 3, 4, 2, 4, 4, 3, 2, 5, 3},
                {4, 4, 4, 3, 2, 3, 0, 3, 3, 2, 3, 3, 2, 3, 3, 3, 4, 4, 4, 2, 1, 4, 3, 4, 4, 2, 4, 4, 4, 3},
                {3, 4, 4, 4, 2, 3, 3, 0, 3, 3, 4, 3, 4, 4, 3, 3, 3, 3, 4, 4, 3, 4, 2, 3, 4, 2, 4, 4, 4, 5},
                {2, 3, 3, 1, 4, 3, 2, 2, 0, 3, 3, 2, 2, 3, 3, 3, 2, 4, 1, 2, 3, 2, 3, 4, 1, 2, 2, 1, 2, 3},
                {3, 4, 2, 1, 4, 3, 4, 3, 3, 0, 3, 4, 4, 4, 3, 3, 4, 5, 4, 4, 3, 3, 3, 4, 3, 2, 4, 4, 4, 2},
                {2, 3, 4, 3, 5, 4, 3, 3, 2, 4, 0, 4, 3, 4, 4, 5, 3, 6, 3, 3, 3, 4, 2, 3, 3, 4, 2, 3, 4, 3},
                {4, 4, 4, 2, 4, 3, 2, 2, 3, 2, 4, 0, 4, 5, 4, 3, 1, 4, 4, 4, 3, 1, 4, 4, 2, 3, 3, 4, 3, 4},
                {4, 3, 3, 3, 3, 2, 1, 3, 4, 3, 2, 3, 0, 1, 4, 4, 2, 5, 4, 3, 2, 3, 1, 2, 5, 3, 4, 3, 3, 4},
                {5, 3, 4, 5, 2, 5, 4, 5, 4, 4, 4, 3, 3, 0, 5, 5, 4, 6, 5, 5, 3, 4, 4, 2, 4, 4, 4, 4, 3, 5},
                {4, 4, 3, 2, 1, 2, 2, 4, 3, 1, 4, 2, 4, 5, 0, 4, 3, 5, 4, 3, 3, 3, 4, 4, 2, 3, 3, 2, 3, 3},
                {3, 1, 2, 3, 2, 2, 3, 3, 2, 2, 3, 3, 3, 2, 1, 0, 3, 4, 3, 2, 3, 2, 4, 4, 3, 3, 2, 1, 4, 3},
                {4, 3, 3, 2, 3, 4, 4, 1, 4, 1, 3, 4, 5, 4, 3, 2, 0, 4, 3, 4, 4, 4, 3, 4, 4, 3, 4, 3, 5, 3},
                {2, 3, 3, 3, 1, 3, 3, 3, 2, 3, 3, 2, 2, 3, 3, 3, 3, 0, 3, 2, 2, 3, 3, 2, 1, 2, 1, 2, 2, 2},
                {4, 4, 2, 3, 3, 4, 2, 1, 4, 3, 3, 1, 4, 4, 4, 4, 2, 4, 0, 3, 3, 2, 2, 3, 3, 3, 3, 2, 4, 4},
                {4, 4, 2, 4, 3, 1, 4, 1, 3, 3, 2, 4, 3, 4, 4, 4, 2, 3, 3, 0, 2, 4, 3, 3, 2, 3, 3, 3, 3, 1},
                {4, 3, 3, 3, 3, 2, 2, 3, 2, 2, 2, 3, 1, 2, 2, 2, 3, 3, 3, 3, 0, 4, 2, 3, 3, 1, 4, 3, 3, 4},
                {3, 3, 3, 1, 3, 2, 1, 3, 4, 3, 3, 1, 3, 4, 3, 4, 2, 5, 4, 3, 2, 0, 3, 3, 3, 3, 4, 3, 2, 4},
                {4, 2, 3, 3, 3, 3, 1, 2, 3, 2, 4, 2, 3, 2, 4, 3, 1, 5, 4, 2, 2, 2, 0, 1, 4, 3, 3, 2, 4, 3},
                {3, 1, 2, 3, 4, 3, 3, 3, 3, 2, 3, 4, 2, 3, 3, 3, 4, 4, 4, 4, 1, 4, 3, 0, 4, 2, 2, 3, 4, 3},
                {3, 2, 3, 2, 3, 2, 3, 3, 1, 2, 2, 3, 2, 3, 2, 2, 3, 5, 2, 3, 2, 2, 2, 3, 0, 1, 1, 2, 1, 2},
                {3, 2, 2, 2, 2, 1, 3, 3, 1, 1, 2, 2, 2, 3, 1, 1, 2, 4, 2, 2, 1, 3, 3, 3, 2, 0, 3, 2, 2, 3},
                {2, 3, 4, 3, 4, 3, 2, 3, 3, 3, 2, 3, 1, 2, 3, 3, 3, 4, 3, 2, 1, 2, 2, 3, 2, 2, 0, 1, 3, 1},
                {3, 3, 3, 2, 4, 2, 2, 2, 4, 4, 3, 2, 2, 3, 4, 3, 3, 3, 4, 1, 2, 1, 3, 4, 3, 3, 1, 0, 3, 2},
                {2, 3, 3, 3, 3, 2, 2, 3, 2, 2, 1, 3, 1, 2, 2, 2, 2, 4, 3, 2, 1, 2, 1, 2, 3, 1, 2, 1, 0, 2},
                {4, 3, 4, 3, 4, 3, 4, 4, 2, 3, 3, 3, 3, 4, 3, 3, 4, 6, 3, 4, 3, 3, 3, 4, 1, 2, 2, 3, 2, 0}
        };

        assertArrayEquals(cost, solution) ;
    }

    @Test
    public void Graph_of_Size_40_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 4.txt");
        int[] solution = new int[40] ;
        int[] parents  = new int[40] ;

        long startTime = System.nanoTime();

        graph.dijkstra(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Dijkstra size (40) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 3, 3, 2, 1, 4, 1, 2, 2, 3, 1, 1, 3, 3, 2, 2, 3, 2, 2, 4, 4, 3, 3, 3, 2, 2, 3, 3, 3, 2, 3, 2, 1, 3, 2, 2, 3, 3, 3, 2};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_40_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 4.txt");
        int[] solution = new int[40] ;
        int[] parents  = new int[40] ;

        long startTime = System.nanoTime();

        graph.bellmanFord(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Bellman Ford size (40) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 3, 3, 2, 1, 4, 1, 2, 2, 3, 1, 1, 3, 3, 2, 2, 3, 2, 2, 4, 4, 3, 3, 3, 2, 2, 3, 3, 3, 2, 3, 2, 1, 3, 2, 2, 3, 3, 3, 2};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_40_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 4.txt");
        int[][] solution = new int[40][40] ;
        int[][] parents  = new int[40][40] ;

        long startTime = System.nanoTime();

        graph.floydWarshall(solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Floyd Warshall size (40) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[][] cost = {
                {0, 3, 3, 2, 1, 4, 1, 2, 2, 3, 1, 1, 3, 3, 2, 2, 3, 2, 2, 4, 4, 3, 3, 3, 2, 2, 3, 3, 3, 2, 3, 2, 1, 3, 2, 2, 3, 3, 3, 2},
                {2, 0, 3, 1, 3, 1, 3, 2, 3, 1, 1, 2, 3, 3, 3, 2, 3, 1, 3, 3, 3, 2, 2, 2, 3, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 3, 3, 3, 3, 3},
                {2, 3, 0, 4, 3, 4, 3, 2, 3, 4, 3, 3, 3, 3, 3, 4, 4, 4, 3, 4, 4, 4, 3, 4, 2, 4, 3, 3, 2, 4, 4, 3, 3, 4, 4, 2, 4, 3, 5, 4},
                {3, 3, 2, 0, 3, 2, 3, 2, 2, 2, 3, 3, 2, 3, 2, 4, 3, 3, 2, 4, 4, 3, 3, 1, 3, 4, 3, 3, 2, 3, 1, 3, 2, 2, 2, 4, 2, 2, 3, 3},
                {4, 4, 3, 4, 0, 4, 4, 3, 4, 3, 3, 2, 3, 2, 1, 3, 2, 4, 1, 3, 4, 3, 3, 2, 4, 5, 4, 2, 3, 4, 4, 3, 4, 3, 3, 4, 4, 3, 4, 3},
                {1, 2, 3, 2, 2, 0, 2, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2, 1, 3, 2, 3, 3, 4, 4, 3, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3},
                {2, 2, 3, 1, 3, 3, 0, 2, 3, 3, 2, 1, 3, 3, 2, 2, 3, 1, 2, 4, 4, 4, 3, 2, 3, 1, 2, 3, 2, 3, 2, 1, 3, 2, 3, 3, 3, 3, 2, 2},
                {3, 2, 3, 2, 2, 3, 2, 0, 3, 2, 2, 3, 2, 1, 3, 2, 2, 2, 3, 2, 3, 2, 2, 2, 2, 2, 1, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 1, 3, 2},
                {3, 1, 3, 2, 3, 2, 4, 3, 0, 2, 2, 3, 3, 1, 2, 2, 2, 2, 3, 2, 3, 3, 3, 2, 4, 2, 3, 2, 3, 3, 3, 4, 3, 1, 3, 3, 3, 3, 3, 3},
                {4, 4, 3, 3, 4, 3, 3, 2, 3, 0, 3, 1, 3, 3, 2, 2, 3, 3, 2, 4, 2, 1, 4, 3, 3, 4, 3, 3, 4, 3, 3, 4, 2, 3, 3, 3, 3, 3, 2, 2},
                {4, 3, 2, 3, 2, 4, 3, 1, 2, 2, 0, 3, 3, 2, 3, 1, 3, 3, 3, 3, 4, 3, 3, 3, 3, 3, 2, 4, 4, 3, 4, 3, 2, 2, 3, 2, 2, 2, 4, 3},
                {4, 3, 3, 3, 3, 4, 3, 1, 3, 2, 2, 0, 3, 2, 1, 1, 3, 3, 1, 3, 4, 3, 3, 2, 3, 3, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 1},
                {2, 2, 4, 2, 1, 2, 1, 2, 1, 2, 3, 2, 0, 2, 2, 2, 3, 1, 2, 3, 4, 3, 3, 3, 3, 2, 2, 3, 2, 3, 1, 2, 2, 2, 2, 2, 2, 2, 3, 1},
                {3, 2, 2, 3, 2, 3, 3, 4, 3, 2, 3, 3, 2, 0, 2, 3, 3, 2, 2, 1, 2, 3, 2, 1, 4, 3, 3, 3, 4, 4, 3, 4, 3, 2, 3, 2, 4, 2, 4, 2},
                {4, 3, 4, 3, 4, 4, 4, 2, 4, 3, 2, 1, 4, 3, 0, 2, 4, 3, 2, 4, 4, 3, 4, 3, 3, 4, 3, 3, 4, 4, 4, 4, 3, 3, 3, 3, 3, 2, 4, 2},
                {3, 3, 3, 2, 2, 4, 3, 3, 2, 1, 2, 2, 2, 3, 2, 0, 2, 2, 2, 4, 3, 2, 3, 3, 2, 2, 2, 3, 3, 2, 3, 2, 1, 1, 2, 1, 1, 3, 3, 3},
                {3, 4, 1, 5, 4, 4, 4, 3, 4, 2, 4, 3, 4, 4, 3, 3, 0, 4, 4, 3, 4, 3, 3, 4, 3, 5, 4, 2, 3, 4, 5, 4, 4, 4, 3, 3, 4, 4, 4, 4},
                {1, 3, 3, 3, 2, 3, 2, 2, 3, 2, 2, 1, 3, 2, 2, 1, 3, 0, 2, 3, 4, 3, 2, 3, 3, 3, 1, 2, 3, 2, 3, 3, 2, 2, 3, 2, 2, 3, 4, 2},
                {3, 3, 2, 3, 3, 3, 3, 2, 3, 2, 3, 1, 2, 3, 2, 2, 2, 3, 0, 2, 3, 2, 2, 1, 3, 4, 3, 1, 2, 3, 3, 2, 3, 2, 2, 3, 3, 3, 3, 2},
                {2, 2, 3, 2, 3, 3, 2, 3, 4, 2, 3, 2, 3, 3, 3, 2, 2, 1, 3, 0, 3, 2, 1, 2, 4, 3, 2, 2, 3, 3, 3, 3, 3, 2, 3, 2, 3, 1, 3, 3},
                {2, 3, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 3, 2, 3, 2, 3, 2, 0, 3, 2, 2, 3, 2, 1, 3, 2, 3, 1, 2, 3, 3, 2, 2, 2, 2, 3, 2},
                {3, 3, 2, 2, 3, 2, 2, 3, 2, 3, 2, 3, 2, 2, 2, 3, 3, 2, 3, 3, 1, 0, 3, 2, 2, 3, 2, 2, 3, 2, 2, 3, 1, 3, 2, 3, 3, 3, 1, 1},
                {3, 1, 2, 2, 2, 2, 1, 2, 3, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 1, 3, 3, 0, 3, 4, 2, 2, 3, 3, 4, 3, 2, 4, 3, 4, 1, 4, 2, 3, 3},
                {3, 3, 1, 2, 2, 3, 2, 3, 2, 1, 3, 2, 1, 3, 1, 3, 2, 2, 1, 3, 3, 2, 3, 0, 3, 3, 2, 2, 3, 3, 2, 3, 3, 1, 2, 3, 3, 3, 3, 2},
                {3, 2, 1, 2, 2, 3, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 3, 2, 1, 2, 3, 2, 1, 2, 0, 2, 2, 2, 2, 4, 3, 2, 3, 2, 3, 1, 2, 1, 3, 3},
                {2, 3, 2, 4, 2, 4, 3, 2, 3, 3, 1, 3, 3, 2, 2, 2, 2, 3, 2, 3, 4, 3, 3, 3, 3, 0, 2, 3, 1, 2, 4, 2, 2, 3, 3, 3, 3, 3, 1, 3},
                {3, 2, 3, 2, 1, 3, 1, 2, 3, 2, 1, 2, 3, 1, 2, 1, 3, 2, 2, 2, 3, 3, 1, 2, 3, 2, 0, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 3, 3},
                {3, 2, 1, 3, 3, 2, 2, 3, 3, 2, 3, 2, 3, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 3, 3, 0, 1, 2, 3, 2, 2, 2, 1, 2, 2, 2, 2, 2},
                {2, 3, 3, 4, 3, 4, 3, 3, 2, 3, 2, 2, 2, 1, 2, 3, 3, 2, 1, 2, 3, 3, 3, 2, 2, 4, 2, 2, 0, 2, 3, 1, 1, 3, 2, 3, 4, 3, 3, 3},
                {3, 3, 1, 3, 1, 3, 2, 1, 2, 3, 2, 2, 3, 2, 2, 3, 3, 2, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 1, 0, 3, 2, 1, 3, 2, 3, 4, 2, 3, 1},
                {2, 2, 3, 2, 3, 1, 3, 3, 1, 1, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3, 1, 2, 0, 2, 2, 2, 1, 3, 1, 1, 2, 3},
                {1, 4, 2, 3, 2, 3, 2, 3, 3, 2, 2, 2, 4, 2, 1, 3, 4, 3, 3, 3, 4, 3, 3, 3, 3, 3, 2, 4, 4, 3, 4, 0, 2, 4, 3, 3, 4, 3, 4, 3},
                {2, 2, 2, 3, 2, 3, 2, 2, 1, 3, 1, 2, 3, 2, 3, 2, 3, 1, 2, 3, 3, 2, 2, 2, 1, 3, 2, 3, 2, 1, 4, 2, 0, 2, 1, 2, 3, 2, 2, 2},
                {2, 4, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 2, 1, 4, 3, 4, 4, 4, 4, 2, 4, 4, 4, 3, 3, 2, 2, 4, 3, 0, 3, 3, 3, 3, 4, 3},
                {2, 2, 2, 2, 2, 3, 3, 2, 3, 2, 2, 3, 2, 1, 2, 3, 3, 3, 2, 2, 2, 1, 3, 1, 3, 4, 3, 2, 2, 1, 3, 3, 2, 2, 0, 2, 3, 3, 1, 2},
                {3, 2, 3, 3, 1, 3, 2, 3, 2, 2, 2, 2, 1, 2, 1, 2, 3, 2, 1, 3, 2, 3, 2, 2, 4, 2, 1, 2, 3, 3, 2, 3, 3, 3, 3, 0, 3, 3, 3, 2},
                {2, 4, 3, 4, 3, 4, 3, 4, 3, 3, 3, 3, 2, 3, 2, 4, 4, 3, 4, 4, 5, 4, 4, 4, 3, 4, 3, 5, 4, 3, 3, 1, 2, 4, 3, 4, 0, 3, 4, 3},
                {2, 1, 3, 1, 2, 2, 3, 3, 3, 2, 2, 2, 3, 3, 3, 2, 2, 1, 3, 3, 2, 1, 2, 2, 3, 3, 2, 3, 3, 3, 2, 4, 2, 1, 3, 3, 3, 0, 2, 2},
                {3, 3, 3, 4, 3, 3, 3, 3, 2, 3, 2, 2, 2, 3, 1, 3, 4, 2, 3, 3, 3, 2, 3, 2, 2, 4, 3, 4, 3, 2, 3, 3, 1, 3, 2, 3, 2, 3, 0, 3},
                {3, 3, 3, 3, 2, 3, 2, 3, 2, 3, 2, 3, 4, 3, 3, 3, 4, 2, 3, 4, 4, 3, 3, 3, 2, 3, 3, 4, 3, 2, 2, 3, 1, 3, 2, 3, 3, 3, 3, 0}
        };
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_50_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 5.txt");
        int[] solution = new int[50];
        int[] parents  = new int[50] ;

        long startTime = System.nanoTime();

        graph.dijkstra(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Dijkstra size (50) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 3, 3, 2, 2, 3, 3, 3, 2, 2, 2, 3, 1, 3, 2, 2, 3, 2, 1, 2, 3, 3, 2, 2, 2, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 3, 3, 2, 3, 3, 3, 4, 2, 3, 2, 1, 3, 2, 1, 3};
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_50_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 5.txt");
        int[] solution = new int[50];
        int[] parents  = new int[50] ;

        long startTime = System.nanoTime();

        graph.bellmanFord(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Bellman Ford size (50) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 3, 3, 2, 2, 3, 3, 3, 2, 2, 2, 3, 1, 3, 2, 2, 3, 2, 1, 2, 3, 3, 2, 2, 2, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 3, 3, 2, 3, 3, 3, 4, 2, 3, 2, 1, 3, 2, 1, 3};
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_50_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 5.txt");
        int[][] solution = new int[50][50];
        int[][] parents  = new int[50][50] ;

        long startTime = System.nanoTime();

        graph.floydWarshall(solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Floyd Warshall size (50) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[][] cost =   {
                {0, 3, 3, 2, 2, 3, 3, 3, 2, 2, 2, 3, 1, 3, 2, 2, 3, 2, 1, 2, 3, 3, 2, 2, 2, 2, 2, 3, 3, 3, 2, 4, 3, 2, 3, 3, 3, 2, 3, 3, 3, 4, 2, 3, 2, 1, 3, 2, 1, 3},
                {2, 0, 2, 2, 2, 3, 3, 2, 3, 2, 3, 3, 2, 2, 2, 2, 1, 3, 2, 2, 2, 1, 1, 3, 2, 2, 2, 2, 2, 3, 3, 2, 1, 3, 3, 3, 3, 2, 1, 2, 2, 3, 2, 3, 2, 3, 4, 3, 2, 3},
                {2, 3, 0, 3, 3, 2, 2, 2, 3, 2, 3, 3, 3, 3, 3, 1, 2, 2, 3, 2, 3, 3, 2, 3, 2, 2, 2, 2, 2, 1, 2, 2, 3, 3, 2, 3, 3, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 3, 2, 3},
                {2, 2, 2, 0, 2, 4, 1, 2, 2, 2, 3, 2, 2, 1, 2, 3, 2, 3, 3, 2, 3, 3, 3, 3, 1, 3, 2, 3, 2, 3, 1, 3, 2, 2, 2, 3, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3, 3, 2, 3, 2},
                {3, 3, 3, 3, 0, 3, 2, 3, 3, 3, 2, 3, 2, 4, 3, 4, 3, 2, 3, 3, 3, 4, 4, 4, 4, 4, 3, 2, 3, 4, 2, 4, 3, 3, 4, 3, 3, 3, 2, 3, 4, 4, 1, 3, 3, 3, 4, 3, 4, 4},
                {3, 2, 2, 4, 2, 0, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 1, 3, 2, 4, 4, 3, 2, 3, 4, 3, 4, 2, 2, 3, 4, 2, 3, 4, 2, 3, 3, 3, 2, 3, 1, 3, 3, 3, 3, 4, 4, 3, 3, 5},
                {2, 3, 2, 1, 3, 3, 0, 1, 2, 3, 2, 3, 2, 2, 3, 3, 3, 2, 3, 1, 2, 2, 2, 3, 2, 3, 1, 3, 2, 3, 2, 2, 3, 1, 3, 3, 3, 1, 2, 3, 2, 3, 1, 2, 3, 2, 4, 2, 3, 2},
                {2, 3, 4, 4, 2, 3, 4, 0, 3, 2, 3, 2, 2, 4, 2, 3, 2, 2, 3, 3, 1, 3, 3, 2, 3, 3, 2, 3, 2, 3, 4, 1, 2, 2, 2, 3, 2, 3, 3, 2, 3, 4, 2, 1, 4, 2, 4, 3, 3, 3},
                {3, 1, 2, 3, 2, 3, 2, 2, 0, 2, 2, 3, 2, 3, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 3, 1, 2, 3, 3, 2, 1, 2, 1, 2, 3, 2, 2, 1, 3, 3, 2, 2, 1, 2, 3, 1, 2, 3},
                {3, 3, 2, 3, 2, 3, 3, 2, 3, 0, 3, 3, 3, 3, 2, 2, 4, 2, 2, 2, 3, 3, 2, 2, 3, 2, 3, 2, 2, 1, 3, 2, 4, 3, 2, 3, 1, 3, 3, 1, 1, 3, 2, 3, 3, 2, 3, 1, 2, 3},
                {2, 3, 2, 3, 2, 3, 4, 2, 2, 2, 0, 2, 3, 3, 2, 2, 3, 2, 2, 2, 3, 3, 3, 2, 3, 2, 2, 3, 1, 3, 2, 3, 2, 3, 2, 1, 3, 3, 1, 2, 2, 3, 2, 1, 2, 2, 4, 3, 2, 3},
                {1, 2, 3, 3, 3, 3, 3, 2, 1, 2, 2, 0, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 4, 2, 2, 2},
                {2, 3, 2, 2, 3, 2, 3, 2, 3, 2, 2, 2, 0, 2, 1, 3, 2, 1, 3, 1, 2, 2, 2, 2, 3, 2, 2, 3, 2, 3, 3, 3, 3, 1, 3, 3, 2, 2, 2, 3, 2, 3, 2, 2, 3, 1, 4, 3, 3, 2},
                {2, 1, 1, 3, 2, 3, 3, 3, 2, 3, 3, 1, 3, 0, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 2, 2, 3, 3, 3, 2, 3, 2, 1, 2, 3, 4, 3, 2, 2, 2, 3, 2, 2, 2, 2, 2, 3, 3, 3, 3},
                {3, 3, 2, 3, 3, 2, 4, 2, 3, 2, 2, 3, 2, 2, 0, 3, 3, 3, 2, 3, 3, 4, 1, 2, 2, 1, 3, 3, 3, 2, 4, 3, 2, 3, 2, 3, 3, 3, 1, 3, 2, 3, 3, 3, 2, 3, 4, 3, 4, 3},
                {2, 3, 2, 3, 3, 2, 4, 2, 2, 2, 2, 4, 2, 3, 2, 0, 2, 2, 2, 2, 3, 3, 2, 2, 2, 1, 1, 3, 2, 1, 1, 3, 2, 3, 3, 3, 3, 2, 1, 2, 2, 3, 2, 3, 2, 1, 3, 3, 3, 2},
                {2, 1, 2, 3, 2, 4, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 0, 3, 1, 3, 3, 2, 2, 2, 3, 3, 3, 1, 1, 3, 3, 3, 2, 3, 2, 2, 2, 3, 1, 2, 2, 3, 2, 2, 2, 3, 4, 2, 2, 4},
                {1, 3, 3, 3, 3, 1, 4, 2, 2, 3, 2, 3, 2, 3, 2, 2, 2, 0, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 1, 3, 3, 3, 3, 1, 2, 2, 1, 3, 2, 3, 2, 4, 2, 2, 3, 2, 4, 3, 2, 2},
                {3, 2, 3, 3, 1, 3, 2, 3, 1, 3, 3, 4, 3, 4, 3, 1, 3, 3, 0, 3, 2, 2, 3, 2, 3, 2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 3, 3, 3, 2, 2, 3, 4, 2, 3, 2, 2, 4, 2, 3, 3},
                {1, 2, 1, 1, 3, 2, 2, 2, 3, 3, 1, 2, 2, 1, 2, 2, 3, 1, 2, 0, 3, 1, 2, 2, 2, 3, 3, 3, 2, 2, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 3, 2, 2, 1, 2, 2, 3, 3, 2, 3},
                {1, 2, 3, 3, 2, 2, 3, 2, 2, 3, 3, 3, 2, 3, 1, 3, 1, 1, 2, 2, 0, 3, 2, 2, 2, 2, 3, 2, 2, 3, 3, 2, 1, 1, 3, 3, 1, 2, 2, 3, 2, 3, 2, 3, 3, 2, 4, 3, 2, 3},
                {3, 3, 3, 4, 3, 3, 4, 3, 3, 2, 3, 3, 3, 4, 2, 1, 3, 3, 2, 3, 4, 0, 3, 3, 2, 2, 2, 3, 2, 2, 2, 2, 3, 4, 3, 3, 3, 3, 2, 1, 3, 2, 2, 3, 3, 2, 3, 2, 1, 3},
                {3, 2, 2, 3, 2, 3, 3, 1, 3, 1, 3, 2, 1, 1, 2, 3, 3, 2, 2, 2, 2, 3, 0, 3, 3, 3, 3, 2, 3, 2, 4, 2, 2, 2, 2, 4, 2, 2, 3, 2, 1, 3, 3, 2, 3, 2, 4, 2, 3, 3},
                {2, 3, 2, 3, 2, 3, 4, 3, 3, 2, 1, 2, 2, 3, 2, 2, 2, 2, 2, 2, 1, 3, 2, 0, 3, 3, 3, 3, 2, 3, 2, 3, 2, 1, 1, 1, 2, 3, 2, 3, 2, 3, 1, 2, 3, 2, 4, 3, 3, 3},
                {1, 3, 3, 3, 3, 4, 4, 3, 2, 3, 2, 3, 2, 4, 3, 3, 3, 3, 2, 3, 4, 2, 3, 3, 0, 3, 3, 3, 1, 4, 3, 3, 3, 3, 2, 2, 4, 3, 2, 3, 2, 4, 3, 2, 3, 2, 4, 3, 2, 4},
                {2, 3, 3, 2, 3, 1, 3, 3, 2, 3, 1, 3, 3, 3, 3, 3, 2, 2, 3, 3, 2, 3, 2, 1, 1, 0, 2, 3, 2, 1, 3, 3, 3, 2, 2, 2, 3, 4, 2, 3, 2, 4, 2, 2, 3, 3, 3, 3, 3, 3},
                {1, 3, 3, 3, 3, 2, 4, 3, 2, 3, 2, 3, 1, 3, 2, 3, 3, 1, 2, 2, 3, 3, 3, 3, 3, 2, 0, 3, 1, 2, 3, 3, 3, 2, 2, 2, 2, 3, 2, 3, 2, 3, 1, 2, 2, 2, 3, 3, 2, 1},
                {3, 2, 2, 2, 1, 4, 1, 1, 3, 2, 2, 3, 2, 3, 3, 2, 3, 3, 2, 2, 2, 3, 2, 3, 3, 3, 2, 0, 2, 3, 3, 2, 3, 2, 3, 3, 3, 2, 2, 1, 3, 3, 1, 2, 3, 2, 3, 1, 3, 3},
                {1, 2, 2, 3, 2, 3, 3, 2, 1, 2, 1, 2, 2, 3, 2, 2, 3, 2, 2, 2, 3, 2, 3, 2, 2, 2, 3, 2, 0, 3, 2, 3, 2, 3, 1, 1, 3, 3, 1, 2, 1, 3, 2, 1, 2, 2, 3, 2, 1, 4},
                {2, 3, 2, 3, 2, 2, 3, 2, 3, 2, 3, 3, 2, 2, 2, 3, 3, 1, 2, 3, 3, 4, 1, 4, 2, 3, 3, 2, 2, 0, 4, 3, 3, 2, 2, 3, 2, 3, 3, 3, 1, 3, 2, 3, 3, 3, 2, 3, 3, 2},
                {3, 2, 2, 4, 3, 3, 3, 3, 1, 2, 3, 3, 2, 3, 3, 3, 1, 3, 2, 3, 3, 2, 3, 2, 3, 2, 3, 2, 2, 3, 0, 2, 2, 3, 2, 3, 3, 3, 2, 1, 3, 3, 2, 2, 1, 2, 3, 2, 3, 4},
                {2, 3, 3, 3, 1, 3, 3, 1, 2, 3, 2, 1, 1, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 3, 2, 3, 3, 3, 3, 4, 3, 0, 3, 2, 3, 3, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 4, 3, 2, 3},
                {2, 3, 2, 2, 1, 2, 3, 2, 3, 3, 2, 2, 2, 2, 2, 3, 2, 2, 3, 1, 1, 2, 2, 2, 1, 1, 3, 2, 2, 2, 3, 1, 0, 2, 3, 3, 2, 1, 2, 2, 3, 3, 1, 2, 3, 3, 4, 3, 3, 4},
                {2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 2, 3, 2, 2, 2, 3, 2, 2, 2, 1, 1, 2, 2, 2, 3, 3, 2, 2, 3, 3, 3, 3, 2, 0, 2, 3, 2, 2, 2, 3, 1, 3, 1, 2, 2, 1, 4, 3, 3, 2},
                {3, 3, 2, 3, 2, 3, 3, 2, 2, 1, 3, 3, 1, 3, 2, 1, 3, 2, 1, 2, 3, 3, 3, 3, 3, 2, 2, 3, 3, 2, 2, 2, 2, 2, 0, 4, 2, 3, 1, 2, 2, 3, 3, 3, 2, 2, 4, 2, 3, 3},
                {2, 3, 2, 2, 1, 2, 3, 3, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 2, 1, 3, 3, 3, 1, 0, 3, 2, 2, 2, 3, 3, 1, 2, 2, 2, 4, 3, 3, 3},
                {2, 3, 2, 2, 3, 3, 3, 1, 2, 2, 2, 3, 3, 2, 1, 3, 3, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 3, 3, 3, 3, 0, 2, 2, 3, 3, 3, 3, 2, 3, 1, 3, 2, 1, 3},
                {1, 2, 2, 2, 3, 3, 3, 2, 3, 2, 2, 3, 2, 2, 2, 3, 3, 2, 2, 1, 3, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 3, 3, 0, 3, 3, 2, 2, 2, 1, 2, 2, 4, 3, 2, 4},
                {3, 3, 1, 2, 2, 3, 3, 1, 2, 1, 3, 3, 3, 3, 1, 2, 2, 3, 1, 2, 2, 3, 2, 2, 2, 2, 3, 3, 3, 2, 3, 2, 1, 3, 2, 3, 2, 2, 0, 2, 2, 2, 2, 2, 1, 3, 3, 2, 3, 4},
                {2, 2, 3, 3, 2, 3, 4, 2, 2, 1, 2, 2, 2, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 4, 3, 1, 2, 3, 1, 3, 3, 2, 2, 2, 3, 2, 0, 2, 3, 1, 2, 3, 3, 2, 2, 2, 3},
                {4, 3, 3, 3, 1, 3, 2, 2, 2, 2, 3, 4, 2, 4, 3, 2, 3, 3, 1, 3, 3, 3, 3, 3, 3, 2, 3, 1, 3, 3, 3, 3, 3, 3, 1, 3, 3, 3, 2, 2, 0, 4, 2, 2, 3, 3, 4, 2, 4, 4},
                {2, 3, 3, 4, 3, 1, 4, 1, 3, 1, 3, 3, 3, 3, 2, 3, 2, 3, 3, 3, 2, 3, 3, 3, 1, 2, 3, 3, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 3, 1, 2, 0, 2, 2, 2, 3, 3, 2, 1, 4},
                {3, 3, 2, 3, 3, 3, 4, 2, 3, 2, 1, 2, 1, 3, 2, 3, 3, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 2, 3, 3, 3, 2, 2, 3, 2, 3, 2, 1, 3, 3, 3, 0, 2, 2, 2, 4, 3, 3, 3},
                {2, 4, 3, 4, 2, 2, 4, 1, 3, 3, 2, 3, 2, 3, 3, 2, 3, 1, 3, 3, 2, 4, 3, 2, 3, 3, 2, 4, 2, 3, 3, 2, 3, 2, 3, 2, 2, 2, 2, 3, 3, 4, 1, 0, 3, 1, 4, 3, 3, 3},
                {3, 2, 1, 3, 3, 3, 3, 2, 3, 2, 3, 3, 2, 3, 2, 2, 1, 2, 2, 3, 3, 3, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 3, 1, 3, 3, 2, 1, 1, 2, 2, 2, 1, 0, 2, 3, 3, 3, 4},
                {2, 3, 3, 3, 3, 3, 4, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 3, 2, 2, 3, 2, 1, 2, 3, 1, 3, 2, 3, 3, 4, 3, 2, 2, 2, 3, 1, 3, 3, 3, 3, 2, 2, 3, 0, 4, 2, 3, 2},
                {2, 3, 2, 1, 3, 2, 2, 2, 3, 2, 2, 3, 3, 2, 2, 3, 3, 2, 2, 1, 2, 2, 3, 3, 2, 2, 3, 3, 2, 3, 2, 3, 2, 3, 2, 3, 3, 3, 1, 2, 2, 1, 3, 2, 2, 2, 0, 2, 2, 1},
                {2, 3, 2, 2, 3, 3, 2, 2, 3, 2, 2, 3, 2, 2, 3, 1, 3, 2, 3, 1, 3, 2, 1, 3, 2, 2, 2, 3, 3, 2, 2, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2, 3, 2, 2, 3, 2, 4, 0, 3, 2},
                {3, 3, 3, 3, 3, 2, 3, 3, 2, 1, 2, 4, 3, 3, 1, 2, 2, 3, 3, 2, 3, 3, 2, 2, 2, 1, 3, 2, 3, 2, 1, 3, 3, 3, 3, 3, 2, 4, 2, 2, 2, 3, 3, 2, 2, 3, 2, 1, 0, 3},
                {2, 2, 3, 3, 2, 2, 3, 3, 2, 2, 2, 3, 2, 3, 3, 2, 3, 3, 1, 2, 3, 3, 3, 2, 2, 1, 3, 3, 1, 2, 3, 3, 2, 3, 1, 2, 3, 2, 2, 3, 2, 3, 3, 2, 3, 3, 2, 3, 2, 0},
        };
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_60_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 6.txt");
        int[] solution = new int[60];
        int[] parents  = new int[60] ;

        long startTime = System.nanoTime();

        graph.dijkstra(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Dijkstra size (60) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 2, 3, 2, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 2, 3, 2, 2, 3, 3, 4, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 2, 3, 4, 1, 2, 3, 3, 3, 2, 1, 1, 3, 3, 1, 2, 3, 1, 3, 3};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_60_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 6.txt");
        int[] solution = new int[60];
        int[] parents  = new int[60] ;

        long startTime = System.nanoTime();

        graph.bellmanFord(0, solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Bellman Ford size (60) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[] cost = {0, 2, 3, 2, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 2, 3, 2, 2, 3, 3, 4, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 2, 3, 4, 1, 2, 3, 3, 3, 2, 1, 1, 3, 3, 1, 2, 3, 1, 3, 3};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_of_Size_60_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 6.txt");
        int[][] solution = new int[60][60];
        int[][] parents  = new int[60][60] ;

        long startTime = System.nanoTime();

        graph.floydWarshall(solution, parents); ;

        long endTime = System.nanoTime();

        long elapsedTimeInNanoseconds = endTime - startTime;

        long elapsedTimeInMicroseconds = elapsedTimeInNanoseconds / 1000;

        System.out.println("Floyd Warshall size (60) Elapsed time in microseconds: " + elapsedTimeInMicroseconds);

        int[][] cost =
                {
                    {0, 2, 3, 2, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 2, 3, 2, 2, 3, 3, 4, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 2, 3, 4, 1, 2, 3, 3, 3, 2, 1, 1, 3, 3, 1, 2, 3, 1, 3, 3},
                    {3, 0, 1, 3, 2, 3, 3, 1, 3, 3, 3, 3, 4, 2, 3, 2, 2, 3, 3, 3, 2, 2, 3, 2, 2, 3, 2, 2, 2, 3, 3, 3, 2, 3, 3, 3, 3, 2, 2, 3, 3, 2, 2, 3, 2, 2, 3, 2, 3, 3, 3, 3, 2, 1, 3, 2, 3, 3, 3, 2},
                    {2, 3, 0, 2, 2, 4, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 2, 3, 1, 2, 3, 2, 3, 2, 3, 3, 3, 3, 2, 3, 2, 3, 3, 2, 1, 1, 3, 2, 2, 2, 4, 1, 2, 3, 3, 2, 3, 3, 2, 2, 2, 2, 3, 3, 2, 2, 2},
                    {2, 3, 2, 0, 1, 3, 3, 2, 3, 1, 3, 2, 3, 2, 3, 2, 1, 2, 3, 3, 2, 1, 2, 3, 2, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 3, 1, 3, 2, 3, 3, 2, 3, 3, 2, 3, 2, 3, 3, 3, 3, 2, 3, 2, 2, 3, 2, 2, 3, 2},
                    {2, 2, 3, 2, 0, 2, 2, 1, 3, 3, 3, 2, 2, 2, 3, 2, 2, 3, 2, 2, 2, 1, 3, 2, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 1, 2, 3, 3, 2, 3, 2, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 3, 3},
                    {1, 2, 2, 3, 3, 0, 2, 2, 1, 3, 4, 3, 4, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 2, 2, 2, 3, 1, 3, 3, 2, 2, 2, 2, 3, 3, 2, 2, 1, 2, 2, 1, 3, 2, 3, 2},
                    {2, 2, 2, 3, 1, 3, 0, 2, 2, 2, 2, 2, 3, 3, 2, 2, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 3, 2, 2, 3, 2, 3, 2, 2, 3, 3, 1, 2, 2, 3, 3, 2, 2, 2, 3, 2, 3, 2, 3, 3, 2, 3, 2, 1, 2, 1},
                    {2, 3, 3, 2, 1, 3, 2, 0, 3, 3, 3, 3, 3, 1, 2, 2, 1, 3, 2, 3, 1, 2, 3, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 3, 1, 3, 2, 1, 2, 3, 3, 2},
                    {3, 2, 3, 2, 3, 3, 4, 3, 0, 2, 3, 3, 3, 3, 3, 3, 2, 2, 3, 3, 2, 3, 3, 4, 3, 3, 3, 2, 2, 3, 1, 2, 3, 2, 3, 3, 3, 1, 1, 2, 2, 3, 2, 4, 3, 2, 3, 3, 2, 3, 3, 3, 2, 2, 2, 3, 3, 2, 2, 2},
                    {3, 2, 3, 2, 1, 3, 2, 2, 3, 0, 3, 3, 3, 3, 3, 2, 2, 2, 3, 3, 3, 2, 3, 3, 3, 2, 3, 3, 2, 3, 1, 2, 3, 2, 3, 3, 2, 3, 3, 2, 2, 1, 3, 3, 3, 3, 2, 2, 3, 2, 2, 3, 3, 2, 2, 3, 1, 1, 3, 3},
                    {2, 1, 2, 2, 3, 3, 2, 2, 2, 2, 0, 2, 3, 3, 3, 2, 3, 3, 3, 1, 3, 1, 2, 3, 2, 3, 2, 2, 2, 2, 3, 2, 2, 3, 2, 4, 3, 1, 2, 3, 3, 2, 2, 3, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 3, 2, 3, 2},
                    {2, 1, 2, 3, 3, 3, 3, 2, 2, 2, 2, 0, 2, 1, 2, 2, 3, 1, 2, 2, 2, 3, 2, 3, 1, 3, 2, 1, 2, 2, 3, 1, 3, 3, 2, 3, 2, 2, 2, 3, 1, 2, 2, 2, 2, 1, 1, 2, 1, 3, 2, 3, 2, 2, 2, 3, 2, 2, 3, 3},
                    {2, 2, 2, 3, 3, 4, 2, 3, 3, 3, 2, 2, 0, 2, 3, 2, 3, 1, 2, 2, 4, 2, 3, 3, 2, 2, 2, 2, 3, 3, 4, 3, 3, 4, 3, 3, 2, 2, 2, 1, 2, 1, 3, 3, 2, 2, 3, 2, 3, 1, 2, 3, 2, 3, 3, 3, 3, 2, 2, 1},
                    {2, 3, 2, 3, 3, 4, 2, 2, 3, 2, 2, 3, 4, 0, 1, 3, 3, 3, 1, 3, 2, 2, 3, 3, 2, 2, 1, 2, 2, 2, 2, 2, 3, 3, 2, 2, 3, 2, 3, 3, 2, 3, 2, 1, 3, 2, 2, 2, 3, 2, 3, 3, 3, 3, 2, 3, 3, 2, 3, 3},
                    {3, 3, 1, 2, 2, 4, 3, 1, 3, 2, 2, 3, 3, 2, 0, 3, 2, 2, 3, 2, 2, 2, 2, 2, 3, 2, 1, 2, 1, 3, 1, 3, 2, 2, 3, 3, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 3, 2, 3, 2, 3, 2, 2, 2, 1, 2, 3, 3, 3, 3},
                    {2, 3, 2, 3, 2, 4, 1, 2, 3, 2, 2, 2, 2, 1, 1, 0, 2, 2, 2, 2, 3, 2, 2, 3, 3, 1, 2, 2, 1, 2, 2, 3, 2, 2, 3, 2, 3, 2, 3, 1, 2, 3, 3, 2, 2, 3, 3, 3, 1, 2, 3, 3, 3, 3, 1, 2, 2, 2, 1, 2},
                    {3, 3, 3, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 2, 2, 3, 0, 2, 3, 2, 4, 2, 2, 3, 3, 2, 3, 2, 1, 3, 1, 3, 2, 2, 3, 3, 3, 3, 3, 2, 2, 2, 3, 2, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 1, 2, 3, 3, 2, 3},
                    {1, 2, 1, 2, 3, 4, 2, 2, 3, 3, 1, 3, 4, 3, 3, 2, 3, 0, 2, 2, 3, 2, 3, 3, 3, 3, 3, 2, 3, 2, 3, 3, 3, 3, 3, 2, 2, 2, 2, 3, 2, 1, 3, 3, 2, 2, 2, 2, 3, 2, 1, 2, 1, 2, 2, 3, 3, 2, 3, 2},
                    {2, 2, 2, 3, 2, 4, 1, 3, 2, 1, 2, 3, 3, 2, 2, 2, 3, 2, 0, 2, 2, 2, 2, 3, 1, 3, 1, 1, 1, 2, 2, 1, 3, 2, 3, 3, 3, 1, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 2, 3, 3, 2, 3, 2, 2, 2, 2, 3, 2},
                    {2, 2, 3, 3, 3, 4, 2, 3, 1, 3, 3, 1, 2, 2, 3, 2, 3, 2, 2, 0, 2, 3, 2, 3, 1, 3, 2, 2, 2, 3, 2, 1, 1, 3, 2, 3, 2, 2, 2, 3, 2, 2, 2, 3, 2, 1, 1, 2, 2, 1, 3, 3, 2, 2, 2, 3, 3, 2, 2, 3},
                    {2, 3, 3, 3, 2, 3, 2, 2, 2, 3, 3, 3, 4, 3, 3, 2, 2, 2, 3, 2, 0, 2, 3, 2, 2, 3, 2, 3, 2, 3, 2, 1, 2, 3, 3, 1, 2, 2, 2, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 2, 3, 2, 2, 2, 3, 2, 1, 3, 3, 1},
                    {1, 2, 3, 1, 2, 3, 2, 1, 3, 2, 3, 1, 3, 2, 2, 1, 2, 2, 3, 3, 2, 0, 2, 2, 1, 2, 2, 2, 2, 2, 3, 2, 2, 2, 3, 3, 2, 2, 1, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 3, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2},
                    {2, 3, 3, 3, 2, 3, 1, 3, 2, 2, 2, 2, 3, 2, 3, 2, 2, 2, 1, 2, 3, 2, 0, 3, 2, 3, 2, 1, 1, 2, 3, 2, 1, 2, 1, 2, 3, 2, 3, 2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 2, 2, 1, 3, 2, 2, 3, 2, 2, 1, 2},
                    {3, 3, 2, 3, 2, 3, 2, 1, 2, 2, 2, 2, 4, 2, 3, 3, 2, 3, 1, 3, 2, 2, 3, 0, 2, 3, 1, 2, 2, 1, 3, 2, 3, 3, 3, 3, 2, 1, 2, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 1, 3, 3, 2, 3, 3, 2, 3, 2, 2, 3},
                    {1, 3, 2, 3, 3, 4, 2, 3, 3, 2, 2, 3, 4, 3, 3, 3, 2, 1, 2, 3, 3, 2, 1, 2, 0, 3, 3, 2, 2, 2, 3, 3, 2, 3, 2, 3, 3, 1, 3, 3, 3, 2, 3, 2, 2, 3, 3, 1, 3, 3, 2, 2, 2, 3, 2, 2, 3, 2, 2, 2},
                    {1, 2, 2, 3, 2, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3, 2, 1, 2, 3, 3, 3, 2, 3, 3, 2, 0, 2, 1, 2, 3, 2, 2, 3, 3, 4, 2, 3, 2, 3, 3, 3, 2, 4, 3, 2, 3, 2, 3, 3, 3, 2, 2, 3, 3, 2, 3, 2, 2, 1, 1},
                    {2, 2, 1, 2, 3, 3, 2, 2, 3, 2, 1, 2, 3, 2, 2, 2, 2, 2, 3, 2, 3, 1, 2, 3, 2, 3, 0, 2, 1, 2, 3, 3, 3, 2, 2, 3, 2, 2, 2, 3, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 3, 3, 2, 3},
                    {2, 2, 2, 3, 2, 3, 2, 3, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 3, 2, 3, 3, 3, 2, 2, 2, 3, 0, 2, 3, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 3, 1, 3, 3, 1, 2, 1, 2, 2, 3, 2, 3, 2, 3, 1, 2, 1, 2, 2, 3},
                    {2, 2, 2, 2, 3, 4, 2, 2, 3, 3, 2, 2, 2, 1, 2, 2, 2, 1, 2, 3, 3, 1, 1, 3, 2, 3, 2, 2, 0, 3, 2, 2, 2, 1, 2, 3, 2, 2, 2, 2, 2, 2, 3, 2, 3, 2, 3, 3, 3, 1, 2, 2, 2, 2, 2, 3, 3, 3, 2, 3},
                    {3, 2, 3, 2, 3, 4, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 1, 3, 3, 1, 3, 3, 2, 3, 3, 0, 3, 2, 3, 3, 2, 2, 3, 2, 3, 3, 3, 1, 2, 3, 2, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 2, 3, 3, 2},
                    {2, 2, 3, 1, 2, 3, 3, 2, 3, 2, 3, 3, 2, 2, 2, 2, 1, 2, 2, 2, 3, 2, 2, 3, 3, 3, 2, 2, 1, 2, 0, 2, 3, 1, 3, 4, 2, 2, 3, 1, 1, 3, 3, 3, 2, 3, 3, 2, 3, 2, 3, 3, 3, 1, 2, 2, 3, 2, 3, 3},
                    {2, 3, 2, 3, 3, 4, 3, 2, 2, 2, 3, 2, 3, 2, 2, 2, 3, 2, 3, 2, 1, 2, 2, 2, 1, 3, 3, 3, 1, 2, 3, 0, 3, 2, 3, 2, 3, 1, 1, 3, 3, 2, 2, 3, 1, 2, 2, 2, 3, 2, 2, 3, 1, 3, 2, 3, 2, 2, 2, 2},
                    {1, 2, 3, 3, 3, 3, 2, 2, 3, 2, 3, 3, 3, 3, 3, 3, 2, 3, 1, 3, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 2, 0, 2, 2, 3, 3, 2, 3, 3, 2, 3, 3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 2, 1, 1, 2, 3, 2, 3, 3},
                    {1, 1, 2, 1, 2, 3, 3, 1, 3, 2, 3, 3, 1, 2, 3, 2, 1, 2, 2, 2, 2, 2, 3, 2, 2, 3, 3, 2, 2, 3, 1, 1, 3, 0, 3, 3, 2, 1, 2, 1, 2, 2, 2, 3, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 3, 2, 3, 2},
                    {2, 2, 3, 2, 3, 3, 2, 3, 3, 3, 1, 2, 3, 2, 2, 1, 3, 2, 2, 2, 3, 2, 1, 3, 3, 2, 2, 2, 1, 2, 3, 2, 2, 2, 0, 3, 2, 2, 2, 1, 2, 3, 3, 3, 2, 2, 3, 2, 2, 1, 1, 2, 2, 2, 2, 3, 2, 1, 2, 3},
                    {2, 2, 2, 2, 2, 3, 1, 1, 1, 3, 2, 2, 3, 2, 2, 1, 1, 1, 3, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 0, 3, 2, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 3, 2, 2, 1},
                    {2, 2, 3, 2, 2, 3, 2, 1, 3, 3, 3, 2, 4, 1, 2, 2, 1, 3, 2, 3, 2, 1, 3, 2, 2, 3, 2, 3, 2, 3, 2, 3, 1, 3, 3, 3, 0, 3, 2, 3, 3, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2, 2, 2, 3, 3, 3, 1},
                    {3, 2, 3, 3, 2, 3, 3, 3, 2, 1, 4, 4, 4, 3, 3, 2, 3, 3, 3, 3, 4, 3, 4, 4, 4, 2, 4, 3, 3, 4, 2, 3, 3, 3, 3, 4, 3, 0, 3, 2, 3, 2, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 2, 3, 2, 1, 3, 3},
                    {2, 3, 3, 3, 3, 3, 3, 2, 3, 2, 3, 3, 3, 2, 3, 2, 2, 3, 3, 3, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 3, 1, 2, 2, 2, 3, 3, 2, 0, 2, 3, 2, 1, 3, 2, 1, 2, 3, 2, 2, 2, 3, 1, 3, 1, 2, 3, 2, 3, 1},
                    {3, 2, 3, 2, 3, 3, 2, 3, 2, 2, 3, 2, 3, 1, 2, 1, 2, 2, 1, 1, 3, 3, 3, 2, 2, 2, 2, 1, 2, 3, 3, 2, 2, 3, 3, 3, 3, 2, 3, 0, 3, 2, 3, 2, 1, 2, 2, 3, 2, 2, 3, 3, 3, 3, 2, 3, 2, 1, 2, 3},
                    {3, 3, 2, 3, 2, 2, 3, 2, 2, 1, 3, 3, 3, 2, 1, 2, 2, 2, 3, 3, 2, 2, 3, 2, 3, 3, 2, 1, 2, 1, 2, 3, 2, 3, 3, 3, 1, 3, 3, 3, 0, 2, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2, 2, 3, 2},
                    {3, 1, 2, 3, 2, 4, 1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 3, 3, 2, 3, 3, 2, 3, 3, 3, 2, 3, 2, 2, 3, 3, 2, 3, 2, 2, 3, 3, 3, 3, 2, 0, 3, 2, 3, 3, 3, 1, 4, 3, 2, 3, 3, 2, 3, 2, 3, 2, 3, 2},
                    {1, 2, 3, 3, 2, 4, 2, 1, 3, 2, 3, 2, 3, 2, 2, 1, 2, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2, 0, 3, 1, 2, 3, 3, 2, 3, 2, 2, 2, 3, 2, 2, 3, 2, 2, 3},
                    {2, 3, 1, 3, 2, 4, 1, 2, 3, 2, 3, 3, 3, 3, 3, 2, 3, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 3, 2, 3, 3, 2, 3, 3, 2, 2, 2, 2, 2, 1, 0, 2, 1, 2, 3, 2, 3, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2},
                    {3, 2, 2, 3, 2, 4, 2, 2, 2, 1, 3, 1, 3, 2, 1, 3, 3, 2, 3, 1, 3, 3, 3, 3, 2, 2, 2, 2, 2, 3, 2, 2, 2, 3, 2, 3, 2, 3, 3, 3, 2, 1, 2, 3, 0, 1, 2, 2, 2, 2, 3, 3, 3, 3, 2, 3, 2, 2, 3, 3},
                    {2, 2, 3, 3, 3, 4, 2, 2, 3, 2, 2, 2, 2, 3, 2, 2, 3, 2, 3, 2, 3, 3, 2, 3, 2, 2, 3, 3, 2, 3, 3, 3, 3, 2, 1, 3, 3, 3, 2, 2, 3, 1, 1, 3, 1, 0, 1, 2, 1, 2, 2, 3, 3, 3, 2, 2, 2, 2, 3, 2},
                    {2, 2, 3, 4, 3, 3, 2, 3, 2, 3, 3, 2, 3, 2, 2, 1, 3, 2, 3, 1, 3, 3, 2, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 3, 2, 3, 2, 2, 3, 2, 3, 3, 3, 2, 3, 2, 0, 2, 2, 2, 3, 2, 3, 3, 2, 3, 2, 1, 2, 3},
                    {2, 3, 2, 2, 3, 3, 2, 3, 3, 3, 2, 2, 4, 3, 3, 2, 1, 3, 2, 2, 2, 3, 2, 3, 2, 2, 3, 2, 2, 2, 2, 2, 3, 3, 1, 3, 3, 2, 3, 2, 2, 3, 2, 1, 2, 2, 3, 0, 3, 2, 1, 3, 3, 3, 2, 1, 2, 2, 3, 3},
                    {3, 2, 3, 3, 2, 3, 3, 2, 3, 1, 1, 3, 1, 2, 3, 3, 3, 2, 2, 2, 3, 2, 3, 3, 3, 3, 3, 3, 2, 3, 2, 2, 3, 3, 3, 3, 2, 2, 3, 2, 3, 2, 3, 3, 3, 2, 3, 3, 0, 2, 2, 3, 2, 2, 3, 3, 1, 2, 3, 2},
                    {3, 2, 2, 3, 2, 3, 1, 2, 3, 2, 2, 1, 3, 2, 2, 2, 2, 2, 3, 2, 3, 2, 2, 3, 2, 3, 1, 2, 2, 2, 3, 2, 2, 3, 2, 2, 1, 1, 1, 3, 1, 2, 2, 3, 2, 1, 2, 2, 2, 0, 3, 3, 2, 3, 2, 3, 2, 2, 1, 2},
                    {1, 2, 3, 1, 2, 3, 2, 3, 2, 2, 3, 2, 3, 3, 2, 2, 2, 2, 1, 3, 3, 2, 3, 3, 2, 3, 2, 1, 2, 2, 3, 2, 2, 2, 3, 3, 2, 2, 2, 3, 1, 2, 3, 3, 2, 2, 2, 3, 3, 1, 0, 2, 3, 3, 2, 3, 2, 2, 2, 3},
                    {2, 2, 3, 2, 3, 4, 3, 2, 4, 3, 4, 4, 2, 2, 3, 3, 2, 3, 3, 3, 2, 3, 4, 2, 3, 4, 3, 3, 3, 1, 2, 2, 4, 1, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 3, 2, 3, 3, 3, 3, 3, 0, 2, 3, 3, 3, 2, 3, 4, 2},
                    {2, 2, 3, 2, 2, 4, 2, 1, 3, 3, 3, 3, 3, 2, 2, 1, 2, 3, 2, 2, 2, 2, 3, 2, 2, 2, 2, 2, 2, 1, 3, 2, 3, 3, 2, 3, 3, 3, 1, 2, 2, 1, 2, 3, 3, 2, 1, 2, 2, 2, 1, 3, 0, 3, 2, 2, 3, 2, 2, 1},
                    {3, 1, 2, 3, 3, 2, 3, 2, 2, 3, 2, 3, 3, 2, 3, 2, 2, 2, 3, 3, 3, 2, 2, 2, 2, 3, 1, 1, 1, 3, 3, 3, 3, 2, 2, 4, 3, 2, 2, 2, 2, 2, 3, 2, 2, 2, 2, 1, 3, 2, 2, 3, 3, 0, 2, 1, 2, 3, 3, 3},
                    {2, 2, 3, 2, 2, 3, 3, 2, 2, 1, 3, 3, 2, 3, 3, 2, 1, 2, 2, 3, 3, 3, 3, 3, 2, 1, 3, 1, 2, 4, 2, 2, 1, 1, 3, 3, 3, 2, 3, 2, 3, 2, 3, 3, 2, 2, 2, 2, 3, 3, 3, 3, 3, 2, 0, 1, 2, 2, 2, 2},
                    {2, 3, 3, 3, 3, 4, 3, 3, 2, 2, 3, 3, 3, 2, 3, 2, 2, 2, 2, 2, 3, 2, 2, 3, 1, 3, 3, 1, 1, 3, 3, 3, 3, 2, 2, 3, 3, 1, 2, 1, 3, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 3, 3, 3, 2, 0, 2, 2, 2, 3},
                    {2, 3, 2, 3, 1, 2, 3, 2, 3, 3, 2, 2, 3, 2, 3, 3, 2, 1, 3, 3, 2, 2, 3, 3, 2, 4, 3, 3, 2, 3, 3, 1, 2, 3, 2, 2, 1, 2, 2, 2, 3, 2, 3, 3, 2, 2, 3, 3, 3, 3, 2, 3, 2, 3, 3, 3, 0, 3, 3, 2},
                    {2, 1, 2, 3, 3, 2, 2, 2, 3, 2, 3, 3, 3, 2, 2, 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 1, 3, 2, 2, 3, 3, 3, 2, 2, 2, 3, 4, 3, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 2, 3, 3, 2, 3, 2, 1, 2, 3, 0, 2, 2},
                    {3, 2, 3, 3, 1, 3, 2, 2, 2, 2, 3, 1, 3, 2, 3, 2, 2, 2, 3, 2, 3, 2, 3, 3, 2, 3, 3, 2, 3, 3, 2, 2, 3, 3, 3, 1, 2, 1, 3, 3, 2, 2, 3, 3, 3, 2, 2, 3, 2, 3, 3, 2, 3, 2, 3, 3, 1, 2, 0, 2},
                    {1, 3, 2, 2, 3, 4, 2, 2, 4, 3, 2, 2, 4, 3, 3, 2, 3, 2, 3, 3, 3, 1, 2, 3, 1, 3, 1, 3, 2, 3, 4, 3, 3, 3, 3, 3, 2, 2, 2, 3, 2, 3, 3, 3, 2, 2, 3, 2, 3, 2, 2, 2, 3, 2, 2, 3, 3, 2, 3, 0},
                };

        assertArrayEquals(cost, solution);

    }

    @Test
    public void Negative_Weights_Graph_1_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 7.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.bellmanFord(0, solution, parents); ;

        int[] cost = {0, -1, -3, 0, -1, 1, 0, -2, 1, -1, 0, 0, -1, -1, 0, -1, 0, -2, -1, -1};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Negative_Weights_Graph_1_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 7.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall(solution, parents); ;
        int[][] cost =
                {
                        {0, -1, -3, 0, -1, 1, 0, -2, 1, -1, 0, 0, -1, -1, 0, -1, 0, -2, -1, -1},
                        {3, 0, -2, 1, 1, 2, 2, 1, 2, 0, 2, 1, 1, 0, 1, 0, 2, -1, 0, 2},
                        {5, 4, 0, 3, 3, 6, 4, 3, 4, 2, 4, 3, 3, 2, 3, 2, 4, 1, 2, 4},
                        {4, 3, 1, 0, 1, 5, 3, 2, 4, 1, 3, 2, 3, 2, 3, 2, 3, 2, 1, 1},
                        {6, 5, 3, 6, 0, 5, 5, 4, 6, 4, 5, 4, 5, 5, 2, 5, 5, 4, 5, 3},
                        {3, 2, 0, 2, 2, 0, 3, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 1, 2, 1},
                        {5, 4, 2, 4, 1, 4, 0, 3, 3, 4, 2, 3, 1, 3, 3, 2, 2, 3, 4, 4},
                        {2, 1, -1, 2, 1, 3, 2, 0, 3, 1, 2, 2, 1, 1, 2, 1, 2, 0, 1, 1},
                        {2, 1, -1, 2, 1, 3, 2, 0, 0, 1, 1, 2, 1, 1, 1, 1, 2, 0, 1, 1},
                        {3, 2, 0, 3, 2, 4, 3, 1, 4, 0, 2, 3, 2, 2, 3, 2, 3, 1, 2, 2},
                        {3, 2, 0, 3, 2, 3, 3, 1, 4, 2, 0, 3, 2, 2, 3, 2, 3, 1, 2, 2},
                        {4, 2, 0, 3, 2, 3, 1, 2, 2, 2, 2, 0, 1, 2, 3, 2, 1, 1, 2, 2},
                        {4, 3, 1, 4, 3, 3, 3, 2, 2, 3, 1, 2, 0, 3, 2, 1, 1, 2, 3, 3},
                        {3, 2, 0, 3, 2, 4, 2, 1, 3, 2, 2, 1, 1, 0, 3, 2, 2, 1, 2, 2},
                        {5, 3, 1, 4, 2, 5, 3, 3, 4, 2, 3, 2, 3, 3, 0, 3, 3, 2, 3, 1},
                        {6, 4, 2, 4, 3, 5, 3, 4, 4, 3, 3, 2, 2, 4, 1, 0, 3, 3, 4, 2},
                        {3, 2, 0, 3, 2, 4, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 0, 1, 2, 2},
                        {4, 3, 1, 3, 2, 5, 3, 2, 4, 1, 3, 2, 2, 1, 4, 3, 3, 0, 1, 3},
                        {4, 3, 1, 2, 1, 5, 2, 2, 4, 3, 3, 2, 2, 1, 3, 3, 3, 2, 0, 3},
                        {5, 3, 1, 4, 3, 4, 2, 3, 3, 3, 2, 1, 2, 3, 4, 3, 2, 2, 3, 0}
                };
        assertArrayEquals(cost, solution);

    }

    @Test
    public void Negative_Weights_Graph_2_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 8.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.bellmanFord(0, solution, parents); ;

        int[] cost = {0, 2, 1, 2, 0, 0, 0, 2, 2, 1, 0, 0, -1, 2, 1, -1, 1, 1, 0, 0};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Negative_Weights_Graph_2_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 8.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall(solution, parents); ;

        int[][] cost =
                {
                        {0, 2, 1, 2, 0, 0, 0, 2, 2, 1, 0, 0, -1, 2, 1, -1, 1, 1, 0, 0},
                        {6, 0, 4, 7, 4, 6, 5, 5, 6, 3, 5, 6, 5, 6, 6, 4, 7, 7, 6, 5},
                        {4, 4, 0, 4, 2, 2, 2, 4, 2, 3, 3, 2, 1, 4, 4, 2, 3, 3, 2, 3},
                        {3, 1, -1, 0, 1, 1, 1, 2, 1, 2, 2, 1, 0, 3, 3, 1, 2, 2, 1, 1},
                        {2, 4, 2, 3, 0, 2, 1, 4, 4, 3, 2, 2, 1, 4, 3, 1, 3, 3, 2, 2},
                        {2, 4, 3, 4, 2, 0, 2, 2, 4, 3, 2, 2, 1, 3, 2, 1, 1, 3, 2, 2},
                        {2, 3, 1, 2, 2, 2, 0, 3, 3, 3, 2, 2, 1, 4, 2, 1, 3, 3, 2, 2},
                        {4, 5, 4, 5, 3, 3, 3, 0, 3, 3, 3, 3, 2, 1, 2, 3, 4, 3, 2, 4},
                        {2, 2, 1, 2, 0, 0, 0, 2, 0, 1, 1, 0, -1, 2, 2, 0, 1, 1, 0, 1},
                        {3, 5, 1, 5, 3, 3, 3, 5, 3, 0, 3, 3, 2, 5, 4, 2, 4, 4, 3, 3},
                        {5, 2, 1, 2, 3, 3, 3, 4, 3, 4, 0, 3, 2, 5, 4, 3, 4, 4, 3, 3},
                        {5, 2, 2, 5, 4, 4, 4, 2, 4, 5, 3, 0, 3, 3, 2, 2, 1, 3, 4, 3},
                        {3, 3, 2, 3, 1, 1, 1, 3, 3, 2, 2, 1, 0, 3, 3, 1, 2, 2, 1, 2},
                        {3, 4, 3, 4, 2, 2, 2, 4, 2, 3, 2, 2, 1, 0, 4, 2, 3, 2, 1, 3},
                        {4, 5, 4, 5, 3, 2, 3, 1, 3, 3, 4, 3, 2, 2, 0, 3, 3, 4, 3, 4},
                        {4, 3, 2, 3, 2, 4, 3, 3, 4, 5, 1, 2, 3, 4, 2, 0, 3, 5, 4, 1},
                        {4, 4, 2, 4, 3, 3, 4, 1, 4, 4, 2, 3, 3, 2, 1, 1, 0, 4, 3, 2},
                        {2, 3, 2, 3, 1, 1, 1, 3, 1, 2, 2, 1, 0, 3, 3, 1, 2, 0, 1, 1},
                        {3, 4, 2, 3, 2, 1, 2, 3, 2, 3, 3, 2, 1, 2, 3, 2, 2, 1, 0, 2},
                        {3, 3, 1, 3, 1, 3, 2, 3, 3, 4, 3, 1, 2, 4, 3, 2, 2, 4, 3, 0},
                };

        assertArrayEquals(cost, solution);

    }

    @Test
    public void Negative_Weights_Graph_3_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 9.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.bellmanFord(0, solution, parents); ;

        int[] cost = {0, 0, 2, 1, 0, 2, 1, -1, 1, -2, 1, 0, 0, 0, 0, 5, 3, 1, 1, 2};

        assertArrayEquals(cost, solution);

    }

    @Test
    public void Negative_WeightsGraph_3_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 9.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall(solution, parents); ;

        int[][] cost =
                {
                    {0, 0, 2, 1, 0, 2, 1, -1, 1, -2, 1, 0, 0, 0, 0, 5, 3, 1, 1, 2},
                    {1, 0, 3, 2, 1, 3, 2, 0, 2, -1, 2, 1, 1, 1, 1, 6, 4, 2, 2, 3},
                    {1, 1, 0, 2, 1, 3, 2, 0, 2, -1, 2, 1, 1, 1, 1, 4, 4, 2, 2, 3},
                    {2, 2, 3, 0, 1, 1, 2, 1, 2, 0, 3, 2, 2, 2, 2, 6, 5, 2, 3, 4},
                    {1, 1, 2, 1, 0, 2, 1, 0, 1, -1, 2, 1, 1, 1, 1, 5, 4, 2, 2, 3},
                    {2, 2, 3, 2, 1, 0, 2, 1, 2, 0, 2, 2, 2, 2, 2, 6, 5, 2, 3, 4},
                    {0, 0, 2, 1, 0, 2, 0, -1, 1, -2, 1, 0, 0, 0, 0, 5, 3, 1, 1, 2},
                    {2, 1, 3, 2, 1, 3, 2, 0, 2, 0, 2, 2, 1, 2, 2, 6, 5, 2, 3, 4},
                    {1, 1, 1, 1, 1, 2, 2, 0, 0, -1, 2, 1, 1, 0, 1, 4, 4, 2, 2, 2},
                    {2, 2, 4, 3, 2, 4, 3, 1, 3, 0, 3, 2, 2, 2, 2, 7, 5, 3, 3, 4},
                    {0, 0, 2, 1, 0, 2, 1, -1, 1, -2, 0, 0, 0, 0, 0, 5, 3, 1, 1, 2},
                    {1, 1, 3, 1, 1, 2, 1, 0, 2, -1, 2, 0, 1, 0, 1, 6, 4, 2, 2, 2},
                    {1, 1, 2, 1, 0, 2, 1, 0, 1, -1, 2, 1, 0, 1, 1, 5, 4, 1, 2, 3},
                    {2, 2, 4, 1, 2, 2, 2, 1, 3, 0, 3, 2, 2, 0, 2, 7, 5, 3, 3, 4},
                    {1, 1, 3, 2, 1, 3, 2, 0, 2, -1, 2, 1, 1, 1, 0, 6, 4, 2, 2, 3},
                    {1, 1, 2, 2, 1, 2, 2, 0, 2, -1, 2, 1, 1, 1, 1, 0, 4, 2, 2, 3},
                    {-3, -3, -1, -2, -3, -1, -2, -4, -2, -5, -2, -3, -3, -3, -3, 2, 0, -2, -2, -1},
                    {0, 0, 1, 0, -1, 1, 0, -1, 0, -2, 1, 0, 0, 0, 0, 4, 3, 0, 1, 2},
                    {-1, -1, 1, 0, -1, 1, 0, -2, 0, -3, 0, -1, -1, -1, -1, 4, 2, 0, 0, 1},
                    {0, 0, 2, -1, 0, 0, 0, -1, 1, -2, 1, 0, 0, -2, 0, 5, 3, 1, 1, 0},
                };

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Negative_Weights_Graph_4_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 10.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.bellmanFord(0, solution, parents); ;

        int[] cost = {0, 2, 3, 4, 3, 2, 0, 3, 2, 2, 0, 0, -1, 1, 2, 2, 1, 1, 1, 3};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Negative_Weights_Graph_4_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 10.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall( solution, parents); ;

        int[][] cost =
                {
                    {0, 2, 3, 4, 3, 2, 0, 3, 2, 2, 0, 0, -1, 1, 2, 2, 1, 1, 1, 3},
                    {3, 0, 4, 5, 3, 4, 1, 4, 2, 3, 2, 2, 2, 2, 2, 2, 1, 2, 3, 5},
                    {2, -1, 0, 4, 2, 3, 0, 3, 1, 2, 1, 1, 1, 1, 1, 1, 0, 1, 2, 3},
                    {1, 0, 2, 0, 3, -1, 1, 1, 2, 3, 1, 1, 0, 2, 2, 1, 1, 2, 2, 1},
                    {1, 0, 1, 5, 0, 1, 1, 1, -1, 2, 0, 0, 0, 1, 2, 1, 1, 1, 1, 3},
                    {2, 4, 5, 6, 5, 0, 2, 5, 4, 4, 2, 2, 1, 3, 4, 4, 3, 3, 3, 5},
                    {2, 2, 3, 6, 3, 3, 0, 4, 2, 2, 1, 1, 1, 1, 3, 3, 2, 1, 2, 4},
                    {3, 0, 1, 5, 3, 4, 1, 0, 2, 3, 2, 2, 2, 2, 2, 2, 1, 2, 3, 4},
                    {2, 1, 2, 6, 4, 2, 2, 2, 0, 3, 1, 1, 1, 2, 3, 3, 2, 2, 2, 4},
                    {2, 1, 2, 4, 1, 2, 2, 2, 0, 0, 1, 1, 1, -1, 1, 2, 2, 2, 2, 2},
                    {4, 3, 4, 6, 4, 4, 3, 4, 2, 4, 0, 3, 3, 2, 2, 4, 4, 3, 4, 4},
                    {1, 2, 4, 5, 3, 3, 1, 4, 2, 3, 0, 0, 0, 2, 2, 2, 1, 2, 1, 3},
                    {2, 3, 4, 5, 4, 3, 1, 4, 3, 3, 1, 1, 0, 2, 3, 3, 2, 2, 2, 4},
                    {3, 2, 3, 5, 2, 3, 3, 3, 1, 2, 2, 2, 2, 0, 2, 3, 3, 3, 3, 4},
                    {3, 3, 4, 4, 3, 3, 2, 3, 2, 3, 1, 2, 1, 1, 0, 2, 3, 3, 2, 5},
                    {5, 2, 3, 5, 5, 4, 3, 2, 3, 5, 1, 4, 4, 3, 3, 0, 3, 1, 3, 5},
                    {3, 2, 3, 6, 2, 3, 3, 3, 1, 4, 2, 2, 2, 3, 4, 1, 0, 2, 3, 5},
                    {5, 4, 5, 6, 4, 5, 3, 4, 3, 5, 1, 4, 4, 3, 3, 2, 5, 0, 2, 5},
                    {3, 2, 3, 5, 3, 3, 1, 3, 1, 3, -1, 2, 2, 1, 1, 3, 3, 2, 0, 3},
                    {2, -1, 3, 4, 2, 3, 0, 3, 1, 2, 1, 1, 1, 1, 1, 1, 0, 1, 2, 0},
                };

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Negative_Weights_Graph_5_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 11.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.dijkstra(0, solution, parents); ;

        int[] cost = {0, 3, 1, 2, 3, 5, 2, 2, 3, 1, 5, 6, 3, 2, 3, 2, 3, 3, 4, 3};

        assertArrayEquals(cost, solution);
    }

    @Test
    public void Negative_Weights_Graph_5_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 11.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall(solution, parents); ;

        int[][] cost =
                {
                        {0, 3, 1, 2, 3, 5, 2, 2, 3, 1, 5, 6, 3, 2, 3, 2, 3, 3, 4, 3},
                        {-1, 0, 0, 1, 2, 3, 1, -1, 2, 0, 3, 3, 2, 1, 1, 1, 2, 2, 3, 1},
                        {-1, 2, 0, 1, 2, 4, 1, 1, 2, 0, 4, 5, 2, 1, 2, 1, 2, 2, 3, 2},
                        {0, 1, 1, 0, 3, 4, 2, 0, 2, 1, 4, 4, 2, 2, 2, 2, 3, 3, 4, 2},
                        {2, 5, 3, 4, 0, 4, 4, 4, 3, 3, 6, 4, 5, 4, 3, 4, 4, 5, 4, 2},
                        {1, 2, 2, 2, 4, 0, 3, 1, 2, 2, 5, 4, 3, 3, 2, 3, 3, 4, 2, 3},
                        {2, 3, 3, 3, 4, 4, 0, 2, 3, 3, 4, 4, 1, 2, 1, 3, 2, 1, 2, 2},
                        {0, 1, 1, 2, 3, 4, 2, 0, 3, 1, 4, 4, 3, 2, 2, 2, 3, 3, 4, 2},
                        {1, 3, 2, 3, 4, 5, 2, 2, 0, 1, 3, 3, 3, 2, 2, 3, 1, 2, 4, 3},
                        {1, 2, 2, 3, 3, 4, 1, 1, 4, 0, 4, 5, 2, 1, 2, 2, 2, 2, 3, 2},
                        {0, 3, 1, 2, 3, 2, 2, 2, 1, 1, 0, 1, 3, 2, 3, 2, 2, 3, 3, 3},
                        {3, 4, 4, 4, 4, 2, 3, 3, 4, 3, 4, 0, 2, 4, 2, 4, 2, 3, 4, 4},
                        {4, 5, 5, 4, 5, 6, 5, 4, 3, 4, 5, 5, 0, 5, 5, 4, 4, 5, 7, 5},
                        {1, 3, 2, 2, 2, 4, 3, 2, 3, 2, 5, 4, 2, 0, 1, 1, 4, 3, 4, 2},
                        {1, 4, 2, 3, 4, 5, 2, 3, 2, 2, 5, 3, 3, 3, 0, 3, 3, 3, 4, 4},
                        {2, 5, 3, 4, 1, 3, 4, 4, 3, 3, 6, 5, 1, 4, 4, 0, 4, 5, 3, 1},
                        {1, 3, 2, 3, 4, 4, 3, 2, 3, 2, 2, 3, 2, 2, 1, 3, 0, 1, 4, 2},
                        {1, 2, 2, 3, 3, 3, 3, 1, 4, 2, 5, 5, 1, 1, 2, 2, 4, 0, 3, 1},
                        {2, 3, 3, 4, 3, 5, 3, 2, 5, 2, 6, 6, 3, 3, 4, 2, 4, 4, 0, 3},
                        {3, 4, 4, 4, 5, 2, 5, 3, 4, 4, 7, 5, 5, 5, 4, 4, 5, 6, 2, 0},
                };
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_with_Self_loops_1_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 12.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.bellmanFord(0, solution, parents); ;

        int[] cost = {0, 1, 2, 2, 2, 3, 1, 3, 4, 2, 4, 1, 3, 2, 2, 2, 3, 4, 2, 3};

        assertArrayEquals(cost, solution);

    }

    @Test
    public void Graph_with_Self_loops_1_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 12.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall(solution, parents); ;

        int[][] cost =
                {
                        {0, 1, 2, 2, 2, 3, 1, 3, 4, 2, 4, 1, 3, 2, 2, 2, 3, 4, 2, 3},
                        {4, 0, 4, 1, 3, 3, 1, 3, 4, 2, 3, 3, 2, 3, 1, 1, 3, 3, 3, 3},
                        {3, 4, 0, 4, 3, 5, 3, 3, 6, 4, 3, 4, 5, 4, 5, 4, 5, 4, 2, 5},
                        {3, 2, 4, 0, 3, 3, 1, 3, 4, 2, 2, 3, 1, 2, 2, 3, 3, 4, 4, 5},
                        {3, 3, 5, 3, 0, 4, 4, 2, 4, 3, 5, 2, 4, 2, 4, 4, 5, 3, 3, 4},
                        {4, 3, 1, 4, 4, 0, 4, 4, 6, 4, 3, 5, 2, 5, 3, 4, 1, 3, 3, 5},
                        {3, 3, 3, 2, 2, 2, 0, 2, 4, 1, 4, 2, 3, 3, 4, 4, 2, 3, 3, 4},
                        {1, 2, 3, 1, 3, 4, 2, 0, 3, 2, 3, 2, 2, 1, 3, 3, 4, 1, 2, 2},
                        {1, 2, 3, 2, 3, 3, 1, 1, 0, 2, 4, 2, 3, 2, 3, 3, 3, 2, 3, 3},
                        {2, 2, 4, 2, 2, 3, 1, 1, 4, 0, 4, 1, 3, 2, 3, 3, 3, 2, 2, 3},
                        {3, 4, 5, 3, 4, 4, 2, 2, 5, 3, 0, 2, 3, 3, 2, 5, 2, 3, 3, 4},
                        {2, 2, 4, 3, 4, 4, 2, 2, 3, 3, 3, 0, 2, 1, 3, 3, 4, 3, 1, 4},
                        {2, 1, 4, 2, 4, 3, 2, 3, 4, 3, 1, 3, 0, 4, 1, 2, 3, 4, 4, 4},
                        {3, 1, 5, 2, 4, 4, 2, 3, 2, 3, 4, 1, 3, 0, 2, 2, 4, 2, 2, 4},
                        {4, 4, 3, 5, 5, 2, 4, 4, 3, 5, 5, 4, 4, 3, 0, 5, 3, 5, 5, 5},
                        {4, 3, 3, 4, 5, 5, 4, 4, 4, 3, 3, 3, 5, 2, 3, 0, 5, 2, 3, 5},
                        {3, 2, 5, 3, 5, 4, 3, 4, 5, 4, 2, 4, 1, 4, 2, 3, 0, 5, 5, 4},
                        {2, 3, 4, 3, 3, 4, 2, 2, 5, 1, 5, 2, 4, 3, 3, 4, 3, 0, 1, 4},
                        {1, 2, 3, 2, 3, 3, 1, 1, 4, 2, 4, 2, 3, 2, 3, 3, 3, 2, 0, 3},
                        {1, 2, 2, 3, 3, 3, 2, 2, 1, 3, 3, 2, 4, 3, 1, 1, 4, 3, 3, 0},
                };
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_with_Self_loops_2_Dijkstra(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 13.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.dijkstra(0, solution, parents); ;

        int[] cost = {0, 4, 4, 5, 4, 3, 3, 3, 2, 3, 1, 3, 3, 3, 3, 4, 4, 3, 2, 5};
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_with_Self_loops_2_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 13.txt");
        int[] solution = new int[20];
        int[] parents  = new int[20] ;

        graph.bellmanFord(0, solution, parents); ;

        int[] cost = {0, 4, 4, 5, 4, 3, 3, 3, 2, 3, 1, 3, 3, 3, 3, 4, 4, 3, 2, 5};
        assertArrayEquals(cost, solution);

    }

    @Test
    public void Graph_with_Self_loops_2_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 13.txt");
        int[][] solution = new int[20][20];
        int[][] parents  = new int[20][20] ;

        graph.floydWarshall(solution, parents); ;

        int[][] cost =
                {
                    {0, 4, 4, 5, 4, 3, 3, 3, 2, 3, 1, 3, 3, 3, 3, 4, 4, 3, 2, 5},
                    {1, 0, 3, 4, 4, 3, 3, 1, 2, 2, 1, 2, 2, 3, 3, 3, 2, 3, 3, 4},
                    {3, 2, 0, 2, 2, 1, 2, 1, 2, 3, 3, 2, 2, 3, 2, 3, 2, 2, 1, 3},
                    {3, 4, 2, 0, 4, 3, 4, 2, 4, 4, 4, 1, 3, 3, 3, 4, 3, 2, 3, 2},
                    {2, 3, 4, 2, 0, 3, 3, 1, 3, 3, 3, 3, 2, 2, 3, 3, 2, 2, 2, 1},
                    {3, 4, 4, 3, 1, 0, 3, 2, 4, 3, 4, 3, 3, 2, 4, 4, 3, 3, 3, 2},
                    {3, 2, 1, 3, 3, 2, 0, 2, 2, 3, 1, 3, 3, 2, 2, 4, 3, 1, 2, 4},
                    {3, 2, 3, 4, 3, 4, 3, 0, 3, 2, 3, 2, 1, 3, 3, 2, 1, 3, 2, 4},
                    {2, 3, 2, 3, 3, 2, 1, 3, 0, 1, 2, 4, 3, 1, 1, 2, 2, 2, 3, 3},
                    {3, 2, 3, 2, 2, 3, 2, 3, 1, 0, 3, 3, 4, 2, 2, 1, 1, 3, 3, 2},
                    {3, 4, 3, 4, 3, 2, 2, 4, 1, 2, 0, 5, 4, 2, 2, 3, 3, 2, 4, 4},
                    {3, 3, 1, 2, 3, 2, 3, 2, 3, 3, 3, 0, 3, 2, 3, 4, 3, 3, 2, 2},
                    {2, 1, 3, 4, 4, 3, 2, 2, 2, 3, 2, 2, 0, 2, 2, 3, 2, 2, 1, 4},
                    {1, 3, 4, 3, 2, 1, 3, 3, 2, 1, 2, 3, 2, 0, 3, 2, 2, 4, 3, 3},
                    {4, 5, 4, 4, 2, 2, 3, 3, 4, 5, 3, 5, 4, 4, 0, 4, 4, 4, 4, 3},
                    {2, 2, 4, 2, 1, 2, 4, 2, 4, 3, 3, 3, 3, 2, 4, 0, 1, 3, 3, 2},
                    {2, 1, 4, 3, 2, 3, 4, 2, 3, 3, 2, 3, 3, 3, 3, 1, 0, 4, 4, 3},
                    {5, 4, 3, 5, 3, 3, 2, 4, 3, 4, 3, 4, 4, 4, 1, 5, 4, 0, 3, 4},
                    {3, 2, 2, 3, 3, 3, 1, 1, 1, 2, 2, 1, 1, 2, 1, 3, 2, 1, 0, 3},
                    {1, 3, 3, 1, 4, 4, 2, 2, 2, 3, 2, 2, 2, 3, 2, 4, 3, 2, 1, 0},
                };
        assertArrayEquals(cost, solution);
    }

    @Test
    public void Graph_with_Negative_Cycles_1_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 14.txt");
        int[] cost = new int[20];
        int[] parents  = new int[20] ;

        boolean solution = !graph.bellmanFord(0, cost, parents); ;

        assertTrue(solution) ;
    }

    @Test
    public void Graph_with_Negative_Cycles_1_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 14.txt");
        int[][] cost = new int[20][20];
        int[][] parents  = new int[20][20] ;

        boolean solution = !graph.floydWarshall(cost, parents); ;

        assertTrue(solution) ;
    }

    @Test
    public void Graph_with_Negative_Cycles_2_Bellman_Ford(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 15.txt");
        int[] cost = new int[20];
        int[] parents  = new int[20] ;

        boolean solution = !graph.bellmanFord(0, cost, parents); ;

        assertTrue(solution) ;

    }

    @Test
    public void Graph_with_Negative_Cycles_2_Floyd_Warshall(){
        Graph graph = new Graph("D:\\Test Cases\\src\\test\\java\\org\\example\\Test 15.txt");
        int[][] cost = new int[20][20];
        int[][] parents  = new int[20][20] ;

        boolean solution = !graph.floydWarshall(cost, parents); ;

        assertTrue(solution) ;
    }

}