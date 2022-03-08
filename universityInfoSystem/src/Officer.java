public abstract class Officer extends Worker{

    private String department;
    private String workingHours;


    public Officer(String nameSurname, String phoneNumber, String email, String department, String workingHours) {
        super(nameSurname, phoneNumber, email);
        this.department = department;
        this.workingHours = workingHours;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(String workingHours) {
        this.workingHours = workingHours;
    }
    public void work(){
        System.out.println(this.getNameSurname() + " calismaya basladi.");
    }

    @Override
    public abstract void giris();

    @Override
    public abstract void cikis();

    @Override
    public abstract void yemekhane();
}
