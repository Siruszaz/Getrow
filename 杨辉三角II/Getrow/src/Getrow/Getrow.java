package Getrow;

import java.util.ArrayList;
import java.util.List;

public class Getrow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<Integer>();
        long nk = 1;
        for (int i = 0; i <= rowIndex; i++) {
            res.add((int)nk);
            nk = nk * (rowIndex - i) / (i + 1);
        }
        return res;
    }
}
