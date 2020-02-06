package org.jalasoft;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * BankTests
 */
public class BankTests {

    @Test
    public void createNewAccount() {
        // Arrange
        Bank bank = new Bank();
        
        // Act
        int accountZero = bank.newAccount();
        int accountOne = bank.newAccount();
        int accountTwo = bank.newAccount();
        int accountThree = bank.newAccount();

        // Aseert
        assertEquals(accountZero, 0);
        assertEquals(accountOne, 1);
        assertEquals(accountTwo, 2);
        assertEquals(accountThree, 3);

    }

    @Test
    public void depositAmountToAccount() {
        // Arrange
        Bank bank = new Bank();
        int accountZero = bank.newAccount();

        // Act
        boolean result = bank.deposit(accountZero, 100);

        // Assert
        assertTrue(result);
        assertEquals(100, bank.getBalance(accountZero));
    }
}