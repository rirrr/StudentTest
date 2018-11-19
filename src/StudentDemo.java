class StudentDemo {
    public Student getStudent(){
        return new Student();
        //一个方法的返回值是类名，返回的是该类的对象
        //如何调用？
        //StudentDemo sd = new StudentDemo();
        //Student s = sd.getStudent();
        //s.study();
    }
}
