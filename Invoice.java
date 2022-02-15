/**
 * Invoice
 *
 * @Julia Zhu, Christina, Kristina
 * @2022-02-15
 */
import java.util.ArrayList;

public class Invoice
{
    ArrayList<Teachers> reviewList;
    public static void main(String[] args){
        TeacherList Teachers = new TeacherList("TeacherGrader.csv");
        System.out.println(Teachers);
        
        System.out.println("\nPassing Grades: \n");
        ArrayList<Teachers> pass = Teachers.search(5);
        for( Teachers t : pass)
        { 
            System.out.println(t);
        }
    } 

}