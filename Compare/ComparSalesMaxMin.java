package Compare;

import java.util.Comparator;

import Object.Noutbook;

public class ComparSalesMaxMin implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int tmp = ((Noutbook)o2).sales - ((Noutbook)o1).sales;
        if (tmp == 0){
            tmp = ((Noutbook)o2).ddr - ((Noutbook)o1).ddr;
        }
        return tmp;

    }


    
}
