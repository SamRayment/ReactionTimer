import java.util.Random;
import java.util.Scanner;
public class ReactionTimer {

 public static void main(String[] args)
 {
  System.out.println("Are you ready to test your reactions?");
  int countdown;
  long start;
  long end;
  long reactionTime;
  String testAgain="y";
  long oneSecond;
  long time;
  String react;
  Scanner input= new Scanner(System.in);
  System.out.println(testAgain);
  Random rand=new
  Random(System.currentTimeMillis());
  
  while(!"n".equals(testAgain)){
    countdown= rand.nextInt(4)+3;
    
    for(int i=countdown; i>0; i--){
      System.out.println(i);
      time=(System.currentTimeMillis())/1000;
      oneSecond=time+1;
      while(time<oneSecond){
        time=(System.currentTimeMillis())/1000;
      }
    }
    
    start=(System.currentTimeMillis())/1000;
  
    System.out.println("Press Enter!");
    react= input.nextLine();
    
    end=(System.currentTimeMillis())/1000;
  
    reactionTime= (end - start)+1;
    System.out.println("You reacted in "+reactionTime+" seconds");
    
    System.out.println("would you like another go? y/n");
    testAgain=input.nextLine();
 
  }
  
 }

}