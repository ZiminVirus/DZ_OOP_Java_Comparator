package Compare;

import java.util.Comparator;

import Object.Noutbook;

public class ComparSalesMinMax implements Comparator {
    
    @Override
    public int compare(Object o1, Object o2) {
            int tmp = ((Noutbook)o1).sales - ((Noutbook)o2).sales;
            if (tmp == 0){
                tmp = ((Noutbook)o2).ddr - ((Noutbook)o1).ddr;
            }
            return tmp;
    }
    
}
