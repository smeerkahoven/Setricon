/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seguridad.utils;

import java.io.Serializable;

/**
 *
 * @author Cheyo
 */
public enum Accion implements Serializable {

    LOGIN("LOGIN"),
    LOGOUT("LOGOUT"),
    ACCESS("ACCESS"),
    SEARCH("SEARCH"),
    TRANSACTION("TRANSACTION"),
    PENDIENTE("PENDIENTE"),
    INSERT("INSERT"),
    CORRECT("CORRECT"),
    DEVOLUCION("DEVOLUCION"),
    EDIT("EDIT"),
    DELETE("DELETE"),
    UPDATE("UPDATE"),
    ANULAR("ANULAR"),
    FINALIZAR("FINALIZAR");

    private final String value;

    private Accion(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
