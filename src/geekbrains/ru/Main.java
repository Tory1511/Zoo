package geekbrains.ru;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
//5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

import javafx.scene.AmbientLight;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setMaxRunDistance(100);

        Cat catOne = new Cat();
        catOne.setMaxRunDistance(5); //very old cat

        cat.jump(2);
        cat.jump(5); // out of limit test
        cat.swim(1);
        cat.run(100);
        cat.run(500);// out of limit test

        catOne.run(2);
        catOne.run(10);

        Dog dog = new Dog();
        dog.setMaxRunDistance(500);
        dog.run(450);
        dog.run(550);// out of limit test


        dog.jump(0.5f);
        dog.jump(3);// out of limit test

        dog.swim(5);
        dog.swim(15); // out of limit test
    }
}
