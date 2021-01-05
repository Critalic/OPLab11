/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labop10;

import java.util.Comparator;

/**
 *
 * @author START
 */
public class ComparatorForMovie implements Comparator <String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
    
}
