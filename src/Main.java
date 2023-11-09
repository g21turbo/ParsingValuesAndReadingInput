public class Main {
    public static void main(String[] args) {

        int currentYear = 2023;
        String usersDateOfBirth = "1985";

        int dateOfBirth = Integer.parseInt(usersDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));


    }
}