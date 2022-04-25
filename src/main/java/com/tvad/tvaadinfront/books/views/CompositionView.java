package com.tvad.tvaadinfront.books.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("composition")
public class CompositionView extends VerticalLayout {

    public CompositionView() {
        var toolbar = new HorizontalLayout(
                new Button("Button 1"),
                new Button("Button 2"),
                new Button("Button 3")
        );

        add(
                toolbar,
                new Paragraph("Paragraph 1"),
                new Paragraph("Paragraph 2"),
                new Paragraph("Paragraph 3")
        );
    }

}
