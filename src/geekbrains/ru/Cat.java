package geekbrains.ru;

 public class Cat extends Animal {

     @Override
     void swim(int swimDistance) {
        System.out.println("Cats don't like swimming");
     }


     void jump(int height)
     {
        boolean result = (height <= 2);
        if (result)
        {
            printResult(result);
        }

        if (height > 2)
        {
            System.out.println("Cats don't jump too height");
        }

     }
 }
