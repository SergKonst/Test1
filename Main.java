import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение (например 1 + 2 или V * III):");
        String xxx = scanner.nextLine();
        String[] subStr;
        String delimeter = " "; 
        subStr = xxx.split(delimeter); 
        for (int i = 0; i < subStr.length; i++) {

        }

        int rim1=0;
        int rim2=0;
        int a=0;
        int b=0;
        switch (subStr[0]) {
            case "I":
                a = 1;
                rim1=1;
                break;
            case "II":
                a = 2;
                rim1=1;
                break;
            case "III":
                a = 3;
                rim1=1;
                break;
            case "IV":
                a = 4;
                rim1=1;
                break;
            case "V":
                a = 5;
                rim1=1;
                break;
            case "VI":
                a = 6;
                rim1=1;
                break;
            case "VII":
                a = 7;
                rim1=1;
                break;
            case "VIII":
                a = 8;
                rim1=1;
                break;
            case "IX":
                a = 9;
                rim1=1;
                break;
            case "X":
                a = 10;
                rim1=1;
                break;
            default:
                rim1=0;
                a = Integer.parseInt(subStr[0]);}


        switch (subStr[2]) {
            case "I":
                b = 1;
                rim2=1;
                break;
            case "II":
                b = 2;
                rim2=1;
                break;
            case "III":
                b = 3;
                rim2=1;
                break;
            case "IV":
                b = 4;
                rim2=1;
                break;
            case "V":
                b = 5;
                rim2=1;
                break;
            case "VI":
                b = 6;
                rim2=1;
                break;
            case "VII":
                b = 7;
                rim2=1;
                break;
            case "VIII":
                b = 8;
                rim2=1;
                break;
            case "IX":
                b = 9;
                rim2=1;
                break;
            case "X":
                b = 10;
                rim2=1;
                break;
            default:
                b = Integer.parseInt(subStr[2]);}



        if ((a>10) || (b>10)) {
            System.out.println("Неверное значение.");
            System.exit(0);
        }
            String z = subStr[1];

            int res = 0;
            switch (z) {
                case "+":
                    res = a + b;
                    break;
                case "-":
                    res = a - b;
                    break;
                case "*":
                    res = a * b;
                    break;
                case "/":
                    res = a / b;
                    break;
                default:
                    System.out.println("Неверная операция.");
                    System.exit(0);
            }

        if (rim1!=rim2) {

            System.out.println("Неверное значение");
            System.exit(0);
        }
        if ((rim1==1)&&(rim2==1)){
          

            switch (res) {
                case 0:
                    System.out.println("Неверное значение");
                    break;
                case 100:
                    System.out.println("Результат: "+ "C");
                    break;

                default:

                    int os50 = res%50;

                   if (res/50 == 1) {
                       System.out.print("L");

                       switch (os50/10) {
                           case 1:
                               System.out.print("X");
                               break;
                           case 2:
                               System.out.print("XX");
                               break;
                           case 3:
                               System.out.print("XXX");
                               break;
                           case 4:
                               System.out.print("XL");
                               break;
                           default:
                               System.out.println();
                               System.exit(0);
                       }
                       int ed = os50%10;

                               switch (os50%10) {
                                   case 1:
                                       System.out.print("I");
                                       break;
                                   case 2:
                                       System.out.print("II");
                                       break;
                                   case 3:
                                       System.out.print("III");
                                       break;
                                   case 4:
                                       System.out.print("IV");
                                       break;
                                   case 5:
                                       System.out.print("V");
                                       break;
                                   case 6:
                                       System.out.print("VI");
                                       break;
                                   case 7:
                                       System.out.print("VII");
                                       break;
                                   case 8:
                                       System.out.print("VIII");
                                       break;
                                   case 9:
                                       System.out.print("IX");
                                       break;
                                   default:
                                       System.out.println();
                                       System.exit(0);

                               }

                   } else {

                       switch (os50/10) {
                           case 1:
                               System.out.print("X");
                               break;
                           case 2:
                               System.out.print("XX");
                               break;
                           case 3:
                               System.out.print("XXX");
                               break;
                           case 4:
                               System.out.print("XL");
                               break;
                           default:
                               System.out.println("!!!");
                               System.exit(0);
                       }
                       int ed = os50%10;

                       switch (os50%10) {
                           case 1:
                               System.out.print("I");
                               break;
                           case 2:
                               System.out.print("II");
                               break;
                           case 3:
                               System.out.print("III");
                               break;
                           case 4:
                               System.out.print("IV");
                               break;
                           case 5:
                               System.out.print("V");
                               break;
                           case 6:
                               System.out.print("VI");
                               break;
                           case 7:
                               System.out.print("VII");
                               break;
                           case 8:
                               System.out.print("VIII");
                               break;
                           case 9:
                               System.out.print("IX");
                               break;
                           default:
                               System.out.println("!!!");
                               System.exit(0);

                       }


                   }

                    System.out.println ();
                           

            }


        }
         else{
            System.out.println("Результат: "+ res);
        }



        }

    }

