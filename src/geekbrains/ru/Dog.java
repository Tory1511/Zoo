package geekbrains.ru;

class Dog extends Animal

{


    @Override
    void run(int runDistance) {
        boolean result = runDistance <= 500;
        if (runDistance <= 500)
        {
            printResult(result);
        }
        if (runDistance > 500)
        {
            System.out.println("Dogs don't run for such a long distances :( ");
        }
    }

    @Override
    void swim(int swimDistance)
    {
        boolean result = swimDistance <= 10;
        if (swimDistance <= 10)
        {
            printResult(result);
        }
        if (swimDistance > 10)
        {
            System.out.println("Dogs don't swim for such a long distances :( ");
        }


    }

    @Override
    void jump(int height)
    {
        boolean result = height <= 1;
        if (height <= 1)
        {
            printResult(result);
        }
        if (height > 1)
        {
            System.out.println("Not this time :( ");
        }
    }
}
