import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        priceList price =new priceList();
        ArrayList<generateBills> bills1 = new ArrayList<generateBills>();
        int choice=1;
        int choice1=1;
        while(choice!=0){
            System.out.println("1.generate bills");
            System.out.println("2.view all transaction");
            System.out.println("0.exit");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter customer name:");
                    String customerName=sc.next();
                    System.out.println("enter the customer phone number:");
                    long customerPhone = sc.nextLong();
                    generateBills bill = null;
                    bill = new generateBills();
                    bill.setCustomerName(customerName);
                    bill.setPhoneNumber(customerPhone);
                    choice1=1;
                    while (choice1 != 0) {
                        price.listItems();
                        choice1 = sc.nextInt();
                        if(choice1!=0){
                            System.out.println("enter the quantity:");
                            int quantity= sc.nextInt();
                            bill.setQuantity(quantity);
                        }else {
                            choice1=0;
                        }
                        bill.addItems(choice1);
                    }
                    bills1.add(bill);
                    Main.viewEmployees(bill);
                    break;
                case 2:
                    Main.viewAllBills(bills1);
                    break;

            }

        }


    }



    public static void viewEmployees(generateBills bill) {
        System.out.println("customer:"+bill.getCustomerName()+ "   phone:"+bill.getPhoneNumber());
        System.out.println(bill.bills);
    }
    private static void viewAllBills(ArrayList<generateBills> bills1) {
        System.out.println(bills1.size());
        for (int i = 0; i < bills1.size(); i++) {
            Main.viewEmployees(bills1.get(i));
        }
    }
}