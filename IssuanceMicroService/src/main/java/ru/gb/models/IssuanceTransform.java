package ru.gb.models;

import lombok.Data;
import ru.gb.Book;
import ru.gb.Reader;

import java.time.LocalDateTime;

@Data
public class IssuanceTransform {
    private Long id;
    private Book book;
    private Reader reader;
    private LocalDateTime issuance_at;
    private LocalDateTime returned_at;
}
