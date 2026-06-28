class Narrowing2{
    public static void main(String[] args) {
        byte b1=(byte)257;
        System.out.println(b1);
        short s1=(short)(32768*2);
        System.out.println(s1);
        char ch=(char)1000.6543245;
        System.out.println(ch);

    }
}
