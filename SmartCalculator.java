import java.util.Scanner;

public class SmartCalculator {
    public static float num1,num2,result;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int wh;
        String ch;
        System.out.println("======**** Smart Calculator ****======");
        while(true){
            System.out.print("Enter Num1 : ");
            num1=sc.nextFloat();
            System.out.print("Enter Num2 : ");
            num2=sc.nextFloat();
            System.out.println("------------------------------------------------");
            System.out.println("+\n-\n*\n/\nExit");
            System.out.print("select the operation : ");
            ch=sc.next();
            switch (ch){
                case "+":result=num1+num2;
                break;
                case "-":result=num1-num2;
                break;
                case "*":result=num1*num2;
                break;
                case "/":
                    try{
                        result=num1/num2;
                    }catch(ArithmeticException e){
                        e.setStackTrace(e.getStackTrace());
                        System.out.println("Number is not divided by Zero");
                    }break;
                case "Exit":break;
                default: System.out.println("Enter Valid Input");
            }
            System.out.println("Result = "+result);
            System.out.print("If you want to perform another Calculation if yes then press 1 otherwise 0 : ");
            wh=sc.nextInt();
            if(wh==0){
                break;
            }
            System.out.println("------------------------------------------------");
        }
    }
}
