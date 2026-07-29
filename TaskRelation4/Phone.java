package TaskRelation4;

public class Phone {

    private long id;
    private  String phoneNumber;

    private Emplyee emplyee;

    public Phone() {
    }

    public Phone(long id, String phoneNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Emplyee getEmplyee() {
        return emplyee;
    }

    public void setEmplyee(Emplyee emplyee) {
        this.emplyee = emplyee;
    }
}
