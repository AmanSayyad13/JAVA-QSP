class Logical {
    public static void main(String[] args) {
        System.out.println(true && false);
        System.out.println(true || false);
        System.out.println(true && !false);
        System.out.println(!true);
        System.out.println(!(true && false) && (20 % 2 == 0));
        System.out.println(22 / 7 == 22.0 / 7.0);
        System.out.println(22.0f / 7.0f > 20.0 / 7.0);
    }
}