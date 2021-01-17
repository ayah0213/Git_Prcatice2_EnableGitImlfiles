package day4;

public class main {
    public static void main(String[] args) {



    /*
    What are the qualifications to join the Army?
You must be a U.S. citizen or a resident alien.
Be between the ages of 17-34. ...
Have a high school diploma.
Have no more than two dependents.
     */

        String citizen = "USA";
        boolean isResident = true;
        boolean isAlien = true;
        boolean hasHighSchoolDiploma = true;
        int numberOfDependent = 3;
        int age = 25;


        if (citizen == "USA" || isResident || isAlien) {

            if (numberOfDependent <= 2) {
                System.out.println("You re qualified for US army");
            } else {
                System.out.println("You must have no more than 2 dependents");
            }

            if (age >= 17 && age <= 34) {


                if (hasHighSchoolDiploma) {
                } else {
                    System.out.println("Must have high school diplpoma");
                }

            } else {
                System.err.println("Be between the ages of 17-34 years old");
            }
        } else {
            System.out.println("You must be a U.S. citizen or a resident alien.\");");
        }

    }

}
