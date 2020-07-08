package main.java.incometax;

import java.util.List;

public interface TaxCalculationStrategy {

    // since each country logic may differ a TaxCalculationStrategy interface defines a common method
    // that accepts CTC and list of investments
    double calculateTaxableIncome(double CTC, List<Investment> investments);
}
