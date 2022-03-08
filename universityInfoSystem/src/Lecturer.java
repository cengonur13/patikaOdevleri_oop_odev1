public class Lecturer extends Academics{
    private String doorNumb;

    public Lecturer(String nameSurname, String phoneNumber, String email,
                    String department, String title, String doorNumb) {
        super(nameSurname, phoneNumber, email, department, title);
        this.doorNumb = doorNumb;
    }


    public String getDoorNumb() {
        return doorNumb;
    }

    public void setDoorNumb(String doorNumb) {
        this.doorNumb = doorNumb;
    }

    public void senateMeeting(){
        System.out.println(this.getNameSurname() + " senato toplantisina katildi.");
    }

    public void makeExam(){
        System.out.println(this.getNameSurname() + " sinav yapmaktadir.");
    }

    @Override
    public void giris() {
        System.out.println(this.getNameSurname() + " A kapisindan giris yapti!");
    }

    @Override
    public void cikis() {
        System.out.println(this.getNameSurname() + " A kapisindan cikis yapti!");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getNameSurname() + " Yemekhanede bulunmaktadir.");
    }

    @Override
    public void derseGir() {
        System.out.println(this.getNameSurname() + " Derse basladi! ");
    }
}
