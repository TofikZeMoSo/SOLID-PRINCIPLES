public class Invoice {

    private MusicCD CD;
    private int quantity;
    private double discountRate;
    private double taxRate;
    private double total;

    public Invoice(MusicCD CD, int quantity, double discountRate, double taxRate)
    {
        this.CD = CD;
        this.quantity = quantity;
        this.discountRate = discountRate;
        this.taxRate = taxRate;
        this.total = this.calculateTotal();
    }

    public double calculateTotal()
    {
        double price = ((CD.CDPrice - (CD.CDPrice * (discountRate/100))) * this.quantity);

        double total = price * (1 + (taxRate/100));

        return total;
    }

    public MusicCD getMusicCD()
    {
        return CD;
    }

    public void setBook(MusicCD CD)
    {
        this.CD = CD;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total)
    {
        this.total = total;
    }
}
