import java.util.Scanner;

public class Busroutes {
   
      
   
    public static void main(String[] args) {

        System.out.println("WELCOME TO LOVEBEE TRANSPORTATION");
        System.out.println();
        System.out.println("Default Routes:\nCebu City    (Start)\nMinglanilla  (Route 1)\nSan fernando (Route 2)\nCarcar       (Route 3)\nBarili       (Route 4.1)\nDumanjug     (Route 4.1.1)\nAlcantara    (Route 4.1.2)\nMoalboal     (End)");
        System.out.println();
        Scanner s = new Scanner(System.in);

        System.out.println("Is Barili Obstructed? (Y = YES, N = NO)");
        String barili = getValidInput(s);
        double bariliDistance = 84.9;
        String recommendedRoute = "";

        if (barili.equalsIgnoreCase("N")) {
            System.out.print("Enter the speed of the vehicle (km/hr): ");
            int vehicleSpeed = getValidSpeedInput(s);
            System.out.println();
            recommendedRoute = "Recommended Routes:\n\nCebu City    (Start)\nMinglanilla  (Route 1)\nSan fernando (Route 2)\nCarcar       (Route 3)\nBarili       (Route 4.1)\nDumanjug     (Route 4.1.1)\nAlcantara    (Route 4.1.2)\nMoalboal     (End)";
            double timeToReachBarili = bariliDistance / vehicleSpeed;
            int hours = (int) timeToReachBarili;
            int minutes = (int) ((timeToReachBarili - hours) * 60);
            System.out.println(recommendedRoute);
            System.out.println();
            System.out.println("Speed: " + vehicleSpeed + " km/hr");
            System.out.println("Distance: " + bariliDistance + " km");
            System.out.println("Estimated Time of Arrival (ETA): " + hours + " hours and " + minutes + " minutes");
        } else {
            System.out.println("Is Dumanjug Obstructed? (Y = YES, N = NO)");
            String dumanjug = getValidInput(s);
            double sibongaDumanjugDistance = 94.0;

            if (dumanjug.equalsIgnoreCase("N")) {
                System.out.print("Enter the speed of the vehicle (km/hr): ");
                int vehicleSpeed = getValidSpeedInput(s);
                System.out.println();
                recommendedRoute = "Recommended Routes:\n\nCebu City    (Start)\nMinglanilla  (Route 1)\nSan fernando (Route 2)\nCarcar       (Route 3)\nSibonga      (Route 4.2)\nDumanjug     (Route 4.2.1)\nAlcantara    (Route 4.2.2)\nMoalboal     (End)";
                double timeToReachSibongaDumanjug = sibongaDumanjugDistance / vehicleSpeed;
                int hours = (int) timeToReachSibongaDumanjug;
                int minutes = (int) ((timeToReachSibongaDumanjug - hours) * 60);
                System.out.println(recommendedRoute);
                System.out.println();
                System.out.println("Speed: " + vehicleSpeed + " km/hr");
                System.out.println("Distance: " + sibongaDumanjugDistance + " km");
                System.out.println("Estimated Time of Arrival (ETA): " + hours + " hours and " + minutes + " minutes");
            } else {
                System.out.println("You are going to MOALBOAL via ARGAO! ");
                System.out.print("Enter the speed of the vehicle (km/hr): ");
                int vehicleSpeed = getValidSpeedInput(s);
                System.out.println();
                System.out.println("Recommended Routes:\n\nCebu City    (Start)\nMinglanilla  (Route 1)\nSan fernando (Route 2)\nCarcar       (Route 3)\nSibonga      (Route 4.2)\nArgao        (Route 5)\nAlcantara    (Route 5.1)\nMoalboal     (End)");
                double argaoDistance = 92.3;
                double timeToReachArgao = argaoDistance / vehicleSpeed;
                int hours = (int) timeToReachArgao;
                int minutes = (int) ((timeToReachArgao - hours) * 60);
                System.out.println(recommendedRoute);
                System.out.println();
                System.out.println("Speed: " + vehicleSpeed + " km/hr");
                System.out.println("Distance: " + argaoDistance + " km");
                System.out.println("Estimated Time of Arrival (ETA): " + hours + " hours and " + minutes + " minutes");
            }
        }
    }
    
    public static String getValidInput(Scanner s) {
        String input;
        boolean validInput = false;

        do {
            input = s.next().toUpperCase(); // Convert the input to uppercase for case insensitivity

            if (input.equals("Y") || input.equals("N")) {
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter 'Y' for YES or 'N' for NO.");
                
            }
        } while (!validInput);
          
        return input;
    }
    
    public static int getValidSpeedInput(Scanner s) {
        int vehicleSpeed = 0;
        boolean validInput = false;

        do {
            if (s.hasNextInt()) {
                vehicleSpeed = s.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid speed (an integer).");
                 System.out.print("Enter the speed of the vehicle (km/hr):");
                s.next(); // Consume the invalid input
            }
        } while (!validInput);

        return vehicleSpeed;
    }
}