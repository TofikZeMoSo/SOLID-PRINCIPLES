import java.awt.print.Book;

public class MusicCDUI {
    public static void main(String [] args) {
        MusicCD Book=new MusicCD("Saregama",1946, 6000, "Lata Mangeshkar");
        Invoice invoice=new Invoice(Book, 3, 10.0, 6.0);

        Details details=new Details();
        details.printMusicCDData(Book);
        details.printInvoice(invoice);

        SaveInvoice saveInvoice= new DatabasePersistence();
        SaveInvoice saveDetails= new FilePersistence();

        StorageInvoice storageInvoice=new StorageInvoice(saveInvoice);
        storageInvoice.showSaveFiles();
    }
}
