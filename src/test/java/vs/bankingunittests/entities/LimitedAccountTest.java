package vs.bankingunittests.entities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vs.bankingunittests.controller.ATM;
import vs.bankingunittests.exceptions.InsufficientFundsException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LimitedAccountTest {
    LimitedAccount limited;

    @BeforeEach
    void init() {
        limited = new LimitedAccount("mixos", 300, "limit", 500);
    }

    @Test
    @DisplayName("Set limit")
    void set_limit_test() {
        int newLimit = 1000;

        limited.setLimit(newLimit);
        int expected = 1000;

        assertEquals(limited.getLimit(), expected);
    }
}
