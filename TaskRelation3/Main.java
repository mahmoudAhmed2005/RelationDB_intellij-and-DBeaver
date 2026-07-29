package TaskRelation3;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

       Languges languges = new Languges(1L,"Italy");

       Tetcher tetcher1 = new Tetcher(1L,"Mahmoud", 20.0);
        Tetcher tetcher2 = new Tetcher(2L,"Ahmed", 30.0);


        List<Tetcher>tetchers=new ArrayList<>();
        tetchers.add(tetcher1);
        tetchers.add(tetcher2);

        languges.setTetchers(tetchers);

        tetcher1.setLanguges(languges);
        tetcher2.setLanguges(languges);


        languges.getTetchers().stream().forEach(tetcher -> System.out.println(tetcher.getName()));
        System.out.println(tetcher1.getLanguges().getName());







    }
}