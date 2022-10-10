import java.util.Scanner;

interface CollegeData{
    String clgName = "ABCD";
    String year = "1st";
    
}

class StudentData{
    int rollno,age,marks;
    String name = "Jeremy";
    
    void data(String getName,int rn,int Age){
        System.out.println("personal Detail of Student :\n");
        name = getName;
        rollno = rn;
        age = Age;
        
        System.out.println("Name :" + name);
        System.out.println("Roll no :" + rn);
        System.out.println("Age :" + age);
    }
    float percantage;
    String grade;
    float totalMarks = 300;
    
    //overloading
    
    void data(int obmarks){
        marks = obmarks;
        percantage = marks/totalMarks * 100;
        System.out.println("\nMarks : " + marks );
        System.out.println("Percantage : " + percantage );
    }
}

class Inherit extends StudentData implements CollegeData{
    void show(){
        System.out.println("\nSchool Name :" + clgName);
        System.out.println("Year :" + year);
    }
}

class HeadMaster extends Inherit{
    void show(){
        System.out.println("Head Master : Bill Gates");
    }
}

//inheritence 
class ParentData extends StudentData {
    void ShowParent(String mother, String father){
        System.out.println("Student Name :" + super.name);
        System.out.println("Mother Name :" + mother);
        System.out.println("Father Name :" + father);
    }
}

public class MyClass {
    public static void main(String args[]) {
        
        StudentData obj1 = new StudentData();
        Inherit obj2 = new Inherit();
        HeadMaster obj3 = new HeadMaster();
        ParentData obj4 = new ParentData();
        
        obj1.data("Jeremy",01,20);
        
        System.out.println("\nEnter No of Your choice from below \n1.Simple Inheritance \n2.Overloading \n3.Overriding \n4.Multiple Inheritance \n5.For Exit");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        switch(num){
            case 1:
                obj4.ShowParent("Suzen Parker","Ben Parker");
                break;
            case 2:
                obj1.data(250);
                break;
            case 3:
                obj3.show();
                break;
            case 4:
                obj2.show();
                break;
            case 5:
                System.out.println("Exiting...\nThank You!");
                break;
            default:
            System.out.println("Invalid Input");
        }
            
                    
        }
    }
