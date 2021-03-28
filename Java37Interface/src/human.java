import Interface.humancommon;

public class human implements livedcommon, humancommon {
    private String name;
    private int age;

    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void breath() {
        System.out.println("maka a deep breath");

    }

    @Override
    public int sleep() {
        return 5;
    }

    @Override
    public boolean intelligence() {
        return true;
    }
}
