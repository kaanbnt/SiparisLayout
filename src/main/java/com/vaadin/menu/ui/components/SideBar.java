package com.vaadin.menu.ui.components;

import com.vaadin.menu.ui.views.AddMenuView;
import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.OptionGroup;
import com.vaadin.ui.VerticalLayout;
import javafx.scene.control.RadioButton;

public class SideBar extends VerticalLayout {

    private Header header;
    private Content content;

    private MenuButton btnMenuButton;

    public SideBar(Header header, Content content) {
        this.header = header;
        this.content = content;

        setSpacing(true);//elementler arası boşuk
        setMargin(true);//her tarafında boşluk

        btnMenuButton = new MenuButton(FontAwesome.PLUS_SQUARE);
        btnMenuButton.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                AddMenuView addMenuView=new AddMenuView();
                content.setContent(addMenuView);
            }
        });
        addComponent(btnMenuButton);
    }
}
