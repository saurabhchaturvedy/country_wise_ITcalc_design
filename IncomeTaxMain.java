package main.java.incometax;

import java.util.ArrayList;
import java.util.List;

public class IncomeTaxMain {

    public static void main(String[] args) {
        // sample client to invoke the IT calculation

        double CTC = 900000.00;
        String country = "US";
        List<Investment> investmentList = new ArrayList<>();
        investmentList.add(new Section80CInvestments());
        // more investments you can add

        TaxStrategyHandler taxStrategyHandler = new TaxStrategyHandler();
        // strategy executes as per the country value input
        taxStrategyHandler.calculate(country, CTC, investmentList);
    }
}
