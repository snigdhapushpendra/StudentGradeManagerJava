import java.util.*;

class Student {
    String name;
    int rollNo;
    int marks;

    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks + ", Grade: " + getGrade());
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. View All Students\n3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    students.add(new Student(name, rollNo, marks));
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    System.out.println("\n--- Student Records ---");
                    for (Student s : students) {
                        s.display();
                    }
                    break;

                case 3:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        } while (choice != 3);

        sc.close();
    }
}