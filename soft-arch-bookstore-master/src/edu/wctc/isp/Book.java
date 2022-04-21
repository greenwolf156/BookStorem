package edu.wctc.isp;

import java.time.Duration;
import java.time.LocalDate;

public interface Book extends Product {

    String getAuthor();

//    double getCost();

//    String getFormattedReleaseDate();

    String getISBN();

    int getPages();

//    int getQuantityOnHand();

//    LocalDate getReleaseDate();

//    String getTitle();

//    void order(int quantity);
}
