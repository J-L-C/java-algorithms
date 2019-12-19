package recursion;

public class Factorial {

    public int compute(int number) {
        if(number == 1)
            return 1;
        return number*compute(number - 1);
    }
}
