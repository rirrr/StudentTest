class Outer1{
    private int num = 10;
    //内部类
    class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
        Inner i = new Inner();
        i.show();
    }
}
public class InnerClassDemo {
    public static void main(String[] args){

    }
}
