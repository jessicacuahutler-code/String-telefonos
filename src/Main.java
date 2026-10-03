public class Main {
    public static void main(String[] args) {
        // Lista de libros
        SinglyLinkedList<Book> books = new SinglyLinkedList<>();
        books.insertLast(new Book("Clean Code", "Robert C. Martin"));
        books.insertLast(new Book("Effective Java", "Joshua Bloch"));
        books.insertFirst(new Book("Refactoring", "Martin Fowler"));
        books.traverse();
        System.out.println("Existe Clean Code: " + books.contains(new Book("Clean Code", "Robert C. Martin")));
        books.remove(new Book("Clean Code", "Robert C. Martin"));
        books.traverse();

        //Creen una lista de strings
        SinglyLinkedList<String> stringstelefonos =new SinglyLinkedList<>();

        //Añadan 3 strings

        stringstelefonos.insertFirst("Iphone");
        stringstelefonos.insertLast("samsung");
        stringstelefonos.insertLast("hopo");
        //Muestren los 3 strings

        System.out.println("------telefonos------");
        stringstelefonos.traverse();
        //Borren uno
        stringstelefonos.remove("hopo");
        //Volver a mostrar
        System.out.println("----Actualizado------");
        stringstelefonos.traverse();
    }



}
