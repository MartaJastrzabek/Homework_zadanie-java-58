public class CalcTest {

    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println("Is even: " + calc.isEven(5));

        System.out.println("Is odd: " + calc.isOdd(6));

        System.out.println("Is even: " + calc.isEven(4));

        System.out.println("Is odd: " + calc.isOdd(3));

        System.out.println("Circle field: " + calc.circleField(5.11));

        System.out.println("Power: " + calc.power(4));

    }


}
