package basics;

public class Remainder {
		  public static void main(String[] args) {
		    int x = 153;
		    int rem,sum = 0;
		    while(x>0)
		    {
		    rem=x % 10;
		    sum+=rem*rem*rem;
		    x=x/10;
		    System.out.println(sum+":"+rem);
		    }
		    String txt = "Hel\blo World!";
		    System.out.println(txt);
		  }
		}
