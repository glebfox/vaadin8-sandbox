package com.glebfox.vaadin;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@Theme("valo-ext")
public class MainUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        Label lbl = new Label("Hello vaadin");
        setContent(lbl);
    }
}
