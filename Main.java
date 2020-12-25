import java.util.Scanner; //import scanner class for keyboard
class Main { //main class
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in); //scanner class for keyboard
    System.out.print("Please enter your 5 HW grades: "); //user output for homework grades
    int hw1 = keyboard.nextInt(); //stores user's first homework grade input
    int hw2 = keyboard.nextInt(); //stores user's second homework grade input
    int hw3 = keyboard.nextInt(); //stores user's third homework grade input
    int hw4 = keyboard.nextInt(); //stores user's fourth homework grade input
    int hw5 = keyboard.nextInt(); //stores user's fifth homework grade input
    System.out.print("Please enter your 2 Test Grades: "); //user output for test grades
    int t1 = keyboard.nextInt(); //stores user's first test grade input
    int t2 = keyboard.nextInt(); //stores user's second test grade input
    
    double avg = calcAverage(hw1, hw2, hw3, hw4, hw5, t1, t2); //This runs the method from calcAverage
    System.out.println("Class Average: " + avg); //prints class average 
    String grade = letterGrade(avg);  //This runs the method from the letterGrade method
    System.out.println("Letter Grade: " + grade); //prints letter grade

  }
  
  public static double calcAverage(double hw1, double hw2, double hw3, double hw4, double hw5, double t1, double t2){ //method for calcAverage
    double homeworkAverage = ((hw1 + hw2 + hw3 + hw4 + hw5) / 500) * (0.3 * (hw1 + hw2 + hw3 + hw4 + hw5 + t1 + t2)); //does the calculations
    double testAverage = ((t1 + t2) / 200) * (0.7 * (hw1 + hw2 + hw3 + hw4 + hw5 + t1 + t2)); //does the calculations
    double total = (homeworkAverage + testAverage) / (hw1 + hw2 + hw3 + hw4 + hw5 + t1 + t2); //does the calculations
    return (total * 100); //returns total times 100
  }
  
  public static String letterGrade(double average){ //method for letterGrade
    if (average >= 90){ //if statement runs if average is greater than or equal to 90
      String letter_for_grade = "A"; //defines letter to A
      return letter_for_grade; //returns the letter
    }
    else if (average >= 80){ //else if statement runs if average is greater than or equal to 80
      String letter_for_grade = "B"; //defines letter to A
      return letter_for_grade; //returns the letter
    }
    else if (average >= 70){ //else if statement runs if average is greater than or equal to 70
      String letter_for_grade = "C"; //defines letter to A
      return letter_for_grade; //returns the letter
    }
    else if (average >= 60){ //else if statement runs if average is greater than or equal to 60
      String letter_for_grade = "D"; //defines letter to A
      return letter_for_grade; //returns the letter
    }
    else { //else  statement runs when the average is less than 60
      String letter_for_grade = "F"; //defines letter to A
      return letter_for_grade; //returns the letter
    }
  }
  
  
  
}
