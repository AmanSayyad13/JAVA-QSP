// class Condition{
//     public static void main(String[]args)
//     {
//         //largest of two no
//         int n1=10;
//         int n2=20;
//         int n =n1>n2?n1:n2;
//         System.out.println(n);
//         // largest of 3 no
        
//             int n1=5;
//             int n2=10;
//             int n3=15;
//             int n = n1>n2?(n1>n3 ? n1:n3):(n2>n3? n2:n3);
//             System.out.println(n);

//         //largest 4 no
//         int n1=50;
//         int n2=10;
//         int n3=15;
//         int n4=20;
//         int n= ( n1>n2?n1:n2)>(n3>n4?n3:n4)?(n1>n2?n1:n2):(n3>n4?n3:n4);
//         System.out.println(n);

//         //largest of 5 no
//         // int n1=5;
//         // int n2=10;
//         // int n3=15;
//         // int n4=20;
//         // int n5=25;
//         // int large;
//         // int largest;
//     }

// }
// class Condition {
//     public static void main(String[] args) {
//         // Your variables
//         int n1 = 5;         
//         int n2 = 10;         
//         int n3 = 15;         
//         int n4 = 20;         
//         int n5 = 25;         
//         int large;         
//         int largest;

//         // Find the largest using Math.max
//         large = Math.max(n1, n2);
//         largest = Math.max(n1, Math.max(n2, Math.max(n3, Math.max(n4, n5))));

//         // Print the result
//         System.out.println("The largest number is: " + largest);
//     }
// }
