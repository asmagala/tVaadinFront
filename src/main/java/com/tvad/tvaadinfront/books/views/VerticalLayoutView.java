package com.tvad.tvaadinfront.books.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("vertical-layout")
public class VerticalLayoutView extends VerticalLayout {
    public VerticalLayoutView() {
        var toolbar = new Toolbar();
        add(
                toolbar,
                new Paragraph("Paragraph 1"),
                new Paragraph("Paragraph 2"),
                new Button("Button")
        );
    }
}
