public abstract class Academics extends Worker{

    private String department;
    private String title;

    public Academics(String nameSurname, String phoneNumber, String email, String department, String title){
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.title = title;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public abstract void giris();

    @Override
    public abstract void cikis();

    @Override
    public abstract void yemekhane();

    public abstract void derseGir();
}
