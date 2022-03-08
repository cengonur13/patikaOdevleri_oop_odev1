public class ITDepartment extends Officer{

    private String job;


    public ITDepartment(String nameSurname, String phoneNumber, String email,
                        String department, String workingHours, String job) {
        super(nameSurname, phoneNumber, email, department, workingHours);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void networkSetup(){
        System.out.println(this.getNameSurname() + " Network Kurulumuna basladi.");
    }

    @Override
    public void giris() {
        System.out.println(this.getNameSurname() + " F kapisindan giris yapti! ");
    }

    @Override
    public void cikis() {
        System.out.println(this.getNameSurname() + " F kapisindan cikis yapti! ");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getNameSurname() + " Yemekhanede bulunmaktadir. ");
    }
}
