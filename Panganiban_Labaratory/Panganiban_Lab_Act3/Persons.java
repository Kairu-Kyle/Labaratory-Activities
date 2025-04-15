import java.util.Scanner;
public class Persons { 
    
    private String name; 
    private int id;

    //consturctor
    public Persons(String name, int id) { 

        this.name = name; 
        this.id = id;

    }

    public String getName() { return name; } 
    public int getId() { return id; } 
 
    // method for displaying information
    public void displayInfo() { 

        System.out.println("Name: " + name); 
        System.out.println("Id no.: " + id);  
    }
        public class schoolTest {
            public static void main(String[] args) { 
                Scanner s = new Scanner(System.in);
        
                //input for student, teacher, and staff
                System.out.println("###########################");
                System.out.println("Enter Student:");
                System.out.print("Name: ");
                String studentName = s.nextLine();
                System.out.print("ID: ");
                int studentId = s.nextInt();
                s.nextLine();  
                System.out.print("Grade Level: ");
                String gradeLevel = s.nextLine();
                System.out.println("###########################");
               
                System.out.println("###########################");
                System.out.println("Enter Teacher :");
                System.out.print("Name: ");
                String teacherName = s.nextLine();
                System.out.print("ID: ");
                int teacherId = s.nextInt();
                s.nextLine();  
                System.out.print("Subject: ");
                String subject = s.nextLine();
                System.out.println("###########################");
        
                System.out.println("###########################");
                System.out.println("Enter Staff: ");
                System.out.print("Name: ");
                String staffName = s.nextLine();
                System.out.print("ID: ");
                int staffId = s.nextInt();
                s.nextLine();
                System.out.print("Department: ");
                String department = s.nextLine();
                System.out.println("###########################");
        
                //objects
                Students student = new Students(studentName, studentId, gradeLevel);
                Persons teacher = new Teachers(teacherName, teacherId, subject);
                Persons staff = new Staff(staffName, staffId, department);
        
                //display input
                System.out.println("###########################");
                System.out.println("\nStudent: ");
                student.displayInfo();
        
                System.out.println("\nTeacher: ");
                teacher.displayInfo();
        
                System.out.println("\nStaff: ");
                staff.displayInfo();
                System.out.println("");
                System.out.println("###########################");
            }
        }
    } 


