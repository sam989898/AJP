import java.util.Scanner;
interface SchoolData
{
  String scName = "ABCD";	//schoolname
  String year = "3rd";
}
class getStudentData
{

  int rollno;
  String name;

  int Age;

  Scanner read = new Scanner (System.in);
  void getData (String getName, int rn, int age)
  {
    System.out.println ("Personal Detail of Student:");
    System.out.println (" Enter name:");
    getName = read.nextLine ();
    name = getName;
    System.out.println (" Enter Rollno");
    rn = read.nextInt ();
    rollno = rn;
    System.out.println (" Enter Age");
    age = read.nextInt ();
    Age = age;
  }
  void showData ()
  {
    System.out.println ("Name " + name);
    System.out.println ("roll no. " + rollno);
    System.out.println ("Age " + Age);
  }

}

class getReportData extends getStudentData implements SchoolData
{

  int marks;
  float percantage;
  String grade;
  float totalMarks = 300;

  Scanner read = new Scanner (System.in);
  void getData (int obmarks)
  {
    System.out.println ("\nReport Detail:");
    System.out.println ("Enter Total obtained Marks");
    obmarks = read.nextInt ();	//obtained marks
    while (obmarks > 300)
      {
	System.out.
	  println ("Sorry,Marks should be less than 300\nEnter Again");
	obmarks = read.nextInt ();
      }
    marks = obmarks;
    percantage = marks / totalMarks * 100;

    if (percantage < 35)
      {
	grade = "failed";
      }
    else
      {
	grade = "passed";
      }


  }
  void showData ()
  {
    System.out.println ("\nSchool Name : " + scName);
    System.out.println ("School Year : " + year);
    System.out.println ("Marks : " + marks);
    System.out.println ("Percantage : " + percantage);
    System.out.println ("Remark : " + grade);


  }

}

public class Main
{
  public static void main (String[]args)
  {
    Scanner read = new Scanner (System.in);
    getStudentData obj1 = new getStudentData ();
    getReportData obj2 = new getReportData ();
      System.out.println ("Please Enter Detail \n");
      obj1.getData ("", 0,1);
      obj2.getData (0);
    int number;
    do
      {
	System.out.
	  println
	  ("Type:\n1.For Personal(Simple) \n2.Academic details(Inheritance,Overload,Override)\nAny other number to exit ");
	int num = read.nextInt ();
	  number = num;
	switch (num)
	  {
	  case 1:
	    obj1.showData ();
	    break;
	    case 2:obj2.showData ();
	    break;
	  }
      }
    while (number == 1 || number == 2);
  }
}
