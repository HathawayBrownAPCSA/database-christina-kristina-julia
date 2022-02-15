
/**
 * Ranking Teachers
 *
 *@Julia Zhu, Christina, Kristina
 * 
 * @2022-02-15
 */
public class Teachers implements Comparable<Teachers>
{
    
    private String name; 
    private int ranking;
    private String comment;
    
    /**
    * The constructo initializes value for item name, quanity, and price
    * @param nm the name of the teacher
    * @param rk the ranking for that teacher
    * @param cmt is the comment with the teacher
    */
   
    public Teachers(String str)
    {
        // initialise instance variables
        InputLine teacherInfo = new InputLine(str);

        String temp = teacherInfo.nextToken();
        name = new String(temp);

        temp = teacherInfo.nextToken();
        ranking = new Integer(temp);
     
        temp = teacherInfo.nextToken();
        comment = temp;
        
    }
    
    /**
     * Returns the review of the teacher
     */
    
    public String toString()
    {
        return name + ": " + ranking +"/10 " + "beacuse " 
        + comment;
    }
    
    public String getName(){
        return name; 
    }
    public String getComment(){
        return comment; 
    }
    public Integer getRanking(){
        return ranking; 
    }
    
    public int compareTo(Teachers other)
  {
      int ans = 0;
      if (this.ranking > other.ranking)
      {
          ans = 1;
      }
      if(this.ranking < other.ranking)
      {
          ans = -1;
      }
      if(this.ranking == other.ranking)
      {
          ans = 0;
      }
      return ans;
  }
  
  
}