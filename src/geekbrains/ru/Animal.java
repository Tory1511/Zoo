package geekbrains.ru;

//1. Создать классы Собака и Кот с наследованием от класса Животное.
//2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. В качестве параметра каждому методу передается величина,
// означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
//4. При попытке животного выполнить одно из этих действий, оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true)
//5. * Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м.

 abstract class  Animal {

    public int maxRunDistance;


    void setMaxRunDistance(int maxRunDistance)
    {
       this.maxRunDistance = maxRunDistance;
    }
    void run(int runDistance)
    {
       boolean result = runDistance <= maxRunDistance;
       if (runDistance <= maxRunDistance)
       {
          printResult(result);
       }
       if (runDistance > maxRunDistance)
       {
          System.out.println(getClass().getName() + " don't run for such a long distances :( ");
       }

    }

    abstract void swim(int swimDistance);

    void printResult( boolean result)
    {
        System.out.println(getClass().getName() + " : " + result);
    }

}
