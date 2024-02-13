import java.util.Scanner;

public class TeacherSchedulerApp {
    public static void main(String[] args) {
        TeacherScheduler teacherScheduler = new TeacherScheduler();
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nTeacher Teaching Scheduler");
                System.out.println("1. Add Information Teacher");
                System.out.println("2. Add Class");
                System.out.println("3. View Schedule");
                System.out.println("4. Delete Class");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    // case 1:
                    //     teacherScheduler.addinformation();
                    //     break;
                    case 1:
                        teacherScheduler.addClass();
                        break;
                    case 2:
                        teacherScheduler.viewSchedule();
                        break;
                    case 3:
                        teacherScheduler.deleteClass();
                        break;
                    case 4:
                        System.out.println("Exiting the Teacher Teaching Scheduler. Goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }
    }

    @Override
    public String toString() {
        return "TeacherSchedulerApp []";
    }
}