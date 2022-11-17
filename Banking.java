import java.util.*;

public class Banking {
        
        List<Integer> balance=new ArrayList<>();
        List<String> code1=new ArrayList<>();
        List<String> name1 = new ArrayList<>();
        
        String name;
        
        Scanner scn =new Scanner(System.in);
        
    public void createAccount() {  
        System.out.print("Enter Account Code: "); 
        String code;
        code = scn.next(); 
        if (code1.contains(code)) {
            System.out.println("Code already exists");
            System.out.println("----------------------------------------------");
        }else{
        code1.add(code);
        System.out.print("Enter Name: ");  
        name = scn.next();  
        name1.add(name);
        int bal=0;
        balance.add(bal);
        System.out.println("Account created successfully");
        System.out.println("Name="+name1.get(code1.indexOf(code)));
        System.out.println("Balance="+balance.get(code1.indexOf(code)));
        System.out.println("--------------------------------------------------");
        }
    }  
    public void deposit() { 
        String code;
        int amt, bal;  
        System.out.println("Enter the code:");
        code=scn.nextLine();
        code=scn.nextLine();
        if (code1.contains(code)) {
        System.out.println("Enter the amount you want to deposit: ");  
        amt = scn.nextInt();  
        bal=balance.get(code1.indexOf(code))+amt;
        balance.set(code1.indexOf(code), bal);
        System.out.println("Balance is :"+bal);
            System.out.println("----------------------------------------------");
        }else{
            System.out.println("Enter valid code");
            System.out.println("----------------------------------------------");
        }
        
    }  
    public void withdraw(){
        int amt, bal;
        String code;
        System.out.println("Enter the code");
        code=scn.nextLine();
        code=scn.nextLine();
        if (code1.contains(code)) {
        System.out.println("Enter amount to withdraw");
        amt=scn.nextInt();
        if (amt>balance.get(code1.indexOf(code))) {
            System.out.println("Not enoutgh balance");
        }else{
        bal=balance.get(code1.indexOf(code))-amt;
        balance.set(code1.indexOf(code), bal);
        System.out.println("Balance is:"+bal);
            System.out.println("----------------------------------------------");
        }
        }
        else{
            System.out.println("Enter valid code");
            System.out.println("----------------------------------------------");
        }
    }
    public void balance(){
        String code;
        System.out.println("Enter code");
        code=scn.nextLine();
        code=scn.nextLine();
        if (code1.contains(code)) {
        System.out.println("Welcome"+name1.get(code1.indexOf(code)));
        int bal=balance.get(code1.indexOf(code));
        System.out.println("your balance is:"+bal);
            System.out.println("----------------------------------------------");
        }else{
            System.out.println("Enter valid code");
            System.out.println("----------------------------------------------");
        }
    }
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
        int num;
        Banking B=new Banking();
        while (true) {
            System.out.println("Welcome to Bank");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");
            num=sc.nextInt();
            switch (num) {
                case 1:
                    B.createAccount();
                    break;
                case 2:
                    B.deposit();
                    break;
                case 3:
                    B.withdraw();
                    break;
                case 4:
                    B.balance();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter valid value");
                
            }
        }
    }
}    

