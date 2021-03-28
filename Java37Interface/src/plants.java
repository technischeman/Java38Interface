import Interface.plantscommon;

public class plants implements livedcommon, plantscommon {
    private String kind;
    private int age;

    public plants(String kind, int age) {
        this.kind = kind;
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println("plants breath control");

    }

    @Override
    public int sleep() {
        return 12;
    }

    @Override
    public int wurzlong() {
        return 13;
    }
}
