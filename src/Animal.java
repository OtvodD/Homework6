public class Animal {

    public int maxRunDist;
    public int maxSwimDist;

    Animal (int maxRunDist, int maxSwimDist)
    {
        this.maxRunDist = maxRunDist;
        this.maxSwimDist = maxSwimDist;
    }

    void run(int runDist) {
        System.out.println("Бегом " + runDist + "м " + correct(runDist, maxRunDist));
    }

     void swim(int swimDist){
        System.out.println("Вплявь " + swimDist + "м " + correct(swimDist, maxSwimDist));
    }

    boolean correct (int dist, int maxDist)
    {
        return dist <= maxDist;
    }

}
