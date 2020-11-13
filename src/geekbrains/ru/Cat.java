package geekbrains.ru;

 public class Cat extends Animal {

     @Override
     void run(int runDistance)
     {
        boolean result = runDistance <= 200;
        if (runDistance <= 200)
        {
            printResult(result);
        }
        if (runDistance > 200)
        {
            System.out.println("Cats don't run for such a long distances :( ");
        }

     }

     @Override
     void swim(int swimDistance) {
        System.out.println("Cats don't like swimming");
     }

     @Override
     void jump(int height)
     {
        boolean result = (height <= 2);
        if (height <= 2)
        {
            printResult(result);
        }

        if (height > 2)
        {
            System.out.println("Cats don't jump too height");
        }

     }
 }
