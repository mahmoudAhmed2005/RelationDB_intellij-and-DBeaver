package TaskRelation4;

public class Main {


    public static void main(String[] args) {


     Emplyee emplyee = new Emplyee(1L,"Mahmoud",21);
     Phone phone = new Phone(1L,"123456789");

     emplyee.setPhone(phone);
     phone.setEmplyee(emplyee);

        System.out.println(emplyee.getPhone().getPhoneNumber());
        System.out.println(phone.getEmplyee().getName());





    }
}