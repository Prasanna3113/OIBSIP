import java.util.*;
class Task2
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		Random randomNum = new Random();
        int num = randomNum. nextInt(100);
       
        int n,count=0;
        System.out.println("******************************************************************");
        System.out.println("                       Guessing Number Game");
        System.out.println("******************************************************************");
        System.out.println("Instructions :");
        System.out.println("1.A random number is generated.");
        System.out.println("2.You have 10 attempts to crack the number.");
        System.out.println("******************************************************************");
        System.out.println("Guess the number :");
        do{
            n=sc.nextInt();
            count++;
            if(n==num){
                if(count<=10){
                    System.out.println("******************************************************************");
                    System.out.println("congratulations!!! you guessed the number in "+count+" Attempts");
                    System.out.println("******************************************************************");
                    sc.close();
                }
                else{
                    System.out.println("******************************************************************");
                    System.out.println("you have exceeded your limit, Please try again");
                    System.out.println("******************************************************************");
                }
            }
            else if(n<num){
                if(count<=10){
                    System.out.println("Too Low, Try again");
                }
                else{
                    System.out.println("******************************************************************");
                    System.out.println("you have exceeded your limit, Please try again");
                    System.out.println("******************************************************************");
                    break;
                }
                
            }
            else if(n>num){
                if(count<=10){
                    System.out.println("Too High, Try again");
                }
                else{
                    System.out.println("******************************************************************");
                    System.out.println("you have exceeded your limit, Please try again");
                    System.out.println("******************************************************************");
                    break;
                }
            }
        }while(n!=num);
	}
}
