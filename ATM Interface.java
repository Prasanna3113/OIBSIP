import java.util.*;
class user{
    String id,pwd;
    user(String id,String pwd){
        this.id=id;
        this.pwd=pwd;
    }
}
class ATM
{
    Scanner sc=new Scanner(System.in);
    double amount=0;
    public void deposit(){
        System.out.print("\033[36m");
        System.out.println("Enter the amount you want to deposit");
        System.out.print("Amount Rs. ");
        double deposit=sc.nextDouble();
        amount+=deposit;
        System.out.print("\033[32m");
        System.out.println("You've Successfully deposited the amount Rs."+deposit);
    }
    public void withdraw(){
        System.out.print("\033[36m");
        System.out.println("Enter the amount you want to withdraw");
        System.out.print("Amount Rs. ");
        double withdraw=sc.nextDouble();
        if(amount<withdraw){
            System.out.print("\033[31m");
            System.out.println("Insufficient Balance");
        }
        else{
            amount-=withdraw;
            System.out.print("\033[32m");
            System.out.println("You've Successfully withdrawn the amount Rs."+withdraw);
        }
    }
    public void checkbalance(){
        System.out.print("\033[36m");
        System.out.println("Your account balance is : "+amount);
    }
    public void display(){
        System.out.print("\033[35m");
        System.out.println("");
        System.out.println("ATM Menu");
        System.out.println("Select your choice : ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice : ");
        
    }
}
class Task3
{
	public static void main(String[] args) {
        int m=0;
	    Scanner sc=new Scanner(System.in);
	    ATM atm=new ATM();
        System.out.print("\033[33m");
	    System.out.println("******************************************************************");
        System.out.print("\033[34m");
	    System.out.println("                 Welcome to ATM Interface");
        System.out.print("\033[33m");
	    System.out.println("******************************************************************");
	    List<user> account= new LinkedList<user>();
	    while(true){
            System.out.print("\033[35m");
	        System.out.println("");
    	    System.out.println("Select your choice : ");
            System.out.println("1.Create an Account ");
            System.out.println("2.Login");
            System.out.println("3.Exit");
            System.out.print("Enter your choice : ");
            int x=sc.nextInt();
            System.out.println("");
            switch(x){
                case 1:
                    System.out.print("\033[36m");
                    System.out.print("Create your UserId : ");
            	    String userid=sc.next();
                    System.out.print("Create your Pin : ");
                    String pin=sc.next();
                    user u=new user(userid,pin);
                    account.add(u);
                    System.out.print("\033[32m");
                    System.out.println("Congratulations!! You've created an account Successfully");
                    break;
                case 2:
                    System.out.print("\033[36m");
                    System.out.print("Enter your UserId : ");
            	    String userid1=sc.next();
                    System.out.print("Enter your Pin : ");
                    String pin1=sc.next();
                    for(int i=0;i<account.size();i++){
                        if(userid1.equals(account.get(i).id) && pin1.equals(account.get(i).pwd))
                        {
                            m++;
                            System.out.print("\033[32m");
                            System.out.println("You've logged in successfully");
                            int n;
                            do{
                                atm.display();
                                n=sc.nextInt();
                                System.out.println("");
                                switch(n){
                                    case 1:
                                        atm.deposit();
                                        break;
                                    case 2:
                                        atm.withdraw();
                                        break;
                                    case 3:
                                        atm.checkbalance();
                                        break;
                                    case 4:
                                        break;
                                }
                            }while(n!=4);
                        }
                        else if(i<account.size() && m==0){
                            System.out.print("\033[31m");
                            System.out.println("You've entered wrong Userid or Pin, Try again");
                       }
                    }
                break;
                case 3:
                    System.out.print("\033[34m");
                    System.out.println("Thanks for using ATM Interface");
                    sc.close();
                    System.exit(0);
                    break;
            }
        }       
	}
}

