package jp.co.internous.action;

public class Test_2 {
	public static void main(String[]args){
		Person_2 p=new Person_2();

	Person_2 taro= new Person_2();
	taro.name= "taro";
	taro.age=18;
	System.out.println(taro.name);
	System.out.println(taro.age);

	Person_2 jiro =new Person_2("jiro",20);
	System.out.println(jiro.name);
	System.out.println(jiro.age);

	Person_2 saburo=new Person_2("saburo");
	System.out.println(saburo.name);
	System.out.println(saburo.age);

	Person_2 namae=new Person_2(25);
	System.out.println(namae.name);
	System.out.println(namae.age);

	Person_2 hanako=new Person_2("hanako",17);
	System.out.println(hanako.name);
	System.out.println(hanako.age);





	}

}
