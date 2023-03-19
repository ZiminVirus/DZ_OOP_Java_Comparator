package StartProgramm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Compare.ComparSalesMaxMin;
import Compare.ComparSalesMinMax;
import Compare.CompareDDRMaxMin;
import Compare.CompareID;
import Object.Noutbook;

/**
 * InnerStart
 */
public class Start {
    public static void main(String[] args) {
        int size = 100;
        // Noutbook noutbook = new Noutbook();
        // noutbook.infoNoutbook();

        List <Noutbook> noutbookList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            
            noutbookList.add(new Noutbook());
        }
        // Comparator compareDDRMaxMin = new CompareDDRMaxMin();
        // Collections.sort(noutbookList, compareDDRMaxMin);
        // System.out.println(noutbookList.toString());
        // System.out.println("");
        // System.out.println("");
        // System.out.println("");
        // Comparator compareSalesMaxMin = new ComparSalesMaxMin();
        // Collections.sort(noutbookList, compareSalesMaxMin);
        // System.out.println(noutbookList.toString());
        // System.out.println("");
        // System.out.println("");
        // System.out.println("");
        // Comparator compareSalesMinMax = new ComparSalesMinMax();
        // Collections.sort(noutbookList, compareSalesMinMax);
        // System.out.println(noutbookList.toString());
        // System.out.println("");
        // System.out.println("");
        // System.out.println("");
        Comparator compareId = new CompareID();
        Collections.sort(noutbookList, compareId);
        System.out.println(noutbookList.toString());
        // System.out.println("");
        // System.out.println("");
        // System.out.println("");









        // for (Noutbook tmp : noutbookList) {
        //     System.out.println(tmp);
            
        // }

        
    }

    
}