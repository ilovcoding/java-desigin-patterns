package sigleton;

// 静态内部类
public class TypeSeven {
    private static class InnerClass {
        public static TypeSeven instance = new TypeSeven();
    }
    public static TypeSeven getInstance(){
        return InnerClass.instance;
    }
}
