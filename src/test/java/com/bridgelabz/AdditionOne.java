package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdditionOne {
    @Test
    public void givenTwoNos_Addition(){
        Additon additon = new Additon();
        int result = additon.addTwoNos();
        Assertions.assertEquals(30,result);
    }
}
