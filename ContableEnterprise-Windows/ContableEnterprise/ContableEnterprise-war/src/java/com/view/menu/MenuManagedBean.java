/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.menu;

import com.security.SessionUtils;
import com.view.login.LoginManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Cheyo
 */
@Named(value = "menu")
@RequestScoped
public class MenuManagedBean implements Serializable {


    private String errorMessage;

    private ArrayList<Menu> menuList;

    /**
     * Creates a new instance of MenuManagedBean
     */
    public MenuManagedBean() {
        menuList = (ArrayList<Menu>) SessionUtils.getSession(SessionUtils.SESION_MENU);
        if (menuList == null || menuList.isEmpty()) {

        }
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ArrayList<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }
    
    public String navegar(String action){
        System.out.println("Navegar:" +action);
        return action ;
    }

}
