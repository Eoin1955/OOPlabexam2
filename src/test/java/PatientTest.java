import ie.atu.OOPexam2.Patient;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.w3c.dom.css.Counter;


import java.util.Scanner;

import static org.junit.Assert.*;

public class PatientTest {
    @BeforeEach
    void setUp(){
       String FirstName = new Patient().toString();
    }
    @Test
    void NameTest(){

        assertEquals("Name should be greater then 3", 3, FirstName);
        assertTrue(FirstName>3);
        //Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {});
        //assertEquals("Name must be greater than 3", exMessage.getMessage());
    }
    @Test
    void AgeTest(){

        assertNotEquals();
    }

}
