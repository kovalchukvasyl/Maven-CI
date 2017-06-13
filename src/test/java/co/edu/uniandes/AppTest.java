package co.edu.uniandes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void test1() {
        String str = "Vasyl";
        Assert.assertEquals(str.length(),5);
    }

    @Test
    public void test2() {
        double x = 10/2;
        Assert.assertEquals(x,5.0);
    }
}