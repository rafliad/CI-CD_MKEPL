/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.ci.cdmkepl;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RAFLI
 */
public class CICDMKEPLTest {

    /**
     * Test of add method, of class CICDMKEPL.
     */
    @org.junit.jupiter.api.Test
    public void testAdd() {
        System.out.println("add");
        int a = 2;
        int b = 3;
        int expResult = 5;
        int result = CICDMKEPL.add(a, b);
        assertEquals(expResult, result);
    }
    
}
