package p1;

public class E {
E(int x){
	System.out.println(x);
}
E(char x){
	System.out.println(x);
}
E(float x){
	System.out.println(x);
}

public static void main(String[] args) {
	E e1=new E(478);
	E e2=new E('j');
	E e3=new E(8);
}
}
