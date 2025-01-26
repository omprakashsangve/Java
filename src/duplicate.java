import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class duplicate {

    public static void main (String []args ){

        String str = "java py java py 123 py 123";

        String [] split = str.split(" ");

        Map<String,Integer> map = new HashMap<String,Integer>();

        System.out.println(Arrays.toString(split));
//
//        for(int i= 0; i<split.length; i++){
//
//            map.put(split[i],1);
//
//            if (map.containsKey(split[i])){
//                int k = map.get(split[i]);
//                int l = k+1;
//                map.put(split[i], l);
//            }
//
//
//        }
        for (int i = 0; i < split.length; i++) {
            map.put(split[i], map.getOrDefault(split[i], 0) + 1); // Correctly increment counts
        }

        System.out.print(map);

    }
}
