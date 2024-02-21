package ru.gb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gb.Book;

/**
 * Класс описывает взаимодействие с хранилищем книг
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
