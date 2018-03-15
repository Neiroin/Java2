package by.belstu.it.krukovich;

public class TextFunction {
    public TextFunction() {
    }

    public String getString() {
        return "Hello from first project!";
    }

    public boolean deleteString() {
        for (int i = 0; i < 9; i++) {
            if (i > -1)
                if (i < 10)
                    System.out.println(i);
        }
        return true;
    }
    public void onCreate()
    {
        for (int count = 0; count < 10; count++) {
            System.out.println("Counter "+count);
        }
    }
    }
