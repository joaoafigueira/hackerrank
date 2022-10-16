package logicproblems;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int squareMatrixSize = arr.size();

        int d1 = 0;

        int d2 = 0;


        for (int i = 0; i < squareMatrixSize; i++) {

            d1 = d1 + arr.get(i).get(i);
            d2 = d2 + arr.get(i).get(squareMatrixSize - 1 - i);

        }

        return (Math.abs(d1 - d2));

    }

}
