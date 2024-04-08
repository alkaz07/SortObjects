import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        example3();
    }

    private static void example1() {
        int[] mas1 = {5, 17, 98, 78, 45, 2, 0};
        Arrays.sort(mas1);
        String s = Arrays.toString(mas1);
        System.out.println(s);

        String[] mas2 = {"Оксана", "Вася", "Петя", "Алина", "Юрий"};
        Arrays.sort(mas2);

    }

    private static void example2() {
        Person[] mas3 = {new Person("Оксана", 31),
                        new Person("Вася", 17),
                        new Person("Петя", 94),
                        new Person("Алина", 24),
                        new Person("Юрий", 23)};
        Arrays.sort(mas3); //исключение: Person не Comparable
        System.out.println(Arrays.toString(mas3));
    }
    private static void example3() {
        Helicopter[] mas4 = {new Helicopter("Белл", 11),
                            new Helicopter("Ка-52", 10),
                            new Helicopter("Робинсон", 4),
                            new Helicopter("Ми-8МВТ", 20),
                            new Helicopter("Ми-17", 23)};
        Arrays.sort(mas4);
        System.out.println(Arrays.toString(mas4));
    }
}