class Logical {
    public static void main(String[] args) {
        System.out.println(true && false);// false
        System.out.println(true || false);// true
        System.out.println(true && !false);// true
        System.out.println(!true);// false
        System.out.println(!(true && false) && (20 % 2 == 0));// true
        System.out.println(22 / 7 == 22.0 / 7.0);// true
        System.out.println(22.0f / 7.0f > 20.0 / 7.0);// true
        System.out.println(22.0 / 7.0 > 20.0 / 7.0);// true
        System.out.println(22.0 / 7.0 >= 20.0 / 7.0);// true
        System.out.println(22.0 / 7.0 < 20.0 / 7.0);// false
        System.out.println(22.0 / 7.0 <= 20.0 / 7.0);// false
        System.out.println(22.0 / 7.0 != 20.0 / 7.0);// true
        System.out.println(22.0 / 7.0 <= 20.0 / 7.0);// false

    }
}