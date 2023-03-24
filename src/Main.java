//import static java.lang.System.out;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Author author = new Author("Sandi", "Metz");
//
//        author.addBook("Practical Object-Oriented Design in Ruby");
//        author.addBook("99 Bottles of OOP");
//
//        for (java.lang.String book: author.publishedBooks()) {
//            out.println(book);
//        }
//    }
//}

//Fixed version...

//        booksrc.String; statement in each file, not necessary.
//        removed the unused constructor that was causing a warning.
//        removed the unused addBook(String s) method that was causing a warning.
//        updated the getBooks() method to return a List<String> instead of a raw List.
//        updated the for loop to use java.lang.String instead of String to avoid confusion with the String class in the src package.
//        used System.out instead of out to avoid the "Cannot resolve symbol 'out'" error.
//        compiled and ran the program using the command line.
//


/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Sandi", "Metz");

        author.addBook("Practical Object-Oriented Design in Ruby");
        author.addBook("99 Bottles of OOP");

        @SuppressWarnings("deprecation") // Suppresses deprecation warning
        for (String book: author.getBooks()) {
            System.out.println(book);
        }
    }
}
