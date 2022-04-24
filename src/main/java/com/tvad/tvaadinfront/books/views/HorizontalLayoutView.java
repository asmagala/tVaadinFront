package com.tvad.tvaadinfront.books.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H6;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;

@Route("horizontal-layout")
public class HorizontalLayoutView extends HorizontalLayout {
    public HorizontalLayoutView() {
        add(
                new H6("Horizontal layout"),
                new Paragraph("Paragraph 1"),
                new Paragraph("Paragraph 2"),
                new Button("Button")
        );
    }

}

