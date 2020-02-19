
import java.util.Scanner;
public class JavaClass {

    Scanner user = new Scanner(System.in);


    public static void main(String[] args)
    {
        System.out.println("Hi there , my name is Danielle. What is your name?");
        JavaClass jc = new JavaClass();
        jc.Message1();
        System.out.println("Okay nice , I study IT");
        System.out.println("Chat Later , Off to class");
    }
    public  void Message1()
    {
        String name = user.next();
        System.out.println( name + " its nice to meet you");
        Message2();
    }

    public void Message2()
    {

        System.out.println("Do you attend CPUT?");
        String answer = user.next();
        System.out.println("Great , so do I");
        Message3();
    }

    public void Message3()
    {
        System.out.println("What course do you study?");
        String courseName = user.next();
    }


}
