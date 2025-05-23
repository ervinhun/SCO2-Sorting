package visualizealgorithms.bll.algorithm;

public class InsertionSort extends GenericAlgorithm{

    public InsertionSort() {
        super("Insertion Sort", "Inserting sorts", AlgorithmType.SORTING);
    }

    @Override
    public void doWork() {
        int[] arr = (int[]) super.getData();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    @Override
    public String toString() {
        return "Insertion Sort";
    }
}
