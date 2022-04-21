package com.tvad.tvaadinfront.books;

import com.tvad.tvaadinfront.books.domain.Book;
import com.tvad.tvaadinfront.books.service.BookService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import com.vaadin.flow.component.notification.Notification;

@Route
public class MainView extends VerticalLayout {

    private BookService bookService = BookService.getInstance();
    private Grid<Book> grid = new Grid<>(Book.class);

    public MainView() {
        grid.setColumns("title", "author", "publicationYear", "type");
        add(grid);
        setSizeFull();
        refresh();

    }

    public void refresh() {
        grid.setItems(bookService.getBooks());
    }
}
