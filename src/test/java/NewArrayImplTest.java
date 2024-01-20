package test.java;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.NewArrayImpl;

class NewArrayImplTest {

    @Test
    void givenNoSize_whenNewArrayImplObject_thenReturnLength10() {
        NewArrayImpl nArr = new NewArrayImpl();
        assertEquals(10, nArr.length());
    }

    @Test
    void givenSize_whenNewArrayImplObject_thenReturnArrLength() {
        NewArrayImpl nArr = new NewArrayImpl(10);
        assertEquals(10, nArr.length());
    }

    @Test
    void givenElements_whenNewArrayImplObject_thenReturnElements() {
        NewArrayImpl nArr = new NewArrayImpl(10);
        nArr.add(0, 15);
        nArr.add(3, -20);
        assertEquals(15, nArr.getElement(0));
        assertEquals(-20, nArr.getElement(3));
    }

    @Test
    void givenElementWithIndexOutOfBounds_whenNewArrayImplObject_thenReturnNull() {
        NewArrayImpl nArr = new NewArrayImpl(10);
        nArr.add(-1, 5);
        assertNull(nArr.getElement(-1));
    }

    @Test 
    public void givenArr_whenNewArrayImplObject_thenKeyExists() {
        NewArrayImpl nArr = new NewArrayImpl(3);
        nArr.add(0, 10);
        nArr.add(1, 20);
        nArr.add(2, 30);
        assertTrue(nArr.exists(10));
    }

    @Test 
    public void givenArr_whenNewArrayImplObject_thenKeyDoesNotExist() {
        NewArrayImpl nArr = new NewArrayImpl(3);
        nArr.add(0, 10);
        nArr.add(1, 20);
        nArr.add(2, 30);
        assertFalse(nArr.exists(50));
    }
}
