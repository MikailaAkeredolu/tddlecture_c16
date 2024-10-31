import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    public void setUp(){
        phoneBook  = new PhoneBook();
    }


    @Test
    void createPhoneBookWithoutParameters(){

        Assertions.assertTrue(phoneBook.getPhonebook() instanceof HashMap);
    }

    @Test
    void addALLTest(){
        // Arrange
        String name = "Joe";
        String [] phoneNumbers = {
                "302-234-5678",
                "302-756-8900",
                "302-234-5670",
                "302-756-8990"
        };
        // Act
        phoneBook.addAll(name, phoneNumbers);
        List<String> actual =  phoneBook.lookUp(name);
        // Assert
        Assertions.assertEquals(Arrays.asList(phoneNumbers), actual);
    }

}
