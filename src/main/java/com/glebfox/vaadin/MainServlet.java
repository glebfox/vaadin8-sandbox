package com.glebfox.vaadin;

import com.vaadin.server.VaadinServlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

@WebServlet(
        asyncSupported = false,
        urlPatterns = {"/*", "/VAADIN/*"},
        initParams = {
                @WebInitParam(name = "ui", value = "com.glebfox.vaadin.MainUI")
        })
public class MainServlet extends VaadinServlet {
}
