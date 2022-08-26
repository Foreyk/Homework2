public class Main {
    public static void main(String[] args) {
//        Задание  1
        System.out.println();
        System.out.println("Задание 1:");
        var dog = 8d;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println( );

//        Задание  2
        System.out.println();
        System.out.println("Задание 2:");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println( );

//        Задание  3
        System.out.println();
        System.out.println("Задание 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println( );

//        Задание  4
        System.out.println();
        System.out.println("Задание 4:");
        var friend =19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

//        Задание  5
        System.out.println();
        System.out.println("Задание 5:");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

//        Задание 6
        System.out.println();
        System.out.println("Задание 6:");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        System.out.println("Вес первого боксера равен " +weightBoxer1 +" кг." );
        System.out.println("Вес второго боксера равен " +weightBoxer2 +" кг." );
        var totalKg = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес боксеров равен " + totalKg +" кг.");
        var differenceKg = weightBoxer1 - weightBoxer2;
        if (differenceKg < 0)
        {
            differenceKg = differenceKg * -1;
            System.out.println("Разница между весами боксеров равна " + differenceKg +" кг.");
        }
        else if (differenceKg >= 0)
        {
            System.out.println("Разница между весами боксеров равна " + differenceKg +" кг.");
        }

//        Задание 7
        System.out.println();
        System.out.println("Задание 7:");
        var differenceWeight = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами боксеров равна " + differenceWeight +" кг.");
        differenceWeight = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между весами боксеров равна " + differenceWeight +" кг.");

//        Задание 8
        System.out.println();
        System.out.println("задание 8:");
        var totalHours = 640;
        var hoursForOne = 8;
        var employees = totalHours / hoursForOne;
        System.out.println("Всего работников в компании – " + employees +" человек.");
        var noviceEmployees = 94;
        employees = employees + noviceEmployees;
        totalHours = employees * hoursForOne;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + totalHours + " часов работы может быть поделено между сотрудниками." );




    }
}