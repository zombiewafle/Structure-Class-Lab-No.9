import Classes.ShorttestPath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        long matriza[][]={
                {0,64,1000000000,1000000000,9,1000000000,1000000000,1000000000},
                {1000000000,0,25,1000000000,2,1000000000,1000000000,1000000000},
                {1000000000,1000000000,0,7,1000000000,1000000000,1000000000,1000000000},
                {1000000000,1000000000,1000000000,0,1000000000,1000000000,1000000000,7},
                {1000000000,1000000000,1000000000,1000000000,0,1,1000000000,1000000000},
                {1000000000,1,5,1000000000,1000000000,0,1000000000,1000000000},
                {1000000000,1000000000,1000000000,1000000000,1000000000,1000000000,0,1000000000},
                {1000000000,1000000000,1000000000,1000000000,1000000000,1000000000,6,0}
        };

        ShorttestPath path = new ShorttestPath();
        System.out.println(path.FloydAlgorithm(matriza));

    }
}


