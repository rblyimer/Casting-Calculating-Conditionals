public class Casting {
    public static void main(String[] args) {

    double data = 112.35;
    System.out.println("double: " + data);
    int num = (int) data;
    System.out.println("int: " + num);

    String str = "49";
    System.out.println("The string value is: " + str);
    int num2 = Integer.parseInt(str);
    System.out.println("The integer value is: " + num2);
    }
}