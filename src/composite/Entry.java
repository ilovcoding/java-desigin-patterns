package composite;

public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "("+ getSize() +")";
    }
}
