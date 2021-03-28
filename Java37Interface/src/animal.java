import Interface.animalcommon;

public class animal implements livedcommon, animalcommon {
    private String kind;
    private int age;

    public animal(String kind, int age) {
        this.kind = kind;
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println("animal breath control");

    }

    @Override
    public int sleep() {
        return 12;
    }


    @Override
    public boolean milch() {
        return true;
    }
}
