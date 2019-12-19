package recursion;

public class Collatz {

    private int stoppingTime;

    Collatz(){
        stoppingTime = 0;
    }

    public int compute(int number){
        stoppingTime++;
        if(number == 1)
            return 1;
        if(number % 2 == 0)
            return compute(number / 2);
        else
            return compute(number*3 + 1);
    }

    public int getStoppingTime(){
        return stoppingTime;
    }
}
