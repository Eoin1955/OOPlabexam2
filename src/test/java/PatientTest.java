import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.w3c.dom.css.Counter;


import java.util.Scanner;

import static org.junit.Assert.*;

public class PatientTest {
    Scanner scan;
    @BeforeEach
    public void setUp(){
        scan = new Scanner(System.in);

    }

    @AfterEach
    public void closeUp(){
        scan.close();
    }

    @Test
    void NameTest(){
        Exception exMessage = assertThrows(IllegalArgumentException.class, () -> {});
        assertEquals("Name must be greater than 3", exMessage.getMessage());
    }

}
