package fourth.hw.book;

import fourth.hw.book.Book;
import fourth.hw.book.BookRepository;
import fourth.hw.book.BookService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;



class BookServiceTest {
    @Test
    public void testFindBookId(){
        BookRepository bookRepository = mock(BookRepository.class);
        // используя anyString() программа будет считывать любую строчку, заглушка
        when(bookRepository.findById(anyString())).thenReturn(new Book("1"));

        // Используем метод для поиска. Передаем в этот метод репозиторий, которые ищем информацию.
        BookService bookService = new BookService(bookRepository);
        bookService.findBookById("1");

    }
    @Test
    public void testFindAll(){
        BookRepository bookRepository = mock(BookRepository.class);
        List books = Arrays.asList(
                new Book ("1","Гарри Поттер","Джоан Роулинг"),
                new Book ("2","Зелёная миля","Стивен Кинг"),
                new Book ("3","Шерлок Хомс","Артур Конан Дойл")
        );
        when(bookRepository.findAll(anyString())).thenReturn(books);

        BookService bookService = new BookService(bookRepository);
        assertThat(bookService.findAllBooks("SELECT * FROM books").size()).isEqualTo(3);
    }
    @Test
    public void testFindAllOne(){
        BookRepository bookRepository = mock(BookRepository.class);
        List books = Arrays.asList(
                new Book ("1","Гарри Поттер","Джоан Роулинг"),
                new Book ("2","Зелёная миля","Стивен Кинг"),
                new Book ("3","Шерлок Хомс","Артур Конан Дойл")
        );
        when(bookRepository.findAll("Шерлок Хомс")).thenReturn(books);

        // assertEquals(Object expected, Object actual) Используя этот метод можно сравнить два объекта.
        // Важно указать правильное наименование того, что ищем
        BookService bookService = new BookService(bookRepository);
        List findBook = bookService.findAllBooks("Шерлок Хомс");
        assertEquals(books, findBook);
    }
}