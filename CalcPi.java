// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
      int n = Integer.parseInt(args[0]);
	  double pi_approxi = 0;
	  int sign = 1;
	  double denominator = 1 ;

	  for (int i=0; i < n; i++){
		pi_approxi += (double) sign / denominator;
		sign = -sign;
		denominator = denominator + 2;
	  }

	  pi_approxi = pi_approxi * 4;

	  System.out.println("pi according to Java:     " + Math.PI);
	  System.out.println("pi, approximated: "+ pi_approxi);


	}
}
