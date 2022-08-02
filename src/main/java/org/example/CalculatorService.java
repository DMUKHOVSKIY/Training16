package org.example;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements Calculator {

    @Override
    public double calc(double a, double b, int operation) {
        switch (operation) {
            case 1:
                return a + b;
            case 2:
                return a - b;
            case 3:
                return a * b;
            case 4:
                return a / b;
        }
        return 0;
    }
}
