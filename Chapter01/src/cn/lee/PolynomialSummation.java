package cn.lee;

public class PolynomialSummation {

	public static void sum01(int n, double a[], double x) {
		double p = a[0];
		for (int i = 1; i <= n; i++) {
			p += a[i] * Math.pow(x, i);
		}
	}

	public static void sum02(int n, double a[], double x) {
		double p = a[n];
		for (int i = n; i > 0; i--) {
			p = a[i - 1] + p * x;
		}
	}

	public static void main(String[] args) {
		double a[] = new double[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = a.length - 1;
		long begin = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			sum01(n, a, 2);
		}
		long end = System.currentTimeMillis();
		System.out.println("==================");
		System.out.println("begin:" + begin + ",end:" + end + ",interval:" + (end - begin));

		long begin02 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			sum02(n, a, 2);
		}
		long end02 = System.currentTimeMillis();
		System.out.println("==================");
		System.out.println("begin02:" + begin02 + ",end02:" + end02 + ",interval:" + (end02 - begin02));
	}

}
