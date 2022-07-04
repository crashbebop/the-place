public class SnoopBall {
  public static void main(String[] args) {
    double x = (Math.random() * 101);          //magic snoop ball
	if (x > 66) {
	  System.out.println("Drop it like its hot");
	} else if (x > 33) {
	  System.out.println("Park it like its hot");
	} else {
	  System.out.println("Pop it like its hot");
	}
  }
}
