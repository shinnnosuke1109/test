package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.seibetu="男";
		jiro.phoneNumber="090-0000-0000";
		jiro.address="jiro18@gmail.com";
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.seibetu);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.seibetu="女";
		hanako.phoneNumber="080-0000-0000";
		hanako.address="hanako16@yahoo.co.jp";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.seibetu);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);

		Person shin=new Person();
		shin.name="松本真之介";
		shin.age=20;
		shin.seibetu="男";
		shin.phoneNumber="080-1234-5678";
		shin.address="shin20@icloud.com";
		System.out.println(shin.name);
		System.out.println(shin.age);
		System.out.println(shin.seibetu);
		System.out.println(shin.phoneNumber);
		System.out.println(shin.address);
	}

}
