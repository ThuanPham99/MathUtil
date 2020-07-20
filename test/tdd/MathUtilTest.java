/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import static min.util.MathUtil.computeFactorial;
import org.junit.Assert;
import org.junit.Test;



/**
 *
 * @author NT
 */
public class MathUtilTest {
    
    @Test
    public void testSuccessfulCases(){
        Assert.assertEquals(12, computeFactorial(5));
    }
//    @Test(expected =  IllegalArgumentException.class)
//    public void testFailedCases(){
//        computeFactorial(-5);
//    }
    
}
