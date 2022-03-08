public class LabAssistant extends AssistantLecturer{
    public LabAssistant(String nameSurname, String phoneNumber, String email,
                        String department, String title, String officeHours) {
        super(nameSurname, phoneNumber, email, department, title, officeHours);
    }
    public void attendClass(){
        System.out.println(this.getNameSurname() + " -> Lab Asistanı derse girdi.");
    }
    public void attendLab(){
        System.out.println(this.getNameSurname() + " -> Lab Asistanı Laboratuar'a girdi.");
    }
}
