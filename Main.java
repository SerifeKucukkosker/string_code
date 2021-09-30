import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        ArrayList <Student> studentList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String selection;
    
        while(true){
            selection = scan.next();
            if(selection.equals("1")){
                Student student = new Student();
                student.setter();
                studentList.add(student);
            }
            else if(selection.equals("2")){
                System.out.println("Id");
                int toRemove = scan.nextInt();
                scan.nextLine();
                for(int i=0;i<studentList.size();i++){
                    if(studentList.get(i).getId() == toRemove){
                        studentList.remove(i);
                    }
                }
            }
            else if(selection.equals("3")){
                for(Student temp: studentList)
                    System.out.println(temp.toString());
            }
            else{
                scan.close();
                break;
            }
        }
    }
}

