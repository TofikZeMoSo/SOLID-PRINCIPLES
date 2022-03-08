public class InvoicePersistence {

        Invoice invoice;
        public InvoicePersistence(Invoice invoice) {
            this.invoice=invoice;
        }
        public void saveToDatabase() {
            System.out.println("Saving in Database");
        }
        public void savetoFile() {
            System.out.println("Saving in File");
        }
}
