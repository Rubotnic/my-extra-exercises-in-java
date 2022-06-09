package se.lexicon;

public class Main {
    public static void main(String[] args) {// start of a method

/*
1. Create a String with your first name as content . Print out the String
object to the console
*/
        String myNam = "Rob";
        System.out.print(myNam);

/*
2.Create two Strings. One with your first name and the other with your
last name . Print out both Strings to the console with a ” ” separating them
*/
        String myNam1 = "Rob";
        String laNam = "Last name";
        System.out.print(myNam1 + laNam);

/*
3. Create two variables with decimal values. Create a third decimal
variable called result . Assign the sum of the two first variables to
result
*/
        double deciNum1 = 2.2;
        double deciNum2 = 1.1;
        double result = deciNum1 + deciNum2;
        System.out.print(result);

/*
4. Create a class called Car. The class should contain the following
information. Car brand, registration number , max speed, owner name
and one more attribute of your choice. Instantiate an Object of the
class and assign values to the object
 */
        class Car {
            String brandNam;
            String regNum;
            String maxSpe;
            String ownNam;
            String color;
        }
        Car volvo = new Car();
        volvo.brandNam = "Volvo";
        volvo.regNum = "PRO888";
        volvo.maxSpe = "50";
        volvo.ownNam = "Rob";
        volvo.color = "red";

        String carInfo = "This " + volvo.brandNam + " has registration number " + volvo.regNum + " and have max speed " + volvo.maxSpe + "km/h and have color " + volvo.color + " and the owner is " + volvo.ownNam + ".";

        System.out.println(carInfo);


    }

}

/*
5. Make an integer called score and assign a value to it.
Create an if statement that should print out Hurray , You passed !”
if the score is above or equals to 65 .
If the score is Equal or between 55 and 64 it should print ” You are almost there .”.
If score is below 55 it should print ”Sorry, You did not pass.”.
 */

    {
        int score = 54;

        if (score >= 65) {
            System.out.println("Hurray , You passed!");
        } else if (grade < 65 && grade >= 55) {
            System.out.println("You are almost there.");
        } else {
            System.out.println("Sorry, You did not pass. :(");
        }
    }

/*
6. Being a developer you need to learn how to search for information on the Internet.
Open up a web browser and search for ”java input from user".
https://stackoverflow.com/users/19139160/jozsef-babits?tab=profile
 */


    /*
    7. Use your new knowledge to take a String as input from the user and store it in
    a String object.
     */

        class User {
            String firstNam;
            String lastNam;
            String proLang;
        }
        User josef = new User();
        josef.firstNam = "Josef";
        josef.lastNam = "B";
        josef.proLang = "JAVA";

        String userInfo = "Users name is " + josef.firstNam + " and his last name is " + josef.lastNam + " and he is practicing " + josef.proLang + ".";
        System.out.println(userInfo);

        {
        }
    }
}
