package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {
    @Test
    public void testAgeUserAblePlayGame() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.isUserAdult(19), "valid Age User is not able for playing game");
    }
    @Test
    public void testAgeUserCantPlayGame(){
        AgeChecker ageChecker =new AgeChecker();
        Assert.assertFalse(ageChecker.isUserAdult(17),"not valid Age User is able for playing game ");
    }
}
