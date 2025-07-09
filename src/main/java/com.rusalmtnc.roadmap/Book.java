package com.rusalmtnc.roadmap;

public class Book {
    String title;
    String author;
    int publicationYear;

    Book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    void printDetails(){
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + publicationYear);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Детство","Горький",1900);
        Book b2 = new Book("Детство","Толстой",1920);

        b1.printDetails();
        b2.printDetails();
    }
}
