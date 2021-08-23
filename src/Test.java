public class Test {
    public static void main(String[] args) {
        SupplierReader ayan = new SupplierReader("Ayan");
        LibrarianAdministrator aidana = new LibrarianAdministrator("Aidana");
        UserAdministrator edil = new UserAdministrator("Edil");


        ayan.takeBook(aidana);
        edil.overdueNotification(ayan);
        aidana.orderBook(ayan);
        ayan.returnBook(aidana);
    }
}