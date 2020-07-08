package main.java.incometax;

import java.util.ArrayList;
import java.util.List;

public abstract class IncomeTaxSlabCalculation {

    // Object using Template Method pattern to have a concrete standardized method to calculate IncomeTax

    public double returnFinalTaxableIncome(double CTC, List<Investment> investments)
    {
        int taxableIncome = calculatesTaxableIncomeBasedOnInfoByITFiler(calculateSlabCheckpointsAndRules(),investments,CTC);
        return applySurchargeRulesAfter();
    }

    private int calculatesTaxableIncomeBasedOnInfoByITFiler(List<SlabCheckPoint> calculateSlabCheckpointsAndRules, List<Investment> investments, double ctc){
        return 0;
    }


    // methods needed to be overriden by impl classes to provide values for returnFinalTaxableIncome() method
    abstract public List<SlabCheckPoint> calculateSlabCheckpointsAndRules();


    public abstract double applySurchargeRulesAfter();




}
