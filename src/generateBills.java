public class generateBills {
    int total;
    priceList price= new priceList();
    String bills="";
    int index=1;



    public void addItems(int value){
        switch (value) {
            case 1:
                System.out.println("tea value added");
                bills=bills+index+"tea:   "+"."+price.getItemPrice("tea")+"\n";
                index=index+1;
                total=total+price.getItemPrice("tea");
                break;

            case 2:
                System.out.println("coffee value added");
                bills=bills+"."+index+"coffee:   "+price.getItemPrice("coffee")+"\n";
                index=index+1;
                total=total+price.getItemPrice("coffee");
                break;
            case 3:
                System.out.println("snacks value added");
                bills=bills+"."+index+"snacks:   "+price.getItemPrice("snacks")+"\n";
                index=index+1;
                total=total+price.getItemPrice("snacks");
                break;
            case 4:
                System.out.println("idli value added");
                bills=bills+"."+index+"idli:   "+price.getItemPrice("idli")+"\n";
                System.out.println(bills);
                index=index+1;
                total=total+price.getItemPrice("idli");
                break;
            case 5:
                System.out.println("dosha value added");
                bills=bills+"."+index+"dosha:   "+price.getItemPrice("dosa")+"\n";
                index=index+1;
                total=total+price.getItemPrice("dosa");
                break;
            case 0:
                bills = bills +   "total: "+total+"\n";
        }

    }

}
