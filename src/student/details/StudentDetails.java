
package student.details;

public class StudentDetails {

    public static void main(String[] args) {
    
        student[] list = new student[3];
        
        student s1 = new student();
        s1.setName("john");
        s1.setAge(19);
        student s2 = new student();
        s2.setName("peter");
        s2.setAge(19);
        student s3 = new student();
        s3.setName("Harman");
        s3.setAge(19);
       
        list[0] =s1;
        list[1] =s2;
        list[2] =s3;
        
        for(int i=0; i<list.length; i++)
        {
        System.out.println(list[i].getName() + " " + list[i].getAge());
        }
    System.out.println("Learn operation");
        //pull operation
        //fetch operation
    }
    
}
