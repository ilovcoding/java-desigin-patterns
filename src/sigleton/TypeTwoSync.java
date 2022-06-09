package sigleton;

// 懒汉式线程安全
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
}
