class ConditionAll {
    public static void main(String[] args) {

        // 1. LARGEST OF 2 NUMBERS (Ternary Operator)
        int a1 = 10;
        int a2 = 20;
        int max2 = a1 > a2 ? a1 : a2;
        System.out.println("Largest of 2: " + max2);

        // 2. LARGEST OF 3 NUMBERS (Nested Ternary)
        int b1 = 5;
        int b2 = 10;
        int b3 = 15;
        int max3 = b1 > b2 ? (b1 > b3 ? b1 : b3) : (b2 > b3 ? b2 : b3);
        System.out.println("Largest of 3: " + max3);

        // 3. LARGEST OF 4 NUMBERS (Comparison Ternary)
        int c1 = 50;
        int c2 = 10;
        int c3 = 15;
        int c4 = 20;
        int max4 = (c1 > c2 ? c1 : c2) > (c3 > c4 ? c3 : c4) ? (c1 > c2 ? c1 : c2) : (c3 > c4 ? c3 : c4);
        System.out.println("Largest of 4: " + max4);

        // 4. LARGEST OF 5 NUMBERS (Using Math.max)
        int n1 = 5;
        int n2 = 10;
        int n3 = 15;
        int n4 = 20;
        int n5 = 25;
        int large;
        int largest;
        large = Math.max(n1, n2);
        largest = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));
        System.out.println("Largest of 5: " + largest);
    }
}
