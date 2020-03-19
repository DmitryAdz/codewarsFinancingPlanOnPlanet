package by.odinets.codewars.financingPlan;

import java.math.BigInteger;

public class Finance {

	public static BigInteger finance(int number) {
		BigInteger result = BigInteger.valueOf(0);
		BigInteger elementArr = BigInteger.valueOf(0);
		int[][] arrNumbers = new int[number + 1][number + 1];
		for(int i = 0; i <= number; i++) {
			int element = 0;
			for(int j = 0; j <= number; j++) {
				if(j < i) {
					arrNumbers[i][j] = 0;
				} else {
					arrNumbers[i][j] = i + element;
				}
				System.out.print(arrNumbers[i][j] + "   ");
				element++;
				
				elementArr = BigInteger.valueOf(arrNumbers[i][j]);
				result = result.add(elementArr);
			}
			System.out.println();
		}
		return result;
	}
}
