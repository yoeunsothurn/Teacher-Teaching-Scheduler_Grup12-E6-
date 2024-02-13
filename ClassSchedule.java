import java.util.ArrayList;
import java.util.Scanner;

class ClassSchedule {
   
    private String Subjectstaught;
    private String className;
    private String day; 
    private String time;

    public ClassSchedule(String Subjectstaught,String className, String day, String time ) {
        
        this.Subjectstaught = Subjectstaught;
        this.className = className;
        this.day = day;
        this.time = time;
    }
    public String getSubjectstaught(){
        return Subjectstaught;
    }
    public String getClassName() {
        return className;
    }

    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    

    

    @Override
    public String toString() {
        return "Subjectstaught: " + Subjectstaught +"\tClass: " + className + "\tDay: " + day + "\tTime: " + time;
    }
}

class TeacherScheduler {
    private ArrayList<ClassSchedule> schedule;
    private Scanner scanner;

    public TeacherScheduler() {
        schedule = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    public void addinformation() {
        System.out.println("Enter NameTeaching:");
        String NameTeaching = scanner.nextLine();

        System.out.println("Enter Skills Name:");
        String Skills = scanner.nextLine();

        System.out.println("Enter Gender:");
        String Gender = scanner.nextLine();

        System.out.println("Enter Age:");
        String Age = scanner.nextLine();
        
        // System.out.println("Enter Nationality:");
        // String Nationality = scanner.nextLine();

        ClassSchedule newinformation = new ClassSchedule(NameTeaching, Skills, Gender, Age);
        schedule.add(newinformation);
        System.out.println("Class added successfully!");
    }
        public void viewinformation() {
        if (schedule.isEmpty()) {
            System.out.println("No classes scheduled.");
        } else {
            System.out.println("Teacher Schedule:");
            for (ClassSchedule classSchedule : schedule) {
                System.out.println(classSchedule);
            }
        }
    }
    
        public void addClass() {
        System.out.println("Enter Subjectstaught:");
        String Subjectstaught = scanner.nextLine();

        System.out.println("Enter Class Name:");
        String className = scanner.nextLine();

        System.out.println("Enter Day:");
        String day = scanner.nextLine();

        System.out.println("Enter Time:");
        String time = scanner.nextLine();

        ClassSchedule newClass = new ClassSchedule(Subjectstaught, className, day, time);
        schedule.add(newClass);
        System.out.println("Class added successfully!");
    }

    public void viewSchedule() {
        if (schedule.isEmpty()) {
            System.out.println("No classes scheduled.");
        } else {
            System.out.println("Teacher Schedule:");
            for (ClassSchedule classSchedule : schedule) {
                System.out.println(classSchedule);
            }
        }
    }

    public void deleteClass() {
        System.out.println("Enter the name of the class to delete:");
        String className = scanner.nextLine();

        boolean found = false;
        for (ClassSchedule classSchedule : schedule) {
            if (classSchedule.getClassName().equalsIgnoreCase(className)) {
                schedule.remove(classSchedule);
                found = true;
                System.out.println("Class deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Class not found in the schedule.");
        }
    }
}