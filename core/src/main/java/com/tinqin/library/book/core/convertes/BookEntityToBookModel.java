package com.tinqin.library.book.core.convertes;

import com.tinqin.library.book.api.models.book.BookModel;
import com.tinqin.library.book.api.operations.book.getbook.GetBookResult;
import com.tinqin.library.book.persistence.models.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BookEntityToBookModel implements Converter<Book, BookModel> {
    @Override
    public BookModel convert(Book book) {
        return BookModel
                .builder()
                .id(book.getId())
                .title(book.getTitle())
                .pages(book.getPages())
                .price(book.getPrice())
                .pricePerRental(book.getPricePerRental())
                .stock(book.getStock())
                .createdOn(book.getCreatedOn())
                .updatedOn(book.getUpdatedOn())
                .isDeleted(book.getIsDeleted())
                .authors(
                        book.getAuthors()
                                .stream()
                                .map(author -> new GetBookResult.GetBookAuthor(
                                        author.getId().toString(),
                                        author.getFirstName(),
                                        author.getLastName()))
                                .toList()
                )
                .build();
    }
}
