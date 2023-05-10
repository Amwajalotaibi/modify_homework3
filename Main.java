import java.util.InputMismatchException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        try{
//        System.out.println(" Enter the names");
//        String name1= scan.nextLine();
//        System.out.println(" Enter anather names");
//        String name2= scan.nextLine();
//        String na= Func(name1,name2);
//            System.out.println(na);
//       } catch (Exception e1){
//           System.out.println( "please Enter Text : " );
//       }

        //..........................................................
//        Scanner scan = new Scanner(System.in);
//        try{
//        System.out.println(" Enter num1");
//        int num1= scan.nextInt();
//        System.out.println(" Enter num2");
//        int num2= scan.nextInt();
//        System.out.println(" Enter num2");
//        int num3= scan.nextInt();
//        int greatnumber = Great(num1,num2,num3);
//        System.out.println(" the great number is : " + greatnumber);
//       }catch (Exception e1){
//           System.out.println(e1.getMessage());
//       }


        //..........................................................
//        Scanner s=new Scanner(System.in);
//        try {
//            System.out.println("Enter the first number");
//            int num1 = s.nextInt();
//            System.out.println("Enter the second number");
//            int num2 = s.nextInt();
//            System.out.println("Enter the third number");
//            int num3 = s.nextInt();
//            String sumnumber = Sum(num1, num2, num3);
//            System.out.println(sumnumber);
//            System.out.println("The sum number is :" + (num1 + num2 + num3));
//            System.out.println("The Average number is :" + (num1 + num2 + num3) / 3);
//        }catch (Exception e1){
//            System.out.println("please Enter the number ");
//        }

        //....................................................

//         Scanner scan = new Scanner(System.in);
//         try{
//         System.out.println("Enter the Operation : ");
//         String Operation = scan.next();
//         int num1 = 20;
//         int num2 = 13;
//         int result = operater(num1, num2, Operation);
//         System.out.println(num1 + " " + Operation + " " + num2 + " = " + result);
//     }catch (Exception e1){
//         System.out.println("please Enter Operater:");
//     }
////..................................................................

//        Scanner s =new Scanner(System.in);
//        try {
//        int array[] = {1, 3, 3, 2, 2, 4};
//        System.out.println("please Enter index:");
//        int n = s.nextInt();
//        System.out.println(array[n]);
//        System.out.println("Good");
//            UniqueNumber(array);
//        }catch (IndexOutOfBoundsException e1){
//            System.out.println(e1.getMessage());
//        }catch (InputMismatchException e2){
//            System.out.println(e2.getMessage());
//        }catch (Exception e3){
//            System.out.println(e3.getMessage());
//        } finally {
//            System.out.println("always run");
//        }
        //..............................................................
//        Scanner S=new Scanner(System.in);
//        try {
//            System.out.println("Enter the text :");
//            String line = S.nextLine();
//            int vowelsCounter = 0;
//
//            for (int i = 0; i < line.length(); i++) {
//                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'o' || line.charAt(i) == 'i' || line.charAt(i) == 'u');
//                 {
//                    vowelsCounter++;
//                }
//            }
//            System.out.println(vowelsCounter);
//        } catch (Exception e1) {
//            System.out.println("Please Enter the Text :");
//        }
        //..............................................................
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
//        int arr[] = new int[size];
//
//    boolean repeat = true;
//
//    while (repeat) {
//
//        System.out.println("\nChoose an option: ");
//        System.out.println("1. Accept elements of an array");
//        System.out.println("2. Display elements of an array");
//        System.out.println("3. Search the element within array");
//        System.out.println("4. Sort the array");
//        System.out.println("5. To Stop");
//
//    }
//
//    int choice = input.nextInt();
//        try{
//    switch (choice) {
//
//        case 1:
//            System.out.println("Enter the elements of the array: ");
//            for (int i = 0; i < size; i++) {
//                arr[i] = input.nextInt();
//            }
//            System.out.println("Elements added successfully.");
//            break;
//
//        case 2:
//            System.out.println("Elements in the array: ");
//            for (int i = 0; i < size; i++) {
//                System.out.print(arr[i] + " ");
//            }
//            System.out.println();
//            break;
//
//        case 3:
//            System.out.println("Enter the element to be searched: ");
//            int searchElement = input.nextInt();
//            boolean found = false;
//            for (int i = 0; i < size; i++) {
//                if (arr[i] == searchElement) {
//                    found = true;
//                    System.out.println("Element found at index " + i);
//                }
//            }
//            if (!found) {
//                System.out.println("Element not found in the array.");
//            }
//            break;
//
//        case 4: // sorting using bubble sort
//            for (int i = 0; i < size - 1; i++) {
//                for (int j = 0; j < size - i - 1; j++) {
//                    if (arr[j] > arr[j + 1]) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j] = temp;
//
//
//                    }
//                    break;
//                }
//            }
//
//
//    }
//}catch (Exception e1){
//    System.out.println(e1.getMessage());
//}



    }
//      public static String Func (String name1 , String name2) {
//  return name1+" "+name2;
//   }

//....................................................................
//      public static int Great(int num1, int num2 ,int num3){
//
//            int max1, max2;
//            max1 = Math.max(num1, num2);
//            max2 = Math.max(max1, num3);
//            return max2;
//        }


     //.............................................................

//         public static String Sum(int num1, int num2 , int num3){
//
//             int sum=num1+num2+num3;
//             int average=(num1+num2+num3)/3 ;
//
//         return sum +"  :  "+ average;
//         }
//    //.................................................................
//    public static int operater (int num1, int num2, String op ){
//    int result=0 ;
//
//        switch (op) {
//            case "+":
//                result = num1 + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                result = num1 / num2;
//                break;
//            case "%":
//                result = num1 % num2;
//                break;
//
//        }
//        return result;
//    }
    //.....................................................
//        public static void UniqueNumber(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            boolean isUnique = true;
//            for (int j = 0; j < array.length; j++) {
//                if (i != j && array[i] == array[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique)
//                System.out.println(array[i] + " ");
//        }
//    }
    //.....................................................
//    public static void Text(String text) {
//        String Text = "The Java is a Simple";
//        System.out.println(Text);
//        String[] s = Text.split(" ");
//        for (int i = 0; i < s.length; i++) {
//            System.out.println(s[i]);
//        }
//    }

}