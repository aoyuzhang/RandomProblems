/* 
Is 2017 the sum of digits of a perefct square?
Answer:could be, didn't find it yet
*/

//*******************************************************************

import java.lang.Math; // headers MUST be above the first class

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    for(long i=0;i<100000000;i++)
    {
     	if(sumDigits((long)Math.pow(i,2))==2017)
           System.out.println(i+"");
    }
  }
  public static long sumDigits(long i) {
    return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
}
}


