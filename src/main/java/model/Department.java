/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Regmi
 */
public class Department {
    int id;
    String name;
    int numEmployees;
    
    public Department(int id, String name, int numEmployees) {
        this.id = id;
        this.name = name;
        this.numEmployees = numEmployees;
    }
    
    public String getName() {
        return name;
    }
    
    public int getNumEmployees() {
        return numEmployees;
    }
    
    public void setNumEmployees(int i) {
        numEmployees = i;
    }
    
    public int getID() {
        return id;
    }
}
