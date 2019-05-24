package com.sumfactorial;
/**
 * ����-1!+2!-3!+......+20!
 */
public class SumFactorial {		//Factorial:�׳�
	public static final int N = 20;
	public static long factorial(int n) {
		if(n == 1)
			return 1;
		else
			return n*factorial(n-1);
	}
	public static long sumFactorial(int n) {
		long sign = -1, sum = 0;
		for(int i = 1; i <= n; i++){
			sum += sign*factorial(i);
			sign = -sign;
		}
		return sum;
	}

	public static void main(String[] args) {
		/*���������*/
		System.out.println("��������" + sumFactorial(SumFactorial.N));

	}

}
