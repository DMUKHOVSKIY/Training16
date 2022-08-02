package org.example;

import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component
public class ConsoleApplication {
    private static final String NUM1 = "Enter the 1 number:";
    private static final String NUM2 = "Enter the 2 number:";
    private static final String OPERATION = "Enter the number of operation:" +
            "\n1)sum" +
            "\n2)diff" +
            "\n3)comp" +
            "\n4)div";
    private static final String WORK = "Do you want to continue?(Write Yes/No)";

    private Calculator calculatorImpl;
    private ConsoleWriter consoleWriter;
    private ConsoleReader consoleReader;
    private Verification verification;


    public ConsoleApplication(Calculator calculatorImpl, ConsoleWriter consoleWriter, ConsoleReader consoleReader, Verification verification) {
        this.calculatorImpl = calculatorImpl;
        this.consoleWriter = consoleWriter;
        this.consoleReader = consoleReader;
        this.verification = verification;
    }

    public void start() {
        do {
            consoleWriter.write(NUM1);
            double a = verification.verifyNumber();
            consoleWriter.write(NUM2);
            double b = verification.verifyNumber();
            consoleWriter.write(OPERATION);
            int operation = verification.verifyOperation();
            System.out.println(calculatorImpl.calc(a, b, operation));
            consoleWriter.write(WORK);
        } while (verification.calculate());
    }


}
