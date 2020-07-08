package main.java.incometax;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaxStrategyHandler {

    // Strategy handler class to exceute implementation of the TaxCalculation based on "country" value
    // in calculate() method , along with CTC,investments

    private USTaxCalculationStrategy usTaxCalculationStrategy = new USTaxCalculationStrategy();
    private UKTaxCalculationStrategy ukTaxCalculationStrategy = new UKTaxCalculationStrategy();

    public double calculate(String country, double CTC, List<Investment> investments) {
        Map<String, TaxCalculationStrategy> taxLogicByCountryMap = new HashMap<>();
        taxLogicByCountryMap.put("US", usTaxCalculationStrategy);
        taxLogicByCountryMap.put("UK", ukTaxCalculationStrategy);

        // based on what country value is passed , we get that particular object ref value to execute
        // its calculateTaxableIncome(CTC,investments) method
        return taxLogicByCountryMap.get(country).calculateTaxableIncome(CTC, investments);
    }

}
