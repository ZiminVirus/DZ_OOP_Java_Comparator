package Object;
import java.util.Comparator;
import java.util.Random;

/**
 * Noutbook
 */
public class Noutbook{
    static public long counter;
    public Long id;
    public int sales;
    public int ddr;
    static public Random num;

    static{
        Long counter = 1L;
        num = new Random();
    }


    public Noutbook (){
        this.id = counter++;
        this.sales = num.nextInt(30000, 100000);
        this.ddr = num.nextInt(4,36);
    }

    public void infoNoutbook() {
        System.out.format("Noutbook_id: %s  sales: %d  ddr: %s", this.id, this.sales, this.ddr);        
    }

    @Override
    public String toString() {
        return String.format("Noutbook_id: %s  sales: %d  ddr: %s" + "\n", this.id, this.sales, this.ddr + "\n");
    }




    
}