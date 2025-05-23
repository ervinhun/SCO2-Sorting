package visualizealgorithms;

//Project imports
import visualizealgorithms.bll.algorithm.BubbleSort;
import visualizealgorithms.bll.algorithm.IAlgorithm;
import visualizealgorithms.bll.algorithm.InsertionSort;
import visualizealgorithms.bll.algorithm.SelectionAlgorithm;

//Java imports
import java.util.ArrayList;

/**
 * Convenience class that adds algorithms and handles inputs
 */
public class AlgorithmLoader {

    private String inputs = "";
    private ArrayList<IAlgorithm> algorithms = new ArrayList<>();

    public AlgorithmLoader() {
        //Modify default inputs
        inputs = "1000;2000;4000;8000;16000;32000;64000;";
        algorithms.add(new BubbleSort());
        algorithms.add(new SelectionAlgorithm());
        algorithms.add(new InsertionSort());
        //Add implemented/selected algorithms here..


        //more algorithms here :)
    }

    public String getInputs() {
        return inputs;
    }

    public ArrayList<IAlgorithm> getAlgorithms() {
        return algorithms;
    }
}
