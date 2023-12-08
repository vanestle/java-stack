public class StackList {
    
    public static void main(String[] args) {
        TugasStack books = new TugasStack();
        books.push("Novel");
        books.push("Cerpen");
        books.push("Majalah");
        books.push("Kamus");
        books.push("Komik");
        books.push("Dongeng");
        books.push("Biografi");
        books.push("Antologi");
        books.push("Ensklopedia");
        books.push("Penelitian");
        books.infoStack();
        System.out.println("--------------------");
        
        System.out.println("Popped data: " + books.pop());
        books.infoStack();
        
        // we push new kind of books
        books.push("Diary");
        System.out.println("--------------------");
        books.infoStack();
    }
    
}
