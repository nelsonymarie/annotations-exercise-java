//import java.util.ArrayList;
//import java.util.List;
//
//public class Author extends Person {
//    private List<String> books;
//
//    public Author(String firstName, String lastName) {
//        super(firstName, lastName);
//        books = new ArrayList<>();
//    }
//
//    public List<String> publishedBooks() {
//        return books;
//    }
//
//    public void addBook(String book) {
//        books.add(book);
//    }
//
//    @Override
//    public java.lang.String sortName() {
//        return String.format("%s, %s", lastName, firstName);
//    }
//}


/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    @SuppressWarnings("unchecked") // Suppresses unchecked operation warning
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated(since = "version") Use publishedBooks instead // Deprecation annotation with version included
     */
    @Deprecated(since = "2.0")
    public List<String> getBooks() {
        return books;
    }

    @Override // Override annotation for clarity
    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
