package basic;

public class FindLcm {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		int L1 = 72, L2 = 120, Lcm;
		Lcm = (L1 > L2) ? L1 : L2;
		while (true) {
			if (Lcm % L1 == 0 && Lcm % L2 == 0) {
				System.out.printf("The LCM of two numbers %d and %d is %d.", L1, L2, Lcm);
				break;
			}

			Lcm++;
		}

	}

}