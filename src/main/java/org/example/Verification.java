package org.example;

import org.springframework.stereotype.Component;


@Component
public class Verification {
    private ConsoleReader consoleReader;

    public Verification(ConsoleReader consoleReader) {
        this.consoleReader = consoleReader;
    }

    public double verifyNumber() {
        while (true) {
            try {
                return Double.parseDouble(consoleReader.read());
            } catch (NumberFormatException e) {
                System.out.println("Enter the NUMBER!");
            }
        }
    }

    public int verifyOperation() {
        while (true) {
            try {
                int operation = Integer.parseInt(consoleReader.read());
                if (operation < 1 || operation > 4)
                    throw new Exception();
                return operation;
            } catch (Exception e) {
                System.out.println("Enter correct NUMBER OF OPERATION!!!");
            }
        }
    }

    public boolean verifyCalculation() {
        String answer = consoleReader.read();
        while (true) {
            if (answer.equals("Yes"))
                return true;
            else if (answer.equals("No"))
                return false;
            else {
                System.out.println("Enter correct answer!");
                return verifyCalculation();
            }

        }
    }
}
