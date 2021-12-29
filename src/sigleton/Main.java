package sigleton;

public class Main {
    public static void main(String[] args) {
        TypeOne typeOne1 = TypeOne.instance;
        TypeOne typeOne2 = TypeOne.instance;
        System.out.println(typeOne1 == typeOne2);
        System.out.println(typeOne1.a);
        TypeTwo typeTwo1 = TypeTwo.getInstance();
        TypeTwo typeTwo2 = TypeTwo.getInstance();
        System.out.println(typeTwo1 == typeTwo2);
        System.out.println(typeTwo1.a);
        TypeThree typeThree1 = TypeThree.getInstance();
        TypeThree typeThree2 = TypeThree.getInstance();
        System.out.println(typeThree1 == typeThree2);
        System.out.println(typeThree1.a);
        TypeFour typeFour1 = TypeFour.INSTANCE;
        TypeFour typeFour2 = TypeFour.INSTANCE;
        System.out.println(typeFour1 == typeFour2);
        System.out.println(typeFour1.a);
        TypeTwoSync typeTwoSync1 = TypeTwoSync.getInstance();
        TypeTwoSync typeTwoSync2 = TypeTwoSync.getInstance();
        System.out.println(typeTwoSync1 == typeTwoSync2);
        System.out.println(typeTwoSync1.a);
    }
}
