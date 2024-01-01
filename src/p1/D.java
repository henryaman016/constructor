package p1;

public class D {
D(){
	System.out.println(1528);
}
D(int x){
	System.out.println(x);	
}
D(int x,int y){
	System.out.println(x);
	System.out.println(y);
}
	public static void main(String[] args) {
		D d1=new D();
		D d2=new D(986);
		D d3=new D(784,693);
	}
}
