public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        int input1;
        int input2;
        String name;

        hello();

        positiveOrNegative(6);

        postiveOrZeroOrNegative(0);

        bartender("Henk");

        sum(4, 20);

    }

    public static void hello(){
        System.out.println("Hello World");
    }


    public static void positiveOrNegative(int number){
        if(number < 0){
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

    public static void postiveOrZeroOrNegative(int number2) {
        if (number2 < 0) {
            System.out.println("Negative number");
        } else if (number2 == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Positive number");
        }
    }

    public static void bartender(String name){
        switch (name){
            case "Henk":
                System.out.println("Henk is de BOB");
                break;
            case "Vladimir":
                System.out.println("Vladimir drinkt alleen vodka");
                break;
            default:
                System.out.println("Invalid name");
        }
    }

    public static void sum(int input1, int input2){
        System.out.println(input1 + input2);
    }




}