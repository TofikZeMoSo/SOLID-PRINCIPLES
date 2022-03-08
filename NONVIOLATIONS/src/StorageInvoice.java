public class StorageInvoice {

    final SaveInvoice saveInvoice;
    public StorageInvoice(SaveInvoice saveInvoice)
    {

        this.saveInvoice=saveInvoice;
    }
    public void showSaveFiles()
    {

        saveInvoice.saveDetails();
    }
}

