public class Invoice extends MusicCDDetails implements Printer{
    private MusicCD CD;
    final int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(MusicCD CD,int quantity, double discountRate, double taxRate) {
        this.CD=CD;
        this.quantity=quantity;
        this.discountRate=discountRate;
        this.taxRate=taxRate;
        this.total=this.CalculateTotal();
    }

    public double CalculateTotal() {
        double price= ((CD.CDprice -(CD.CDprice * (discountRate/100))) *this.quantity);
        double total= price * (1 + (taxRate/100));
        return total;
    }

    @Override
    public void printInvoice() {
        System.out.println(quantity + "x " + CD.CDName + " " +CD.CDprice + "$");
        System.out.println("Discount Rate: " + discountRate);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total:- " + total);
    }

    @Override
    public void CDInformation()
    {
    }
}
