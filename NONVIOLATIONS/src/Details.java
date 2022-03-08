public class Details extends MusicCDDetails implements InvoiceDetails {

    @Override
    public void printInvoice(Invoice invoice)
    {
        System.out.println(invoice.getQuantity() + "x " + invoice.getMusicCD().CDName + " " + invoice.getMusicCD().CDPrice + " $");
        System.out.println("Discount Rate: " + invoice.getDiscountRate());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal() + " $");
    }
}
