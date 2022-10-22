public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        double dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 3
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog1);
        System.out.println(cat);
        System.out.println(paper);
        // Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        // Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        // Задача 6
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух бойцов: " + totalWeight);
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница в весе двух бойцов: " + weightDifference);
        // Задача 7
        System.out.println("Задача 7");
        System.out.println("Разница в весе 1 способ: " + (weightBoxer2 - weightBoxer1));
        System.out.println("Разница в весе 2 способ: " + (weightBoxer2 % weightBoxer1));
        // Задача 8
        System.out.println("Задача 8");
        var totalTime = 640;
        var workerTime = 8;
        var totalNumberWorkers = totalTime / workerTime;
        System.out.println("Всего работников в компании - " + totalNumberWorkers + " человек");

        var totalNumberWorkers2 = totalNumberWorkers + 94;
        var newTotalTime = totalNumberWorkers2 * 8;
        System.out.println("Если в компании работает " + totalNumberWorkers2 + " человек, то всего " + newTotalTime + " часов работы может быть поделено между сотрудниками");



    }
}