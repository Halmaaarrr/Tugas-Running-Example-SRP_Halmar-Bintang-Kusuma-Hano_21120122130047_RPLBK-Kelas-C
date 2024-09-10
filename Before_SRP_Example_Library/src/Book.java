public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    private int stock;

    public Book(String title, String author, int stock) {
        this.title = title;
        this.author = author;
        this.stock = stock;
        this.isAvailable = stock > 0;
    }

    // Menampilkan informasi buku
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Stock: " + stock);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Mengurangi stok saat buku dipinjam
    public void loanBook() {
        if (stock > 0) {
            stock--;
            isAvailable = stock > 0;
            System.out.println("Book loaned successfully.");
        } else {
            System.out.println("Book out of stock.");
        }
    }

    // Menambah stok buku saat dikembalikan
    public void returnBook() {
        stock++;
        isAvailable = stock > 0;
        System.out.println("Book returned successfully.");
    }
}
