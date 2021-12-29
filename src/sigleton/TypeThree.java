package sigleton;

public class TypeThree {
    private static class InnerClass {
        public static TypeThree instance = new TypeThree();
    }
    public static TypeThree getInstance(){
        return InnerClass.instance;
    }
    public Integer a = 3;
}
