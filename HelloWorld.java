import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.time.LocalDate;

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
/*


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

        switch(operation){
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                if(number2 != 0) {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                    break;
                }
                else{
                    System.out.println("Cannot divide by 0");
                    break;
                }
            default:
                System.out.println("Invalid operation");
                break;
        }

        scanner.close();
    }
}
*/


// ARRAY PRACTICE ---

/*class HelloWorld {
    public static void main(String[] args) {
        //char vowels[] = {'a', 'u', 'o', 'i', 'e'};

        //Arrays.sort(vowels);

        int startingIndex = 1;
        int endingIndex = 4;
        //char key = 'b';

        //int foundItemIndex = Arrays.binarySearch(vowels, key);

        //System.out.println(Arrays.toString(vowels));
        //System.out.println(foundItemIndex);

        //Arrays.fill(vowels, startingIndex, endingIndex, 'x');

        //System.out.println(Arrays.toString(vowels));


        int numbers[] = {1, 2, 3, 4, 5};

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        System.out.println(numbers == copyOfNumbers);
        System.out.println(Arrays.equals(numbers, copyOfNumbers));

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(numbers == copyOfNumbers);
        System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
}

 */


// FOR LOOPS PRACTICE ---
/*


public class HelloWorld {
    public static void main(String[] args) {

        //int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //int sum = 0;

        //for(int index = 1; index < numbers.length; index++) {
            //System.out.print(numbers[index]);

            //sum += numbers[index];
        //}
        //System.out.println(sum);

        //int number = 5;

        //for(int mult = 1; mult < 10; mult++){
            //System.out.printf("%d X %d = %d\n", number, mult, number*mult);
        //}

        //for(int number = 1; number < 10; number++) {
            //for(int multiplier = 1; multiplier < 10; multiplier++) {
                //System.out.printf("%d X %d = %d \n\n", number, multiplier, number*multiplier);
            //}
        //}

        int numbers[] = {1, 2, 3, 4, 5};

        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}

 */

// WHILE LOOPS PRACTICE ---

/*public class HelloWorld {
    public static void main(String[] args) {
        int number = 5;
        int multiplier = 1;

        //while(multiplier <= 10){
            //System.out.printf("%d X %d = %d",number,  multiplier, number*multiplier);

            //multiplier++;
        //}

        do{
            System.out.printf("%d * %d = %d", number, multiplier, number*multiplier);

            multiplier++;
        }while(multiplier <= 10);
    }
}

 */

// ARRAYLIST PRACTICE ---
/*
public class HelloWorld {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //numbers.add(1);
        //numbers.add(2);
        //numbers.add(3);
        //numbers.add(4);
        //numbers.add(5);

        //numbers.remove(Integer.valueOf(4));

        //System.out.println(numbers.toString());
        //System.out.println(numbers.get(2));

        //numbers.clear();
        //System.out.println(numbers.toString());

        //numbers.set(2, Integer.valueOf(30));

        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(4);

        System.out.println(numbers.toString());

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());

        System.out.println(numbers.toString());

        System.out.println(numbers.contains(Integer.valueOf(1)));
        System.out.println(numbers.contains(Integer.valueOf(7)));
        System.out.println(numbers.isEmpty());

        System.out.println(numbers.toString());
        
        numbers.forEach(number ->{
            System.out.println(number * 2);
        });

        System.out.println(numbers.toString());
    }
}

 */

// HASHMAPS PRACTICE ---

/*


public class HelloWorld {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 75);
        examScores.put("English", 90);
        examScores.put("Sociology", 80);
        examScores.put("Computer Science", 100);

        //System.out.println(examScores.toString());
        ///System.out.println(examScores.get("English"));

        //examScores.putIfAbsent("Math", 70);
        //examScores.replace("Math", 70);

        //System.out.println(examScores.containsKey("English"));

        //examScores.remove("English");

        //System.out.println(examScores.containsKey("English"));

        //examScores.clear();

        //System.out.println(examScores.size());
        //System.out.println(examScores.isEmpty());

        //System.out.println(examScores.toString());

        examScores.forEach((subject, score) -> {
            examScores.replace(subject, score - 10);
        });

        System.out.println(examScores.toString());
    }
}

 */

// OBJECT ORIENTATED PROGRAMMING PRACTICE ---

class HelloWorld {
    public static void main(String[] args) {

        Book book = new Book("Carmilla", "Sheridan Le Fanu", 270);
        AudioBook dracula = new AudioBook("Dracula", "Bram Stroker", 30000);
        EBook jeeves = new EBook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");

        System.out.println(dracula.toString());
        System.out.println(book.toString());
        System.out.println(jeeves.toString());
    }
}































