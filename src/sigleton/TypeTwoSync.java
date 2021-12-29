package sigleton;

public class TypeTwoSync {
    private static volatile TypeTwoSync instance;

    public static TypeTwoSync getInstance() {
        if(instance == null){
            synchronized (TypeTwoSync.class){
                instance = new TypeTwoSync();
            }
        }
        return instance;
    }
    public  String a = "type two sync";
}
