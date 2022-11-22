public class generateBills {
    int quantity;
    int total;
    priceList price= new priceList();
    String bills="";
    int index=1;
    String customerName;
    long phoneNumber;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void addItems(int value){
        switch (value) {
            case 1:
                System.out.println("tea value added");
                bills=bills+index+"."+"tea:   "+"*"+quantity+"  "+price.getItemPrice("tea")*quantity+"\n";
                index=index+1;
                total=total+price.getItemPrice("tea")*quantity;
                break;

            case 2:
                System.out.println("coffee value added");
                bills=bills+index+"."+"coffee:   "+"*"+quantity+"  " +price.getItemPrice("coffee")*quantity+"\n";
                index=index+1;
                total=total+price.getItemPrice("coffee")*quantity;
                break;
            case 3:
                System.out.println("snacks value added");
                bills=bills+index+"."+"snacks:   "+"*"+quantity+ "  " +price.getItemPrice("snacks")*quantity+"\n";
                index=index+1;
                total=total+price.getItemPrice("snacks")*quantity;
                break;
            case 4:
                System.out.println("idli value added");
                bills=bills+index+"."+"idli:   "+"*"+quantity+"  " +price.getItemPrice("idli")*quantity+"\n";
                System.out.println(bills);
                index=index+1;
                total=total+price.getItemPrice("idli")*quantity;
                break;
            case 5:
                System.out.println("dosha value added");
                bills=bills+index+"."+"dosha:   "+"*"+quantity +"  "+price.getItemPrice("dosa")*quantity+"\n";
                index=index+1;
                total=total+price.getItemPrice("dosa")*quantity;
                break;
            case 0:
                bills = bills +   "total: "+total+"\n";
        }

    }

}
