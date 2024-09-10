public class BookDisplay {
    public void displayBookInfo(Book book, InventoryManager inventory) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Stock: " + inventory.getStock());
        System.out.println("Available: " + (inventory.isAvailable() ? "Yes" : "No"));
    }
}

