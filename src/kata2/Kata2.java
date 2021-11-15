package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer[] data = {1,1,3,4,5,3,7,9,15,9,9,15,15,10,9};
        Histogram histo = new Histogram(data);
        Map<Integer, Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()){
            System.out.println(key + "==>" + histogr.get(key));
        }
             
        
    }
    
}
