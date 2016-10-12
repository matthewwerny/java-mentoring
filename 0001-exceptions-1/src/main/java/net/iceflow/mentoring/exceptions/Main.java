package net.iceflow.mentoring.exceptions;

public class Main {

	public static void main(final String[] args) {

		try {
			throw new BadException();
		} catch (BadException be) {
			System.err.println("Bad Exception Caught");
		} catch (MyException me) {
			System.err.println("My Exception Caught");
		}

		try {
			throw new MyException();
		} catch (BadException be) {
			System.err.println("Bad Exception Caught");
		} catch (MyException me) {
			System.err.println("My Exception Caught");
		}

	}

}
