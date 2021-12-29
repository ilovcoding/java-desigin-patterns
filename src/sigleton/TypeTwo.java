package sigleton;

public class TypeTwo {
    private static TypeTwo instance;

    public static TypeTwo getInstance() {
        if(instance == null){
            instance = new TypeTwo();
        }
        return instance;
    }
    public  Integer a = 2;
}
