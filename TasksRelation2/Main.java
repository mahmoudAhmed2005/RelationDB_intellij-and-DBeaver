package TasksRelation2;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


  Doctor doctor1 = new Doctor(1L,"Mohamed",20.0);
  Doctor doctor2 = new Doctor(2L,"Mahmoud",30.0);
  Doctor doctor3 = new Doctor(3L,"Ahmed",40.0);

  Pationt pationt1 = new Pationt(1L,"All",20);
  Pationt pationt2 = new Pationt(1L,"yousef",22);
  Pationt pationt3 = new Pationt(1L,"Omar",25);


        doctor1.setPationts(Arrays.asList(pationt1,pationt2,pationt3));
        doctor2.setPationts(Arrays.asList(pationt2,pationt3));
        doctor3.setPationts(Arrays.asList(pationt3));


        pationt1.setDoctor(Arrays.asList(doctor1));
        pationt2.setDoctor(Arrays.asList(doctor1,doctor2));
        pationt3.setDoctor(Arrays.asList(doctor1,doctor2,doctor3));


        System.out.println(doctor1);
        doctor1.getPationts().stream().forEach(pationt -> System.out.println(pationt));





    }
}