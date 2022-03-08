public class MusicCDUI {
    public static void main(String [] args) {
        MusicCD CD=new MusicCD("Saregama",1946, 6000, "Lata Mangeshkar");

        Invoice invoice=new Invoice(CD,3,10.0,6.0);

        invoice.printMusicCDData(CD);
        invoice.CalculateTotal();
        invoice.printInvoice();


        InvoicePersistence invoicePersistence=new InvoicePersistence(invoice);
        invoicePersistence.saveToDatabase();
        invoicePersistence.savetoFile();
    }
}
