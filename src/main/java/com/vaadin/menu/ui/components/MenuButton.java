package com.vaadin.menu.ui.components;

import com.vaadin.server.FontAwesome;
import com.vaadin.ui.Button;
import com.vaadin.ui.themes.ValoTheme;

import java.awt.*;

public class MenuButton extends Button {

    public MenuButton(FontAwesome fontAwesome){
        setIcon(fontAwesome);
        setWidth(75, Unit.PERCENTAGE);
        addStyleName(ValoTheme.BUTTON_PRIMARY);
    }
}
