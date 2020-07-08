package main.java.incometax;

import java.util.List;

public class USTaxCalculationStrategy extends IncomeTaxSlabCalculation implements TaxCalculationStrategy {

    // class to create UK specific Tax calculation
    // IncomeTaxSlabCalculation class is extended to override calculateSlabCheckpointsAndRules and applySurchargeRulesAfter method for UK specific datapoints

    @Override
    public double calculateTaxableIncome(double CTC, List<Investment> investments) {
        // invoking returnFinalTaxableIncome from IncomeTaxSlabCalculation based on our overrides of
        // calculateSlabCheckpointsAndRules and applySurchargeRulesAfter methods
        return returnFinalTaxableIncome(CTC, investments);

    }

    @Override
    public List<SlabCheckPoint> calculateSlabCheckpointsAndRules() {
        return null;
    }

    @Override
    public double applySurchargeRulesAfter() {
        return 0;
    }
}
