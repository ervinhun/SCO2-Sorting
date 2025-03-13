package visualizealgorithms.bll.algorithm;

import java.util.ArrayList;

public class SelectionAlgorithm extends GenericAlgorithm {

    private AlgorithmType type = AlgorithmType.SORTING;
    private String name = "Selection Algorithm";
    private String description = "Selection Sort is a comparison-based sorting algorithm." +
            " It sorts an array by repeatedly selecting the smallest (or largest) element " +
            "from the unsorted portion and swapping it with the first unsorted element. " +
            "This process continues until the entire array is sorted.";
    private Object data;

    public SelectionAlgorithm() {
        super("Selection Algorithm", "Selection Sort is a comparison-based sorting algorithm." +
                " It sorts an array by repeatedly selecting the smallest (or largest) element " +
                "from the unsorted portion and swapping it with the first unsorted element. " +
                "This process continues until the entire array is sorted.", AlgorithmType.SORTING);

    }


    @Override
    public void doWork() {

        int[] arr = (int[]) super.getData();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length-1; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    @Override
    public String toString() {
        return name;
    }
}
