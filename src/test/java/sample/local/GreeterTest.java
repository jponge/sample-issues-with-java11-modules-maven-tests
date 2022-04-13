package sample.local;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    @Test
    void check() {
        assertEquals("Hello Julien", Greeter.greet("Julien"));
    }
}