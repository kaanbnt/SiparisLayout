package com.vaadin.menu.ui.views;

import com.vaadin.menu.domain.EnumIcecek;
import com.vaadin.menu.ui.components.MenuButton;
import com.vaadin.menu.ui.components.MenuTextField;
import com.vaadin.menu.ui.components.SaveButton;
import com.vaadin.ui.*;

import java.lang.ref.PhantomReference;

public class AddMenuView extends VerticalLayout {
    private MenuTextField idField;
    private MenuTextField suluYemekField;
    private ComboBox enumCombo;
    private Tree menu;
    private CheckBox checkBoxSalata;
    private SaveButton saveButton;
    private FormLayout formLayout;

    public AddMenuView(){
        buildMenuLayout();
    }

    private void buildMenuLayout() {
        formLayout=new FormLayout();
        addComponent(formLayout);

        idField=new MenuTextField("ID");
        idField.setEnabled(false);
        formLayout.addComponent(idField);

        enumCombo = new ComboBox("İçecek");
        for (EnumIcecek string : EnumIcecek.values()) {
            enumCombo.addItem(string);
        }
        formLayout.addComponent(enumCombo);

        OptionGroup tatli= new OptionGroup("Tatlı");
        tatli.addItems("SÜTLAÇ", "KAZANDİBİ", "BAKLAVA");
        formLayout.addComponent(tatli);

        menu = new Tree();

        menu.addItem("IZGARA");
        menu.addItem("Köfte");
        menu.addItem("Tavuk");
        menu.addItem("SEBZE");
        menu.addItem("Ispanak");
        menu.addItem("Kabak");

        menu.setChildrenAllowed("Köfte", false);
        menu.setParent("Köfte", "IZGARA");
        menu.setChildrenAllowed("Tavuk", false);
        menu.setParent("Tavuk", "IZGARA");
        menu.expandItem("IZGARA"); // Expand programmatically
        menu.expandItem("SEBZE"); // Expand programmatically
        menu.setParent("Ispanak", "SEBZE");
        menu.setParent("Kabak", "SEBZE");
        formLayout.addComponent(menu);

        suluYemekField=new MenuTextField("Sulu Yemek");
        formLayout.addComponent(suluYemekField);

        checkBoxSalata=new CheckBox("Salata Ekle");
        formLayout.addComponent(checkBoxSalata);

        saveButton=new SaveButton();
        formLayout.addComponent(saveButton);

    }
}
