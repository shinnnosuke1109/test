package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Robot aibo= new Robot();
		aibo.name="aibo";

		Robot asimo= new Robot();
		asimo.name="asimo";

		Robot pepper= new Robot();
		pepper.name="pepper";

		Robot doraemon= new Robot();
		doraemon.name="doraemon";

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();

		doraemon.talk();
		doraemon.walk();
		doraemon.run();

	}

}
