package ua.lviv.lgs;

public class Overload {
	private int a;
	private int b;
	private int c;

	public Overload(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Overload(int a, int b, int c) {
		this(a, b);
		this.c = c;
	}
}
