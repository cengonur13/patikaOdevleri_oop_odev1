public class SecurityOfficer extends Officer{

    private String document;

    public SecurityOfficer(String nameSurname, String phoneNumber, String email,
                           String department, String workingHours, String document) {
        super(nameSurname, phoneNumber, email, department, workingHours);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public void keepGuard(){
        System.out.println(this.getNameSurname() + " nöbet tutmaya basladi.");
    }

    @Override
    public void giris() {
        System.out.println(this.getNameSurname() + " G kapisindan giris yapti! ");
    }

    @Override
    public void cikis() {
        System.out.println(this.getNameSurname() + " G kapisindan cikis yapti! ");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getNameSurname() + " Yemekhanede bulunmaktadir. ");
    }
}
