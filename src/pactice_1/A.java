package pactice_1;

public class A extends Thread {

	String name;

	public A(String name) {
		this.name = name;

	}

	public void run() {
		for (int i = 0; i < 1000; i++) {

			System.out.println(this.name);

		}

	}

	public static void main(String[] args) {

		A a1 = new A("xxx");
		A a2 = new A("yyy");
		A a3 = new A("zzz");

		a1.start();
		a2.start();
		a3.start();

	}

}
