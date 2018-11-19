//链式编程
//特点：每次调用完方法后返回的是一个对象
public class StudentTest {
    public static void main(String[] args){
        StudentDemo sd = new StudentDemo();
        //Student s = sd.getStudent();
        //Student s = new Student();
        //s.study();
        sd.getStudent().study();
    }
}
