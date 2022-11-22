public class priceList {
    int tea=10;
    int coffee=15;
    int snacks=10;
    int idli=8;
    int dosha=6;

    public priceList() {

    }

    public int getItemPrice(String item) {
        switch (item) {
            case "tea":
                return tea;
            case "coffee":
                return coffee;
            case "snacks":
                return snacks;
            case "idli":
                return idli;
            case "dosa":
                return dosha;
            default :
                return 0;
        }
    }
    public  void listItems(){
        System.out.println("1.tea :"+this.tea);
        System.out.println("2.coffee :"+this.coffee);
        System.out.println("3.snacks :"+this.snacks);
        System.out.println("4.idli :"+this.idli);
        System.out.println("5.dosa :"+this.dosha);
        System.out.println("0.exit");
    }
}
