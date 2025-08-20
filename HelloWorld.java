import java.util.Scanner;

// INTRODUCTION ---
/*
class HelloWorld {


    static int age;

    public static void main(String[] arguments) {

        int age = 27;

        System.out.println("I am " + age + " years old.");
    }
}


// DATA TYPES PRACTICE ---

class HelloWorld {
    public static void main(String[] args) {
        // integer types:
        byte aSingleByte = 100;
        short aSmallNumber = 20000;
        int anInteger = 2147483647;
        long aLargeNumber = 2147483648L;

        // decimal places:
        double aDouble = 1.7976923;
        float aFloat = 3.141592F;

        // booleans:
        boolean isWeekend = false;
        boolean isWorkDay = true;

        // characters
        char percentageSymbol = '%';

        System.out.println("This is a percentage symbol: " + percentageSymbol);
    }
}


// OPERATORS PRACTICE ---


class HelloWorld {
    public static void main(String[] args) {
        double number1 = 5.8;
        int number2 = (int)number1;

        System.out.println(number2);

        int number1 = 12;
        int number2 = 6;

        System.out.println(number1 + number2);

        System.out.println(number1 - number2);

        System.out.println(number1 * number2);

        System.out.println(number1 / number2);

        System.out.println(number1 % number2);




        int number = 12;

        number %= 2;

        System.out.println(number);



        int number1 = 12;
        int number2 = 15;

        System.out.println(number1 == number2);

        System.out.println(number1 != number2);

        System.out.println(number1 > number2);

        System.out.println(number1 < number2);

        System.out.println(number1 >= number2);

        System.out.println(number1 <= number2);



        int age = 25;

        System.out.println(age >= 18 && age <= 40);



        boolean isStudent = false;
        boolean isLibraryMember = true;

        System.out.println(isStudent || isLibraryMember);

        System.out.println(!isStudent);



        int score = 0;
        int turns = 10;

        score++;
        turns--;

        System.out.println(score);
        System.out.println(turns);



        int number = 55;

        number++;

        System.out.println(number++);
        System.out.println(number--);
        System.out.println(number);


    }
}*/

// STRINGS PRACTICE ---

/*
class HelloWorld {
    public static void main(String[] args) {
        char percentSign = '%';

        System.out.println(percentSign);



        String name = "Farhan Hasin Chowdhury";

        String name = new String("Farhan Hasin Chowdhury");

        System.out.println(name);



        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1 == literalString2);
        System.out.println(objectString1 == objectString2);



        String name = "Farhan Hasin Chowdhury";
        String country = "Bangladesh";
        int age = 26;
        String company = "freeCodeCamp";
        double gpa = 3.8;
        char percentageSign = '%';
        boolean amITellingTheTruth = false;

        //System.out.println("Hello, my name is " + name + ". I am from " + country + " and I am " + age + " years old. I work for " + company + ".");
        String formattedString = String.format("My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims.", name, country, age, company, gpa, percentageSign, amITellingTheTruth);

        System.out.println(formattedString);



        String name = "Farhan Hasin Chowdhury";

        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.isEmpty());
        name = "";
        System.out.println(name.isEmpty());



        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1.equals(string2));
        System.out.println(string1.equalsIgnoreCase(string2));



        String string = "The sky is blue.";

        String updatedString = string.replace("blue", "red");

        System.out.println(updatedString);

        System.out.println(string.contains("freeCodeCamp"));

    }
}

         */

// USER INPUTS PRACTICE ---

/*
class HelloWorld{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.printf("Hello %s. Howe old are you?", name);
        int age = Integer.parseInt(scanner.nextLine());

        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.printf("%d is an excellent age to start programming. What language do you prefer?", age);
        String language = scanner.nextLine();

        System.out.printf("%s is a great programming language.", language);

        scanner.close();
    }
}

 */


// CONDITIONAL STATEMENTS PRACTICE ---

class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        double number2 = scanner.nextDouble();

        System.out.print("Enter the operation you would like to perform: ");
        String operation = scanner.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }
        else if(operation.equals("sub")){
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        }
        else if(operation.equals("mul")){
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        }
        else if(operation.equals("div")){
            if(number2 != 0) {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
            else {
                System.out.println("Cannot divide by zero");
            }
        }
        else{
            System.out.println("Invalid operation");
        }
        scanner.close();
    }
}