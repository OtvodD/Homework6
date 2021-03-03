public class Main {

    public static void main (String args[])
    {
    Cat cat = new Cat (200);
    Dog dog = new Dog (500, 10);

    System.out.println("Коты преодалел расстояние: ");

    cat.run(10);
    cat.run(100);
    cat.swim(2);

    System.out.println("Собаки преодолели расстояние: ");

    dog.run(350);
    dog.run(550);
    dog.swim (5);
    }
}
