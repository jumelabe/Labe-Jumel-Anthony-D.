import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student person = new Student();

        System.out.print("Enter First Name: ");
        person.setFirstName(scanner.nextLine());

        System.out.print("Enter Middle Name: ");
        person.setMiddleName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        person.setLastName(scanner.nextLine());

        System.out.print("Enter Suffix: ");
        person.setSuffix(scanner.nextLine());

        System.out.println("Full Name: ");
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Middle Name: " + person.getMiddleName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Suffix: " + person.getSuffix());
        System.out.println("Full Name: " + getFullName(person));
    }

   
    private static String getFullName(Student person) {
        StringBuilder fullName = new StringBuilder();
        if (person.getFirstName() != null && !person.getFirstName().isEmpty()) {
            fullName.append(person.getFirstName()).append(" ");
        }
        if (person.getMiddleName() != null && !person.getMiddleName().isEmpty()) {
            fullName.append(person.getMiddleName()).append(" ");
        }
        if (person.getLastName() != null && !person.getLastName().isEmpty()) {
            fullName.append(person.getLastName());
        }
        return fullName.toString().trim();
    }
}
