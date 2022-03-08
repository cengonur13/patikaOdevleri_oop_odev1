public class AssistantLecturer extends Academics{

    private String officeHours;

    public AssistantLecturer(String nameSurname, String phoneNumber,
                             String email, String department, String title, String officeHours) {
        super(nameSurname, phoneNumber, email, department, title);
        this.officeHours = officeHours;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    public void makeQuiz(){
        System.out.println(this.getNameSurname() + " Quiz düzenledi.");
    }

    @Override
    public void giris() {
        System.out.println(this.getNameSurname() + " C kapisindan giris yapti! ");
    }

    @Override
    public void cikis() {
        System.out.println(this.getNameSurname() + " C kapisindan cikis yapti! ");
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
