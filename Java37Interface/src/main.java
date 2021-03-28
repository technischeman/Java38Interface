public class main {
    public static void main(String[] args) {
        human human1 = new human("men", 15);
        human1.breath();
        int sleeptime = human1.sleep();
        System.out.println("sleep time of human= " + sleeptime);
        boolean isClever = human1.intelligence();
        System.out.println("has intelligence human=" + isClever);
        animal animal1 = new animal("cow", 5);
        animal1.breath();
        boolean isThereMilk = animal1.milch();
        System.out.println("has milk= " + isThereMilk);
        int sleepTime = animal1.sleep();
        System.out.println("sleep time of animal= " + sleepTime);
        plants plants1 = new plants("rose", 3);
        plants1.breath();
        int sleepplant = plants1.sleep();
        int wurz = plants1.wurzlong();
        System.out.println("sleep time of plants= " + sleepplant);
        System.out.println("wurz long= " + wurz);


    }
}
