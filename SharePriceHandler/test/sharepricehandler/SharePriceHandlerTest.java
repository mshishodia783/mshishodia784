/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sharepricehandler;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *@author msin63
 * 
 * This class is used execute the test cases of sharePriceHandler file.
 * 
 */
public class SharePriceHandlerTest {

    SharePriceHandler sharePriceHandler;

    public SharePriceHandlerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
       
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        sharePriceHandler = new SharePriceHandler();
     

    }

    @After
    public void tearDown() {
        sharePriceHandler=null;
    }

    /**
     * Test of loadCompanies method, of class SharePriceHandler.
     */
    @Test
    public void testLoadCompanies() throws Exception {
        System.out.println("loadCompanies");
         sharePriceHandler.loadCompanies();

    }

    /**
     * Test of processCompanies method, of class SharePriceHandler.
     */
    @Test
    public void testProcessCompanies() {
        System.out.println("processCompanies");
        sharePriceHandler.processCompanies();

    }

    /**
     * Test of main method, of class SharePriceHandler.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        sharePriceHandler.main(args);

    }

}
