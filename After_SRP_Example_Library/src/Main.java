public class Main {
    public static void main(String[] args) {
        // Membuat objek Book
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        // Membuat objek InventoryManager dengan stok 5
        InventoryManager inventory = new InventoryManager(5);

        // Membuat objek BookDisplay untuk menampilkan informasi buku
        BookDisplay display = new BookDisplay();

        // Menampilkan informasi buku
        display.displayBookInfo(book, inventory);

        // Meminjam buku
        System.out.println("\nAttempting to loan a book...");
        inventory.loanBook();
        display.displayBookInfo(book, inventory);

        // Mengembalikan buku
        System.out.println("\nReturning the book...");
        inventory.returnBook();
        display.displayBookInfo(book, inventory);
    }
}


