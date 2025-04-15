public class Staff extends Persons {
    
    private String department; 

    //consturctor
    public Staff(String name, int id, String department) {
        super (name, id);
        this.department = department;
    }

    // method for displaying information
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("department: " + department);
    }
}