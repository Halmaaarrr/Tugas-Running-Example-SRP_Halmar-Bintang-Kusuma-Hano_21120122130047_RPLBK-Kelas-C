public class InventoryManager {
    private int stock;

    public InventoryManager(int stock) {
        this.stock = stock;
    }

    // Mengurangi stok saat buku dipinjam
    public void loanBook() {
        if (stock > 0) {
            stock--;
            System.out.println("Book loaned successfully.");
        } else {
            System.out.println("Book out of stock.");
        }
    }

    // Menambah stok buku saat dikembalikan
    public void returnBook() {
        stock++;
        System.out.println("Book returned successfully.");
    }

    public int getStock() {
        return stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}

