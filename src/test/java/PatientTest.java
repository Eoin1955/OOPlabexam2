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

    }
    @Test
    void AgeTest(){
        assertEquals("Age is >= 0 and <= 120", 5, 9);
    }

    @Test
    void FamilyNameTest(){
        assertEquals("Family name is 3 minimum characters.", 6, 6);
    }

    @Test
    void HSENumTest(){
        assertEquals("HSE Number is 10 numbers", 10, 10);
    }

}
