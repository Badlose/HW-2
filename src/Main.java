public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var sumWeights = weightBoxer1 + weightBoxer2;
        var diffWeights = weightBoxer1 - weightBoxer2;

        System.out.println(sumWeights);
        System.out.println(diffWeights);

        var remainsWeight = (weightBoxer1 + weightBoxer2) % weightBoxer1;
        System.out.println(remainsWeight);

        var workers = 640 / 8;
        System.out.println("Всего разработчиков в компании - " + workers + " человек");

        workers += 94;
        var hours = workers * 8;
        System.out.println("Если в компании работает " + workers + ", то всего " + hours + " часов работы может быть "
                + "поделено между сотрудниками");

    }
}