public class Calc {

    boolean isEven(int number){
        boolean isEven = (number%2)==0;
        return isEven;
    }

    boolean isOdd(int number){
        boolean isOdd = (number%2)!=0;
        return isOdd;
    }

    double circleField(double r){
        double field = 3.14 * (r*r);
        return field;
    }

    int power(int number){
        int power = number * number;
        return power;
    }


}
