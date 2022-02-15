
/**
 * TeacherList
 *
 * @Julia Zhu, Christina, Kristina
 * @2022-02-15
 */
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;
public class TeacherList
{
    // instance variables - replace the example below with your own
    private ArrayList<Teachers> teacher;

    public TeacherList()
    {
        // initialise instance variables
        teacher = new ArrayList<Teachers>();
    }
    
    public void insert (Teachers t)
  {
      if(teacher.size() == 0)
      {
          teacher.add(t);
      }
      else
      {
          int loc = teacher.size();
          while(loc > 0 && teacher.get(loc-1).compareTo(t) > 0)
          {
              loc--;
          }
          teacher.add(loc, t);
      }
  }
    public TeacherList(String fileName)
  {
    teacher = new ArrayList<Teachers>();
    //String fileName = "TeacherGrader.csv";
    
    // Open the file for input
    File file = new File(fileName);
    Scanner sourceFile = null;
    try
    {
        sourceFile = new Scanner(file);
    }
    catch (FileNotFoundException ex)
    {
        System.out.println("*** Cannot open " + fileName + " ***");
        System.exit(1);        // quit the program
    } 
    String dummy = sourceFile.nextLine();

    // Fill the Collection from the input file
    while (sourceFile.hasNext())
    {
      String str = sourceFile.nextLine();
      Teachers nextTeacher =  new Teachers(str);
      insert(nextTeacher);
    }

    sourceFile.close();

  }

    public String toString()
  {
    String result = "";
    for (Teachers b : teacher)
    {
      result += b + "\n";
    }
    return result;
  }
  public ArrayList<Teachers> search (int target)
  {
      ArrayList<Teachers> results = new ArrayList<Teachers>();
      for (Teachers b : teacher)
      {
          if (b.getRanking() > target)
          {
              results.add(b);
          }
      }
      return results;
  }
    }

