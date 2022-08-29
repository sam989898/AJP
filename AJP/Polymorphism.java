import java.util.Scanner;	// Import the Scanner class

interface Student
{
  String name = "Jelly Bin ";
  int rollNo = 1;
}
interface Academics
{
  int marks = 270;
  int totMarks = 300;
  double percantage = 90.00;


}
class Student1 implements Student, Academics
{
  void getData (String stud, int roll)
  {
    stud = name;
    roll = rollNo;
    System.out.println ("Your Name : " + stud);
    System.out.println ("Your Roll No : " + roll);
  }
  void getData (int score, double per)
  {
    score = 280;
    per = 93.3;
    System.out.println ("Your Score : " + score);
    System.out.println ("Your Percantage : " + per);
  }
}

class Student2 extends Student1
{

  void getData (String stud, int roll)
  {
    stud = "Hennah Beaker";
    roll = 2;
    System.out.println ("Your Name : " + stud);
    System.out.println ("Your Roll No : " + roll);
  }
  void getData (int score, double per)
  {
    score = marks;
    per = percantage;
    System.out.println ("Your Score : " + score);
    System.out.println ("Your Percantage : " + per);
  }
}


class Main
{
  public static void main (String[]args)
  {
    System.out.println ("Students Records\n ");
    System.out.println ("id : 01 ");

    Student1 xl = new Student1 ();
      xl.getData ("", 0);
      xl.getData (0, 0);

      System.out.println ("\nid : 02 ");
    Student2 x2 = new Student2 ();
      x2.getData ("", 0);
      x2.getData (0, 0);



  }
}
