package Compare;

import java.util.Comparator;

import Object.Noutbook;

public class CompareID implements Comparator {

    @Override
    public int compare(Object o1, Object o2){ 
    int tmp = (int)(((Noutbook)o1).id - ((Noutbook)o2).id);
    return tmp;
    }
       
}
