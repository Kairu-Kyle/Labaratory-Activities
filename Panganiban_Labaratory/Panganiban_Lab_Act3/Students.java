public class Students extends Persons{
    
    private String gradeLevel; 

    //consturctor
    public Students(String name, int id, String gradeLevel) {
        super (name, id);
        this.gradeLevel = gradeLevel;
    }

    // method for displaying information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Grade Level: " + gradeLevel);
    }
}