public class Teachers extends Persons{
    
    private String subject; 

    //consturctor
    public Teachers(String name, int id, String subject) {
        super (name, id);
        this.subject = subject;
    }

    // method for displaying information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}