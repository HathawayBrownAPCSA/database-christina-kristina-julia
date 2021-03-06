/**
 * InputLine
 *
 * @Julia Zhu, Christina, Kristina
 * @2022-02-15
 */

public class InputLine
{
  private String input;

  public InputLine(String str)
  {
    input = str;
  }

  /**  Determines whether the InputString has another token or not
   *
   *  @return true if there is another token on the InputString; false otherwise
   */
  public boolean hasNext()
  {
    return (input.length() > 0);
  }

   public String nextToken()
   {
     String token;
     if (input.charAt(0) == '\"')          // if it's open quote
     {
       int loc = input.indexOf('\"', 1);   // ends at close quote
       token = input.substring(1, loc);
       input = input.substring(loc + 2);
     }
     else    // look for comma
     {
       int loc = input.indexOf(",");
       if (loc == -1)
       {
         token = input;
         input = "";
       }
       else
       {
         token = input.substring(0, loc);
         input = input.substring(loc + 1);
       }

     }
     //System.out.println(input);
     return token;
   }
}
