public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog + "\n" + "cat = " + cat + "\n" + "paper = " + paper);
    }

    public static void task2() {
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper + 4;
        System.out.println("dog = " + dog + "\n" + "cat = " + cat + "\n" + "paper = " + paper);
    }

    public static void task3() {
        var dog = 12.0;
        dog = dog - 3.5;
        var cat = 7.6;
        cat = cat - 1.6;
        var paper = 763793;
        paper = paper - 7639;
        System.out.println("dog = " + dog + "\n" + "cat = " + cat + "\n" + "paper = " + paper);
    }

    public static void task4() {
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);
    }

    public static void task5() {
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);
    }

    public static void task6() {
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        System.out.println("Общий вес двух бойцов - " + (weightFirst + weightSecond));
        System.out.println("Разница веса двух бойцов - " + (weightSecond - weightFirst));
    }

    public static void task7() {
        var weightFirst = 78.2;
        var weightSecond = 82.7;
        System.out.println("Разница весов (вычитание из большего меньшего) - " + (weightSecond - weightFirst));
        System.out.println("Разница весов (остаток от деления) - " + (weightSecond % weightFirst));
    }

    public static void task8() {
        var workTime = 640;
        var workTimeOneEmployee = 8;
        var numberOfEmployees = workTime / workTimeOneEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек.");
        numberOfEmployees = numberOfEmployees + 94;
        workTime = workTimeOneEmployee * numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человека, то всего " + workTime + " часа работы может быть поделено между сотрудниками.");
        System.out.println("Домашка готова!");
    }
}