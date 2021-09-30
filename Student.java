import java.util.ArrayList;
import java.util.Scanner;

public class Student{
    private int ID;
    private String name;
    public void setter(){
        Scanner scan = new Scanner(System.in);
        System.out.println("id");
        ID = scan.nextInt();
        scan.nextLine();
        System.out.println("name");
        name = scan.nextLine();
        scan.close();
    }
    public int getId(){
        return ID;
    }
    @Override
    public String toString(){
        return ID + " " + name;
    }
}

