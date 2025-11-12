public class ConditionalStatements {
    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        String day = "Monday";
        switch (day) {
            case "Monday":
                System.out.println("Start of the work week.");
                break;
            case "Friday":
                System.out.println("End of the work week.");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("Midweek day.");
                break;
        }
    }
}