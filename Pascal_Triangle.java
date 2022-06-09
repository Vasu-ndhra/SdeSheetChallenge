
import java.util.ArrayList;
import java.util.*;
public class Pascal_Triangle {
    public static List<List<Integer>> generate(int n){
        List<List<Integer>> result = new ArrayList(n);
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 2).get(j) + result.get(i - 2).get(j - 1));
                }
                result.add(row);
            }
        }
        return result;
    }
}

