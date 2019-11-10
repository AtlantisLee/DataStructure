package cn.lee;

class PrintNum {
	public static void printWithLoop(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}
	}

	public static void printWithRecursion(int n) {
		if (n > 0) {
			printWithRecursion(n - 1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		printWithRecursion(10000);
		long end = System.currentTimeMillis();
		System.out.println("==================");
		System.out.println("begin:" + begin + ",end:" + end + ",interval:" + (end - begin));

		long beginL = System.currentTimeMillis();
		printWithLoop(10000);
		long endL = System.currentTimeMillis();
		System.out.println("==================");
		System.out.println("beginLoop:" + beginL + ",endLoop:" + endL + ",interval:" + (endL - beginL));
	}
}
