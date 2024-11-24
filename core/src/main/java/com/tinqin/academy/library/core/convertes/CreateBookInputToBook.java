package com.tinqin.academy.library.core.convertes;


import com.tinqin.academy.library.api.models.book.BookModel;
import com.tinqin.academy.library.api.operations.createbook.CreateBookInput;
import com.tinqin.academy.library.persistence.models.Book;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CreateBookInputToBook  implements Converter<CreateBookInput, Book > {

    @Override
    public Book convert(CreateBookInput source) {
        return Book
                .builder()
                .title(source.getTitle())
             //   .author(source.getAuthor())
                .pages(source.getPages())
                .price(source.getPrice())
                .pricePerRental(source.getPrice())
                .stock(0)
                .isDeleted(false)
                .build();
    }
}