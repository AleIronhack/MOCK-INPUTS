import org.example.Main;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;


public class MainTest {



    @Test
    void validate_inputCheck() {
        Scanner keyboard = mock(Scanner.class);
        when(keyboard.nextLine()).thenReturn("Jose", "");



        assertThrows(IllegalArgumentException.class,() -> Main.inputCheck(keyboard));
        verify(keyboard, times(2)).nextLine();
    }

}
